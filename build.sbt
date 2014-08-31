name := "project"

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.2"

lazy val data = project in file("modular-play-scala-sbt-data")

lazy val domain = project in file("modular-play-scala-sbt-domain")

lazy val service = project in file("modular-play-scala-sbt-service")

lazy val web = (project in file("modular-play-scala-sbt-web")).enablePlugins(PlayScala).dependsOn(domain, service, data)

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws
)
