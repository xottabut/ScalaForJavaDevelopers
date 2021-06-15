// val
// apply and unapply
// copy
// equals
// hashCode
// toString

case class Car(model: String, year: Int)

val car = Car("Tesla", 2020)
// todo: copy
// todo: equals vs eq
// todo: apply
// todo: simple pattern matching

// ADT: T1 | T2
sealed trait Person {
  def name: String
}

case class Student(name: String, score: Int) extends Person

case class Teacher(name: String, subject: String) extends Person

case class Aspirant(name: String, subject: String) extends Person