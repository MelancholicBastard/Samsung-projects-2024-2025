import java.util.*

fun main() {
    val stack = Stack<Int>()
    val queue = ArrayDeque<Int>()

    // поместить элемент
    stack.push(123)
    queue.push(123)

    // получить элемент
    val i1 = stack.pop()
    val i2 = queue.pop()

    // получить элемент не уничтожая
    val i3 = stack.peek()
    val i4 = queue.peek()

}