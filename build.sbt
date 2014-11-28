
name := "scala-appengine"

version := "1.0"

scalaVersion := "2.11.2"

val appengineVersion = "1.9.14"

libraryDependencies ++= Seq(
  "javax.servlet" % "servlet-api" % "2.5" % "provided",
  "org.eclipse.jetty" % "jetty-webapp" % "7.0.2.v20100331" % "container",
  "com.google.appengine" % "appengine-api-1.0-sdk" % appengineVersion,
  "com.google.appengine" % "appengine-api-stubs" % appengineVersion % "test",
  "com.google.appengine" % "appengine-testing" % appengineVersion % "test",
  "org.scalatest" %% "scalatest" % "2.2.2" % "test"
)

appengineSettings