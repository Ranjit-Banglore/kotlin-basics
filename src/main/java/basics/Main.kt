package basics

fun main() {
    val a=2
    val b=3

    println("${maxOf(a,b)} is max among { $a , $b}")
}

fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}