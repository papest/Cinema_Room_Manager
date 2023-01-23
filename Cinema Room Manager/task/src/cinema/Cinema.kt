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
fun main() {
    arrangementOut()
}