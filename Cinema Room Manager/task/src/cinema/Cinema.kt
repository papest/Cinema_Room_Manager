package cinema

const val NUMBER_OF_RAWS = 7
const val TOP_LINE = "  1 2 3 4 5 6 7 8"
const val TITLE ="Cinema:"

fun arrangementOut() {
    println(TITLE)
    println(TOP_LINE)
    for (i in 1..NUMBER_OF_RAWS) {
        println("$i S S S S S S S S")
    }

}
fun calculateProfit() {
    val firstPrice = 10
    val secondPrice = 8
    val price = 10
    val maxSeatsForFirstAlgorithm = 60
    println("Enter the number of rows:")
    val numberOfRaws = readln().toInt()
    println("Enter the number of seats in each row:")
    val numberOfSeats = readln().toInt()
    val totalIncome = if (numberOfRaws * numberOfSeats <= maxSeatsForFirstAlgorithm) {
        numberOfRaws * numberOfSeats * price
    } else {
        numberOfSeats * (numberOfRaws / 2 * firstPrice + (numberOfRaws / 2 + numberOfRaws % 2) * secondPrice)
    }
    println("""Total income:
${'$'}$totalIncome""")
}

fun main() {
    calculateProfit()
}