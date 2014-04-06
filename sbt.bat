set SCRIPT_DIR=%~dp0
java -XX:+CMSClassUnloadingEnabled -XX:MaxPermSize=256m -Xmx1024M -Xss2M -jar "%SCRIPT_DIR%\sbt-launch-0.12.1.jar" %*

<<<<<<< HEAD
=======
resolvers += Classpaths.typesafeSnapshots

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.1.0-SNAPSHOT")
>>>>>>> b1cae6e71e6c03095fa602042048935883818994
