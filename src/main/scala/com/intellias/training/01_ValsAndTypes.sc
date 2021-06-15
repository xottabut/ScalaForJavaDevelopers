// Everything is expression in Scala
// ";" should not be used

2 * 9

val p = 3.14
// reassignment to val is not allowed
// p = 5

var flexibleP = 3.15
flexibleP = 5

// Type annotation can be added
val stringName = "Ivan"
// java style: String name = "Ivan"
val name: String = "Ivan"


// Types
Byte      // RichByte
Char      // RichChar
Short     // RichShort
Int       // RichInt
Long      // RichLong
Float     // RichFloat
Double    // RichDouble

val num: Int = 65
num.max(500)
num max 500

// Operators
1 + 5
1.+(5)