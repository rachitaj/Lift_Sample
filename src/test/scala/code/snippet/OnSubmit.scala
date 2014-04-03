package code
package snippet

import net.liftweb.http
import net.liftweb.util
import http._
import util.Helpers._
import scala.xml.NodeSeq
import scala.actors.Actor._
import scala.actors.remote.Node
import scala.actors.remote.RemoteActor._
import javax.swing.ImageIcon
import scala.swing.Dialog

/**
 * A snippet that binds behavior, functions,
 * to HTML elements
 */
object OnSubmit extends App {
  def render = {
    // define some variables to put our values into
    var name = ""
    
    // process the form
    def process() {
          
      actor {
            val remoteActor = select(Node("128.237.209.82", 10111), 'ragtime)
                      
            val img = new ImageIcon(name)
            //Dialog.showMessage(message=null,icon=img);
            println(name)

            /*remoteActor !? img
            match {
                case msg => println( "Server's response is [" + msg + "]" )
            }*/
        }
      
    }
    
    // associate each of the form elements
    // with a function... behavior to perform when the
    // for element is submitted
    "name=name" #> SHtml.onSubmit(name = _) & // set the name
    // set the age variable if we can convert to an Int
   // "name=age" #> SHtml.onSubmit(s => asInt(s).foreach(age = _)) &
    // when the form is submitted, process the variable
    "type=submit" #> SHtml.onSubmitUnit(process)
  }
}