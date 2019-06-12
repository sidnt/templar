package templar

import tapir._
import schema._

import tapir.json.circe._
import io.circe.generic.auto._

package object endpoints {

  /** give me
    * location of a mysql db
    * and a query to execute on that db
    * that results flat entities
    * and i shall render an html of the them */

  /** there's a dbquery endpoint */
  val dbqueryEndpoint: Endpoint[FlatEntity, String, HtmlString, Nothing] = endpoint
    .post
    .in("render")
    .in(jsonBody[FlatEntity])
    .out(stringBody)
    .errorOut(stringBody)


}
