import java.util.Scanner

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val sc = Scanner(System.`in`)
    val text:String = sc.next()
    var count = 0
    for (i in 0..<text.length){
        if (text[i] in "ayuie")
            count++
    }
    println(count)

    var k:Int? = null
    var x = sc.nextInt()
    if (x < 5) {
        k = 10
    }
//    println(k!!+10)
    println((k ?: 2) + 10)
}

fun getBonus(age:Int?){
    if (age != null){
        age.inc()
    }
}