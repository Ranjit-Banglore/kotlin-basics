package collections

fun main() {
    val pair = Pair(1, 2)
    println("first value - ${pair.first},second value- ${pair.second} ")

    val cities = listOf("Berlin", "Delhi", "Lund", "Malmo")

    val temperature = cities.map { s -> s to getTemperature(s) }

    for (pair in temperature) {
        println("Tempreture in ${pair.first} is ${pair.second}")
    }
}

fun getTemperature(city: String) = Math.round(Math.random() * 30 + city.length)