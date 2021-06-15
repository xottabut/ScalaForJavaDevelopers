// List
//1 3 5
//Pair(1, Pair(3, Pair(5, Nil)))

sealed trait List[+T] {
  def head: T

  def tail: List[T]

  def ::[E >: T](elem: E): List[E] = new ::(elem, this)
}

case class ::[+T](head: T, tail: List[T]) extends List[T]

case object Nil extends List[Nothing] {
  override def head = ???

  override def tail = ???
}

val list: List[Int] = ::(1, ::(2, Nil))

//list add_: 5
5 :: list

1 :: 22 :: Nil
Nil.::(22).::(1)

val myList = 1 :: 2 :: Nil
val ::(first, ::(second, Nil)) = myList
val first :: second :: Nil = myList

val first :: second :: Nil = 1 :: 2 :: Nil

myList match {
  case head :: Nil =>
  case head :: tail :: Nil =>
  case Nil =>
}