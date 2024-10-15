import java.util.*

fun main() {
    var square = Square(10, )
    var circle = Circle(10)

    var array = arrayOf(square, circle)
    println(array.contentToString())

    Arrays.sort(array)
    println(array.contentToString())
}