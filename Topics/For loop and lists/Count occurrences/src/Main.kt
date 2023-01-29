fun main() {
    val n = readln().toInt()
    val list = mutableListOf<Int>()
    for (i in 0 until n) {
        list.add(readln().toInt())
    }
    val m = readln().toInt()
    var count = 0
    for (i in 0 until n) {
        if (m == list[i]) {
            ++count
        }
    }
    println(count)
}