@SuppressWarnings("zero", "never used")
fun main() {
    try {
        val a = 1 / 0
    } catch (e: RuntimeException) {
        println("Well")
    } catch (e: Exception) {
        println("Wrong")
    }
}