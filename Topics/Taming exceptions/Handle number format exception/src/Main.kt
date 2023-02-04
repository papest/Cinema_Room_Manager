const val PART_LENGTH = 4

fun parseCardNumber(cardNumber: String): Long {
    val (a, b, c, d) = cardNumber.split(' ')
    if (a.length != PART_LENGTH || b.length != PART_LENGTH || c.length != PART_LENGTH || b.length != PART_LENGTH) {
        throw NumberFormatException()
    }
    return (a + b + c + d).toLong()
}
