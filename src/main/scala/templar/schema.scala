package templar

import r._
import scalaz.zio._

object schema {
    type R = SqlCoords

    //type TaskR[-R, +A] = scalaz.zio.ZIO[R, scala.Throwable, A]
    type UIOR[-R, +A] = ZIO[R, Nothing, A]

    type FEntity = Seq[(String,String)]

    case class Binding(title:String,description:String)
    case class FlatEntity(bindings: Seq[Binding])

    type HtmlString = String
}

object scope {

}