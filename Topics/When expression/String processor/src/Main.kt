fun main() {
    val string1 = readln()
    val operation = readln()
    val string2 = readln()
    println(
        when (operation) {
            "equals" -> string1 == string2
            "plus" -> string1 + string2
            "endsWith" -> string1.endsWith(string2)
            else -> "Unknown operation"
        }
    )
}