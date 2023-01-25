fun main() {    
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toMutableList()
    val first = numbers[0]
    numbers[0] = numbers[numbers.lastIndex]
    numbers[numbers.lastIndex] = first
    println(numbers.joinToString(separator = " "))
}