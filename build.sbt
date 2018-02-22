import scalariform.formatter.preferences._

organization := "net.yoshinorin"
name := "gatling-sample"
version := "0.1"
scalaVersion := "2.12.4"

libraryDependencies ++= Seq(
  "io.gatling" % "gatling-test-framework" % "2.3.0" % "test",
  "io.gatling.highcharts" % "gatling-charts-highcharts" % "2.3.0" % "test"
)

scalacOptions := Seq(
  "-encoding", "UTF-8", "-target:jvm-1.8", "-deprecation",
  "-feature", "-unchecked", "-language:implicitConversions", "-language:postfixOps"
)

enablePlugins(GatlingPlugin)
