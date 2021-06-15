// val
// apply and unapply
// copy
// equals
// hashCode
// toString

case class Car(model: String, year: Int)

val car = Car("Tesla", 2020)
// todo: copy
car.copy(year = 2021)
// todo: equals vs eq
car == car.copy()
car eq car.copy()
// todo: apply
// todo: simple pattern matching

//val model = car.model
//val year = car.year

val Car(model, year) = car

println(s"Model is $model")

// ADT: T1 | T2
sealed trait Person {
  def name: String
}

case class Student(name: String, score: Int) extends Person

case class Teacher(name: String, subject: String) extends Person

case class Aspirant(name: String, subject: String) extends Person