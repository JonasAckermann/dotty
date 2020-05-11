import quoted._
import scala.quoted.staging._

object Test {
  given Toolbox = Toolbox.make(getClass.getClassLoader)
  def main(args: Array[String]): Unit = withQuoteContext {

    val q = '{ (qtx: QuoteContext) ?=>
      val t = '[String]
      t
    }

    println(q.show)
  }
}
