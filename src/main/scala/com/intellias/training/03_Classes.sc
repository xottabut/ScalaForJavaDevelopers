// Few classes in one file - all of them are visible!

// todo: constructor (default, primary, auxiliary)
// todo: no static
/*public*/ class Person(val name: String, age: Int) {

  println(name)

  def this(name: String) {
    this(name, 5)
  }

  def introduction: String = s"My name is $name. I'm $age."

}

object Person {
  def apply(name: String, age: Int): Person = new Person(name, age)
}

val p = new Person("Ivan", 30)
val p2 = Person("Ivan", 30)

p.name
p.introduction

// Objects
object Earth {

  val radius: Int = 6371

  def description: String = s"The radius of the Earth is $radius"

}

// companion object


// static in Singleton
object Intellias {
  def hire(p: Person) = ???
}

Intellias.hire(p)


