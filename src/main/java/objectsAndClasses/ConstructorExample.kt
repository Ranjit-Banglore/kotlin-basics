package objectsAndClasses

class Employee(val firstName: String, val lastName: String) {

    var isPermanent = true
    var loc = "-"


    constructor(firstName: String, lastName: String, type: Boolean) : this(firstName, lastName) {
        isPermanent = type
    }

    constructor(firstName: String, lastName: String, locValue: String) : this(firstName, lastName, true) {
        loc += locValue
    }

    override fun toString() = "$firstName $lastName (type: $isPermanent) $loc "

}


fun main() {
    println(Employee("Waheed", "Dhar"))
    println(Employee("Dipak", "Kumar", false))
    println(Employee("Ranjit", "Patel", "Berlin"))
}