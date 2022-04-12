package collections

fun main() {
    val names = listOf("Ranjit", "Sonu", "Tinku")

    for ((index,name) in names.withIndex()){
        System.out.println("value at index-$index -> $name")
    }
}