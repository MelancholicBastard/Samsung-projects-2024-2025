import kotlin.math.*

fun main() {
    val array = readLine()?.split(" ")?.map {it.toInt()}
    val k = array!![0]
    val x = array!![1]
    val y = array!![2]

    println(max(k - max(y, x), max(2 - abs(x - y), 0)))
}
