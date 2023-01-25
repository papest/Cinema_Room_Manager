fun main() {
    val longs: MutableList<Long> = mutableListOf(100_000_000_001, 100_000_000_002, 100_000_000_003)

    println(longs.joinToString())
}