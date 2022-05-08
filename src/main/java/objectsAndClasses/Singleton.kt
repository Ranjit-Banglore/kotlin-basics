package `objects$Classes`

object Util {
    val name = "Util"
    var steps = 5
    fun runtimeProcessor() = Runtime.getRuntime().availableProcessors()
    fun addSteps(x: Int) {
        steps += x
    }
}

fun main() {

    val circle = object {
        var radius = 4
        var color = "pink"
    }

    println("circle has radius- ${circle.radius} and it's color is ${circle.color}.")
    println("Number of runtime processor is ${Util.runtimeProcessor()}")
    println("Before:  initialSteps: ${Util.steps}")
    Util.addSteps(5)
    println("After:  initialSteps: ${Util.steps}")
}

