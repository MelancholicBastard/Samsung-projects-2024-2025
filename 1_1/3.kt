fun main() {
    val text = readLine()
    var array = Array(4, {0})
    if (text != null) {
        for (i in text) {
            when (i){
                'A', 'a' -> array[0] += 1
                'T', 't' -> array[1] += 1
                'G', 'g' -> array[2] += 1
                'C', 'c' -> array[3] += 1

            }
        }
    }

    println(array.joinToString(" "))
}