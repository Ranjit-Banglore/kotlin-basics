package basics

fun main() {
    val str= "abcd 123"
    for (c in str){
        println(c)
    }

    println("$str.length is ${str.length}")

    val quote= """
        |Tell me and I forgot.
        |Teach me and I remember.
        |Involve me and I learn.
        |(Benjamin Franklin)
    """.trimIndent()

    println(quote)


}
