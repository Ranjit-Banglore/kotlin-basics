package javaeyes

fun main() {

    val price = 12.25
    val tax = 0.08

    val amount = "The amount $price after tax is ${price * (1 + tax)}"
    println(amount)

    println(createMemoFor("Ranjit"))
}

fun createMemoFor(name: String): String {
    return """
        | Hello $name,   
        | I am glad to invite you in my birthday party.   
    """.trimIndent()
}
