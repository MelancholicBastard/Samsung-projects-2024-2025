import java.util.*

fun main() {
    val array = Array<String>(100_000) {i->"$i"}
    val lkList = LinkedList<String>()
    lkList.addAll(array)

    val time1 = System.currentTimeMillis()

    for (a in 0 until 100_000) {
        println(array[a])
    }

    val time2 = System.currentTimeMillis()

    val it = lkList.iterator()
    for (a in 0..<100_000) {
        println(it.next())
    }

    val time3 = System.currentTimeMillis()

    print("${time1}, ${time2}, ${time3}, ${time2-time1} : ${time3-time2}")
}




