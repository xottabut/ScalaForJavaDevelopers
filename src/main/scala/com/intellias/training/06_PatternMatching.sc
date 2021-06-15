// Pattern matching on Strings
"one" match {
  case x: String => println(x + x)
  case "one1" => println("one")
  case "two" => println("two")
  case "three" => println("three")
  case _ =>
}

// Pattern matching on case classes
sealed trait Person {
  def name: String
}

case class Student(name: String, score: Int) extends Person

case class Teacher(name: String, subject: String) extends Person

case class Aspirant(name: String, subject: String) extends Person

val unknownPerson: Person = Teacher("Ivan", "Math")
//todo simple pattern matching
val res = unknownPerson match {
  case x: Student => ""
  case teacher@Teacher(_, s@"subject") => s
  case teacher@Teacher(_, s) if s == "subject" => s
  case Aspirant(name, subject) => throw new RuntimeException
  case _ =>
}

// Option and Pattern matching on Option classes
// Option
//   Some
//   None
val maybeString: Option[String] = Option("I'm here")

maybeString match {
  case None => println("I'm empty")
  case _ => println("")
}

//  Pattern matching on Lists
// todo: implement your own list before!
val l1 = List(1, 3, 5)
val l2 = 1 :: 3 :: 5 :: Nil

val head :: tail = l1

l2 match {
  case head :: tail => println(s"head is $head")
  case Nil =>
}