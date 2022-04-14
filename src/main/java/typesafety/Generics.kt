package typesafety

open class Fruit
class Orange : Fruit()
class Banana : Fruit()

fun printFruits(fruits: List<Fruit>) {
    println("number of fruits is ${fruits.size}")
}

fun main() {
    var oranges: List<Orange> = listOf()
    printFruits(oranges)
}