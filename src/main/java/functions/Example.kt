package functions

fun greet(name: String, msg: String = "Hello") = println("$msg $name")

fun main() {
    greet("Ranjit")
    greet("Ranjit", "Howdy")
    println("max value is ${max(2, 5, 6, -1)}")
    println("max value in array is ${max(*listOf(1,5,-4,0).toIntArray())}")
}

fun max(vararg numbers: Int): Int {
    var result = Int.MIN_VALUE
    for (number in numbers) {
        result = if (number > result) number else result
    }
    return result
}