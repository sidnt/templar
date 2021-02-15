package templar

import schema._

import scalaz.zio._

package object domainlogics {

  /** the logic for http4s interpreter
    * needs to be of signature `I => F[Either[E, O]]`
    * .
    * input is a flat entity
    * output is its html string representation */
  def dbqueryEndpointLogic(fe:FlatEntity): IO[String, String] = {
    val htmlString: HtmlString = renderers.renderFeHtml(fe).render
    ZIO.succeed(htmlString)
  }

  /*def dbqueryEndpointLogic3(fe:FlatEntity): IO[String, String] = {
    val htmlString: HtmlString = renderers.renderFeHtml(fe).render
    ZIO.succeed(htmlString)
  }

  def dbqueryEndpointLogic2(fe:FlatEntity): UIOR[R,Either[String,String]] = {
    ZIO.succeed(Right(renderers.renderFeHtml(fe).render))
  }*/
}
