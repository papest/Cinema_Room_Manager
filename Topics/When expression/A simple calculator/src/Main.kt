fun main() {
    val (first, operation, second) = readln().split(" ")

    println(
        when (operation) {
            "+" -> first.toLong() + second.toLong()
            "-" -> first.toLong() - second.toLong()
            "*" -> first.toLong() * second.toLong()
            "/" ->
                if (second == "0") {
                    "Division by 0!"

                } else {
                    first.toLong() / second.toLong()
                }
            else -> "Unknown operator"
        }
    )
}