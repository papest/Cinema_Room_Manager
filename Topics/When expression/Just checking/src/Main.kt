@SuppressWarnings("MagicNumber")
fun main() {
    val n = readln().toInt()
    println(
        when (n) {
            1, 3, 4 -> "No!"
            2 -> "Yes!"
            else -> "Unknown number"
        }
    )
}