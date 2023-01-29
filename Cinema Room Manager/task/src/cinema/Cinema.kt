package cinema

const val TITLE = "Cinema:"
var topLine = "  1 2 3 4 5 6 7 8"
var numberOfRaws = 7
var numberOfSeats = 8
var cinemaHall = MutableList(numberOfRaws) { MutableList(numberOfSeats) { 'S' } }
var currentRaw = 1
var currentSeat = 1
var bigHall = false
const val MAX_SEATS_FOR_FIRST_ALGORITHM = 60
const val FIRST_PRICE = 10
const val SECOND_PRICE = 8
const val PRICE = 10

fun arrangementOut() {

    println(TITLE)
    println(topLine)
    for (i in 1..numberOfRaws) {
        println("$i ${cinemaHall[i - 1].joinToString(" ")}")
    }

}

fun createCinemaHall() {

    cinemaHall = MutableList(numberOfRaws) { MutableList(numberOfSeats) { 'S' } }
    topLine = "  ${(1..numberOfSeats).joinToString(" ")}"
    bigHall = numberOfRaws * numberOfSeats > MAX_SEATS_FOR_FIRST_ALGORITHM
}

fun calculateProfit() {

    println("Enter the number of rows:")
    numberOfRaws = readln().toInt()
    println("Enter the number of seats in each row:")
    numberOfSeats = readln().toInt()
    val totalIncome = if (!bigHall) {
        numberOfRaws * numberOfSeats * PRICE
    } else {
        numberOfSeats * (numberOfRaws / 2 * FIRST_PRICE + (numberOfRaws / 2 + numberOfRaws % 2) * SECOND_PRICE)
    }
    println(
        """Total income:
${'$'}$totalIncome"""
    )
}

fun bookSeat() {
    cinemaHall[currentRaw - 1][currentSeat - 1] = 'B'
}

fun ticketPrice(): Int {

    if (!bigHall) return PRICE
    return if (currentRaw > numberOfRaws / 2) {
        SECOND_PRICE
    } else {
        FIRST_PRICE
    }
}

fun main() {

    println("Enter the number of rows:")
    numberOfRaws = readln().toInt()
    println("Enter the number of seats in each row:")
    numberOfSeats = readln().toInt()
    createCinemaHall()
    arrangementOut()
    println("Enter a row number:")
    currentRaw = readln().toInt()
    println("Enter a seat number in that row:")
    currentSeat = readln().toInt()
    println("Ticket price: $${ticketPrice()}")
    bookSeat()
    arrangementOut()

}




