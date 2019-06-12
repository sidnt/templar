package templar

import endpoints._
import domainlogics._
import zioh._

import org.http4s.HttpRoutes
import scalaz.zio._
import scalaz.zio.interop.catz._


package object h4sroutes {

  //implicit val x: Http4sServerOptions[IO] = Http4sServerOptions.default
  // the serverOptions: Http4sServerOptions[IO] is a tapir specific thing
  // & fs:Sync[UIO] are missing

  val dbqueryRoute: HttpRoutes[Task] =
    dbqueryEndpoint.toZioRoutes(dbqueryEndpointLogic)

  val service = dbqueryRoute

}
