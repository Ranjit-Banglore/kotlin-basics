package functions

fun main() {

    val name = Triple("Ranjit", "Kumar", "Patel")

    val firstName = name.first
    val middleName = name.second
    val lastName = name.third


    println("My name is $firstName $middleName $lastName")

    val (first, middle, last) = Triple("Ranjit", "Kumar", "patel")

    println("My full name- $first $middle $last")
}

