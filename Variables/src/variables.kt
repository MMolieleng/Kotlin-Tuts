import java.util.*

fun main(args: Array<String>){

    var name = "Username"; // Mutable
    val surname = "Doe" // immutable

    println(name)
    println(surname)

    println(fullNames(name, surname))

    // using numbers / integers
    var num1 = 3 // Declaration
    var num2 = 7 // declarations

    val sum = add(num1, num2) // constant
    println("The sum of $num1 and $num2 is : $sum")
}


fun fullNames(name: String, surname: String): String{
    return "$name $surname"
}

fun add(num1: Int, num2: Int): Int{
    return num1 + num2;
}