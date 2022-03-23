package basics

fun main() {

    var a=1
    var message="a is $a"
    println(message)

    a=a+2

    println("${message.replace("is","was")}, but now is $a")
}
