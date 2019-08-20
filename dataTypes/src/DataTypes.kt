fun main() {

    var int: Int
    var double: Double
    var names: String
    val float: Float


    var char: Char
    char = '0'

    int = 1;
    double = int + 2.1 // this only works because of 2.1, if we use a whole number the we would get an error
    names = "John Doe"
    println(names) // John Doe

    names = "Alex Hymn"
    println(names) // Alex Hymn

    // Print String names as array of Chars, more functions to be explore in String lesson
    names.asSequence().iterator().forEach { println(it) }

    float = 3f // Float can oly be assign with digit with postfix f or F
    println("Displaying float $float")
    println("Displaying Double  $double")
//    float = 3.9F  reassigning val values will error because we it's a constant

    println("Int to String ${intToString(int)}")
    println("Float to int ${floatToInt(float)}")
}

fun intToString(int: Int): String{
    return int.toString()
}

fun floatToInt(float: Float) = float.toInt()