package objectsAndClasses

class Vehicle(fuelLevel: Int) {
    var fuelLevel = fuelLevel

}

val myCar = Vehicle(100)

fun main(){
    println(myCar.fuelLevel)
}