fun main() {
    val str: String? = null
    println(str?.length)
}
fun countVowels(text: String): Int{
    var count = 0
    for (i in text){
        if (i in "aeiou")
            count++
    }
    return count
}