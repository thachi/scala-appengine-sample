
name := "scala-sbt-appengine"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "javax.servlet" % "servlet-api" % "2.5" % "provided",
  "org.eclipse.jetty" % "jetty-webapp" % "7.0.2.v20100331" % "container",
  "com.google.appengine" % "appengine-api-1.0-sdk" % "1.9.25",
  "com.google.appengine" % "appengine-api-stubs" % "1.9.25" % "test",
  "com.google.appengine" % "appengine-testing" % "1.9.25" % "test",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test"
)

appengineSettings
