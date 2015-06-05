lazy val shared = project

lazy val server = project.dependsOn(shared)

lazy val client = project.dependsOn(shared)

lazy val root = project.in(file(".")).aggregate(shared, server, client)

scalaVersion in ThisBuild := "2.11.6"

