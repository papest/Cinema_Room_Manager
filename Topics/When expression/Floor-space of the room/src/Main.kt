import kotlin.math.sqrt

const val PI = 3.14

@SuppressWarnings("MagicNumber")
fun main() {
    println(
        when (readln()) {
            "triangle" -> {
                val a = readln().toDouble()
                val b = readln().toDouble()
                val c = readln().toDouble()
                sqrt((a + b + c) * (a + b - c) * (a - b + c) * (b + c - a) / 16)
            }
            "circle" -> {
                val r = readln().toDouble()
                PI * r * r
            }
            "rectangle" -> readln().toDouble() * readln().toDouble()
            else -> ""
        }
    )
}