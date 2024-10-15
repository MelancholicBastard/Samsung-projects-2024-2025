import java.util.*

fun main() {

    // int 32
    var i = 1
    val i2 = 2
    var i3:Int

    i3 = 3
    //Short 16
    var sh:Short = 1
    //Byte 8
    var b:Byte = 0

//    Float 32
    var f =10.000000000000001
//    Double 64
    var d = 20.0000000000021111111111111111
//    Bool
    var boo = true
//    Char
    var chr = 'f'
//    String
    var str = "Hello"

    val input = Scanner(System.`in`)

    var i4 = input.nextInt()
//    i4 *= 3
    println(i4)

    if( i4 > 5 )
        println("Введите число больше 5")

    else
        println("Меньше")

    when(i4){
        5->{
            println("это пять")}
        in 1..4 -> {
            println("Такое я не люблю")}
    }

//    i j k
    for (o in 1..<10){
        print("$o : ")
    }

    while (i4 < 10){
        println("$i4 w")
        i4++
    }

    do {
        println("d $i4")
        i4++
    } while (i4 < 15)

    println("Hello world")
    getCustomInInteger(i=2, 4)
    getCustomInInteger(k = 4, t = 10)

    var l:Int = 0
    l.addOne()
    print(rrr())

    var array: Array<String> = Array(12) {i -> "BCA"} // Заполнение значение массива
    var array2 = mutableListOf<String>()

    for (p in 1..7){
        array2.add(p.toString())
//        array2.add("$p")
    }
    println(array2)

    Arrays.sort(array)
    println(array.contentToString())



}

fun Pass(i:Int):Unit{

}

fun getCustomInInteger(i:Int, b:Int, c:String="/cvv"){
    println("${i+b} $c")
}

fun getCustomInInteger(k:Int=1, t:Int=2){
    println("${k+t}")
}

fun rrr():String{
    return "rrrrrr"
}

fun Int.addOne():Int{
    return this + 1
}



