package templar

import h4sroutes._

import org.http4s.server.Router
import org.http4s.server.blaze.BlazeServerBuilder
import scalaz.zio.{DefaultRuntime, Task}

//these provided instances needed for talking to cats
import scalaz.zio.interop.catz._
import scalaz.zio.interop.catz.implicits._

//this resolved .orNotFound being not found
import org.http4s.syntax.kleisli._

object H4sServer extends App {

  implicit val runtime: DefaultRuntime = new DefaultRuntime {}

  val serve: Task[Unit] = BlazeServerBuilder[Task]
    .bindHttp(8080, "localhost")
    .withHttpApp(Router("/" -> service/*, "/docs" -> new SwaggerUI[Task](yaml).routes*/).orNotFound)
    .serve
    .compile
    .drain

  runtime.unsafeRun(serve)

}
