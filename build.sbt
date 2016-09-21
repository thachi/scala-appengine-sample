
name := "scala-sbt-appengine"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "javax.servlet" % "servlet-api" % "2.5" % "provided",
  "org.eclipse.jetty" % "jetty-webapp" % "7.6.21.v20160908" % "container",
  "com.google.appengine" % "appengine-api-1.0-sdk" % "1.9.42",
  "com.google.appengine" % "appengine-api-stubs" % "1.9.42" % "test",
  "com.google.appengine" % "appengine-testing" % "1.9.42" % "test",
  "org.scalatest" %% "scalatest" % "2.2.6" % "test"
)

appengineSettings
