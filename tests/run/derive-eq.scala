
case class One() derives Eq
case class Two() derives Eq

implied for Eq[One, Two] = Eq

enum Lst[T] derives Eq {
  case Cons(x: T, xs: Lst[T])
  case Nil()
}

class Triple[S, T, U] derives Eq


object Test extends App {
  implicitly[Eq[Lst[Lst[One]], Lst[Lst[Two]]]]
  implicitly[Eq[Triple[One, One, One],
                Triple[Two, Two, Two]]]

  val x: Triple[List[One], One, Two] = ???
  val y: Triple[List[Two], One, Two] = ???
  assert(x == y)
}
