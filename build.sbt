import Dependencies._

ThisBuild / scalaVersion     := "2.12.8"
ThisBuild / version          := "0.0.1"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "templar",
    libraryDependencies ++= Seq(
      scalaTest % Test,
      zio,
      scalatags,
      tapir,
      tapirJsonCirce,
      tapirHttp4sServer,
      tapirAkkaHttpServer,
      zioInteropCats
    )
  )
  .settings(
    scalacOptions += "-Ypartial-unification"
  )
