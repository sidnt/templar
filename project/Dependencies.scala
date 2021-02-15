import sbt._

object Dependencies {

  lazy val scalaTestVersion = "3.0.8"
  lazy val zioVersion = "1.0-RC5"
  lazy val scalatagsVersion = "0.6.7"
  lazy val tapirVersion = "0.8.3"

  lazy val scalaTest = "org.scalatest" %% "scalatest" % scalaTestVersion
  lazy val zio = "org.scalaz" %% "scalaz-zio" % zioVersion
  lazy val zioInteropCats = "org.scalaz" %% "scalaz-zio-interop-cats" % zioVersion
  lazy val scalatags = "com.lihaoyi" %% "scalatags" % scalatagsVersion

  lazy val tapir = "com.softwaremill.tapir" %% "tapir-core" % tapirVersion
  lazy val tapirHttp4sServer = "com.softwaremill.tapir" %% "tapir-http4s-server" % tapirVersion
  lazy val tapirAkkaHttpServer = "com.softwaremill.tapir" %% "tapir-akka-http-server" % tapirVersion
  lazy val tapirJsonCirce = "com.softwaremill.tapir" %% "tapir-json-circe" % tapirVersion


  /** database related dependencies */
  lazy val mysqlJavaVersion = "5.1.47"
  lazy val mysqlJava = "mysql" % "mysql-connector-java" % mysqlJavaVersion 
  /***/

}
