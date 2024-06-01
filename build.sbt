Global / onChangedBuildSource := ReloadOnSourceChanges

val scala3Version = "3.5.0-RC1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "Scala 3 Project Template",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    scalacOptions ++= Seq("-language:strictEquality")
  )
