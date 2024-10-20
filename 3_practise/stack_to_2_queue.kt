import java.util.ArrayDeque

fun main() {
    val stack = Stack()
    stack.add_elem(1, 2, 3, 4, 5)
    println(stack.get_elem())
    println(stack.get_elem())
    println(stack.toString())
    println(stack.toString())

}

class Stack() {
    private var gue1 = ArrayDeque<Any>()
    private var gue2 = ArrayDeque<Any>()
    private var x: Any? = null

    fun add_elem(vararg arr: Any){
        for (i in arr)
            gue1.addLast(i)
    }

    fun get_elem(): Any? {
        while (gue1.size > 1) {
            gue2.addLast(gue1.removeFirst()) // Перекладываем элемент в gue2
        }
        x = gue1.removeFirst() // Используем removeFirst для удаления
        while (gue2.isNotEmpty()) {
            gue1.addLast(gue2.removeFirst())
        }
        return x
    }

    override fun toString(): String {
        var text = ""
        var elem: Any

        while (gue1.isNotEmpty()) {
            gue2.addLast(gue1.removeFirst())
        }
        while (gue2.isNotEmpty()) {
            elem = gue2.removeFirst()
            text = " " + elem.toString() + text
            gue1.addLast(elem)
        }
        return text.substring(1, text.length)
    }

}