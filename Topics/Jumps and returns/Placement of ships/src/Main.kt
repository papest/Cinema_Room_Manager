const val MAX_ROWS = 5
const val MAX_COLUMNS = 5
@SuppressWarnings("MagicNumber")
fun main() {
    val usedRaws = mutableListOf<Int>()
    val usedColumns = mutableListOf<Int>()
    val numberOfShips = 3
    for (i in 1..numberOfShips) {
        val a = readln().split(" ")
        usedRaws.add(a[0].toInt())
        usedColumns.add(a[1].toInt())
    }
    val raws = mutableListOf<Int>()
    for (i in 1..MAX_ROWS) {
        if (i in usedRaws) continue
        raws.add(i)
    }
    val columns = mutableListOf<Int>()
    for (i in 1..MAX_COLUMNS) {
        if (i in usedColumns) continue
        columns.add(i)
    }
    println(raws.joinToString(" "))
    println(columns.joinToString(" "))

}
