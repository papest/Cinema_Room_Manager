fun main() {
    val number = readln().toInt()
    val range = readln().toInt()..readln().toInt()
    println(number in range)
}