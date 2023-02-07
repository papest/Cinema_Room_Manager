fun main() {
    val readString = readln()
    for (c in readString) {
        if (c.isDigit()) {
            println(c)
            break
        }
    }
}