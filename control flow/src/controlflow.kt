import java.lang.Integer.parseInt
import kotlin.random.Random

fun main() {

    println(title())
    ifStatement()
    whenStatement()
    whileLoop()
    doWhile()
    forLoop()
}

fun title() {
    println("==".repeat(10))
    println("\n\tCONTROL FLOW\n")
    println("==".repeat(10))
}


fun ifStatement() {

    var num: Int = Random.nextInt(0, 10)

    if (num > 5)
        println("You have won , num = $num")
    else
        println("You have lost , num = $num")

    val x = if (num < 5) {
        num * 40
    } else {
        num + 0
    }
    println("RESULT FROM X is as follows : $x")
}

fun whenStatement() {

    println("\n\nWHEN STATEMENT \n ")
    var gender: Boolean = Random.nextBoolean()

    when (gender) {
        true -> println("MALE")
        false -> println("FEMALE")
    }

    var number = Random.nextInt(1, 5)
    println("=".repeat(10).plus(" ROBOTICS ========="))
    when (number) {
        parseInt("3") -> {
            println("GOT IT : s encodes x")
            println("GREEN")
        }
        1 -> println("RED")
        2 -> println("EMBER")
        else -> {
            println("MALFUNCTIONING ROBOTS")
        }
    }
}

fun whileLoop() {

    var age = 1

    while (age < 10) {
        println("You're young")
        age += 10
    }

    while (age < 50) {
        println("You are not too old")
        age += 50
    }

    while (age >= 50) {
        println("Your days are numbered :(")
        break
    }
}

fun forLoop(){

    print("=".repeat(10).plus("\n\n"))
    for (i in 0..10){
        print(i)
    }

    var people = Array(4) { a-> "John $a"}
    print("\n\n")
    for (person in people){
        print(person.plus(", \t"))
    }

    println("\n\n")
    var numbers = arrayOf("One", "Two", "Three")
    for (number in numbers)
        print(number.plus(", "))

}

fun doWhile(){

    var isAdmin : Boolean
    var count = 0
    do {
        print(count++)
        println(" I am the admin")
        isAdmin = Random.nextBoolean()
    } while (isAdmin)
}