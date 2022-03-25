package iteration

fun main() {
    for (i in (1..100).filter { s -> s % 3 == 0 || s % 5 == 0 }) {
        println(i)
    }

    for (letter in 'a'..'e') {
        println("$letter")
    }

    val array = arrayOf(1, 2, 3, 5, 6)

    for (element in array) {
        print("$element, ")
    }

    val names = listOf("Ranjit", "Vishal", "Shreyansh")

    for (index in names.indices) {
        println("Value at index- $index is ${names.get(index)}")
    }

    for ((i, n) in names.withIndex()) {
        println("value at index- $i is $n")
    }
}