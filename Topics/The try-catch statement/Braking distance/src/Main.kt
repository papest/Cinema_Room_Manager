import kotlin.Exception

fun calculateBrakingDistance(v1: String, a: String): Int {
    var res = -1
    try {
        val v = v1.toInt()
        val acc = a.toInt()

        res = -v * v / (2 * acc)
        if (res < 0) {
            res = -1
        }

    } catch (e: ArithmeticException) {
        println("The car does not slow down!")
        return res

    } catch (e: Exception) {
        println(e.message)

    }
    return res
}