const val SQUARE = 1
const val CIRCLE = 2
const val TRIANGLE = 3
const val RHOMBUS = 4
fun main() {

    val shape = when (readln().toInt()) {
        SQUARE -> "square"
        CIRCLE -> "circle"
        TRIANGLE -> "triangle"
        RHOMBUS -> "rhombus"
        else -> ""
    }

    println(
        if (shape.isEmpty()) {
            "There is no such shape!"
        } else {
            "You have chosen a $shape"
        }

    )

}