package scalaburr

import contextual._

object pieces {
  object PiecesParser extends Interpolator {
    case class ContextType() extends Context
    type Output = String

    def contextualize(interpolation: StaticInterpolation): Seq[ContextType] = Nil

    def evaluate(interpolation: RuntimeInterpolation): String =
      interpolation.parts.mkString
  }

  implicit class PiecesStringContext(sc: StringContext) {
    val pieces = Prefix(PiecesParser, sc)
  }
}
