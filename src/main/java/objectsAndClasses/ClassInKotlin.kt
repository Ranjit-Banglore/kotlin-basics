package objectsAndClasses

class Car(val makeYear: Int, theColor: String) {
    var fuelLevel: Int = 100
    var color = theColor
        set(value) {
            if (value.isBlank()) {
                throw RuntimeException()
            }
        }
}

fun main() {
    //to create object use class name like it is a function
    val myCar = Car(2018, "green")

    println("Previous Car details -- Year: ${myCar.makeYear}, Color: ${myCar.color}, fuelLevel: ${myCar.fuelLevel}")
    //change color to red
    myCar.color = "RED"
    myCar.fuelLevel--

    println("After Car details -- Year: ${myCar.makeYear}, Color: ${myCar.color}, fuelLevel: ${myCar.fuelLevel}")

   // myCar.color = ""
    myCar.fuelLevel--

    println("After Car details -- Year: ${myCar.makeYear}, Color: ${myCar.color}, fuelLevel: ${myCar.fuelLevel}")

}
