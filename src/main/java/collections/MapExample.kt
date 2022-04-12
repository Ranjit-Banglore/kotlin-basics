package collections

fun main() {
    val cities = mapOf(1 to "a", 2 to "b", 3 to "c")

    for (pair in cities) {
        println("${pair.key} --> ${pair.value}")
    }

    for ((key, value) in cities) {
        println("$key --> $value")
    }
}