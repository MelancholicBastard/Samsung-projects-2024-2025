import kotlin.math.*

fun main() {
    val array = readLine()?.split(" ")?.map {it.toDouble()}
    val a = array!![0]
    val b = array!![1]
    val x = array!![2]
    val y = array!![3]
    if (max(a, b) >= max(x, y) && min(a, b) >= min(x, y)) print("YES") else print("NO")

}