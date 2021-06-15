// public boolean isEven(int number) {
//   return number % 2 == 0;
// }

def isEven(num: Int) = num % 2 == 0
val isEvenFunction: Int => Boolean = (num: Int) => num % 2 == 0
//val isEvenFunction: Int => Boolean = _ % 2 == 0
//val isEvenFunction: (Int, Int) => Boolean = _ % _ == 0
// show another form

isEven(4)
isEven(7)
isEvenFunction(4)
isEvenFunction(7)

// no need for return statement
def calculateHypotenuse(a: Int, b: Int) = {
  val aS = a * a
  val bS = b * b
  Math.sqrt(aS + bS)
}

val h = calculateHypotenuse(3, 4)

// named and default arguments
def div(a: Int = 0, b: Int = 1) = a / b

div(5, 2)
div(a = 5, b = 2)
div(b = 2, a = 5)
//
div()
div(5)
div(b = 5)

// Unit
def printHi() {
  println("Hi")
}
def printHi(): Unit = {
  println("Hi")
}
