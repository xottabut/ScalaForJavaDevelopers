// Few classes in one file - all of them are visible!

// todo: constructor (default, primary, auxiliary)
// todo: no static
/*public*/ class Person(val name: String, age: Int) {

  println(name)

  def introduction: String = s"My name is $name. I'm $age."

}

val p = new Person("Ivan", 30)

p.name
p.introduction

// Objects
object Earth {

  val radius: Int = 6371

  def description: String = s"The radius of the Earth is $radius"

}

// companion object
object Person {
  def apply(): Person = ???
}

// static in Singleton
object Intellias {
  def hire(p: Person) = ???
}

Intellias.hire(p)


