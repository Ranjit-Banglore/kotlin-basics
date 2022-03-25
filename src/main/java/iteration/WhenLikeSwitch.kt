package iteration

fun main() {
    //  println(isAlive(false, 3))
    println(whatToDo("Monday"))
    println(whatToDo("Friday"))
    println(whatToDo("Fruday"))
    println(whatToDo(2))
    numberOfCore();
}

fun isAlive(alive: Boolean, numberOfNabours: Int): Boolean {
    if (numberOfNabours < 2) {
        return false
    }
    if (numberOfNabours > 3) {
        return false
    }
    if (numberOfNabours == 3) {
        return true
    }
    return alive && (numberOfNabours == 2)
}

fun isAliveWithWhen(alive: Boolean, num: Int) = when {
    num < 2 -> false
    num > 3 -> false
    num == 3 -> true
    else -> alive && num == 2
}

fun whatToDo(numberOfDay: Any) = when (numberOfDay) {
    "Saturday", "Sunday" -> "relax"
    "Monday", "Tuesday", "Wednesday", "Thursday" -> "work"
    in 2..4 -> "work hard"
    "Friday" -> "Party hard"
    is String -> "What?"
    else -> "no clue"
}

fun numberOfCore() = when (val numberOfCore = Runtime.getRuntime().availableProcessors()) {
    1 -> println("number of core is $numberOfCore. Packing this to museum")
    in 2..16 -> println("number of core is $numberOfCore. Modern computer")
    else -> print("what a machine!! Number of core-$numberOfCore. I want your computer")
}

