package javaeyes

fun main() {
    println(Runtime.getRuntime().availableProcessors())
    val greet = "hello"
    println(greet)
    println(greet::class)
    println(greet.javaClass)
}