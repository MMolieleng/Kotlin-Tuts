import kotlin.random.Random

fun main(args: Array<String>) {
    println(title())

    ifStatement()
    whenStatement()
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
        1-> print("RED")
        2-> print("EMBER")
        3-> print("GREEN")
        else->{
            println("MALFUNCTIONING ROBOTS")
        }
    }
}