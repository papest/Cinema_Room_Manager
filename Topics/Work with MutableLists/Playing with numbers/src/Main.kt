fun main() {
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toMutableList()
    numbers.add(0, numbers.sum())
    numbers.removeAt(numbers.lastIndex - 1)
    println(numbers.joinToString(" "))
}