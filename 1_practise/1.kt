import kotlin.math.abs

fun main() {
    val input = readln()
    val numbersArray = input.split(" ").map { it.toInt() }.toTypedArray()
    val (k, x, y) = numbersArray

    if (2 < abs(x - y)){
        if (k <= x || k <= y)
            print(0)
        else
            print(if(x>y) k-x else k-y)
    }
    else {
        if (k <= x || k <= y)
            print(if(x==y) 2 else 1)
        else
            print(if(x>y) k-x else k-y)
    }

}