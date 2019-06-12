/*
package templar.services

import scalatags.Text.all._

object scratch {

    def renderToHtmlString(entity: List[(String,String)]) = {
        val x = for {
          e <- entity
        } yield div(`class`:="kvpair")(
          div(`class`:="title")(e._1),
          div(`class`:="description")(e._2)
          )

        div(`class`:="entity")(x: _ *).render
    }

}


val x: scalatags.Text.TypedTag[String] = html(
      head(
        script("some script")
      ),
      body(
        h1("this is h1"),
        div(
          p("this is first para"),
          p("this is second para")
        )
      )
    )
*/