package typesafety

class Animal {
    override fun equals(other: Any?) = other is Animal
}

val dog: Any = Animal()
val cat: Any = Animal()
val todo: Any = "string hai"


fun main() {
    println(dog == cat)
    println(dog === cat)
    println(dog == todo)
}