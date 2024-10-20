fun main() {
    val set = mutableSetOf(123, 111, 5, 7)
    set.add(8)
    set.add(111)
    set.add(124)
    println(set)

    if (set.contains(111)) {
        println("Такой элемент есть")
    } else {
        println("Такого элемента нет")
    }

    val map = mutableMapOf<String, Long>("MyName" to 88005553535, "YourName" to 999999)
    map.put("he's Name", 123)
    map["She'sName"] = 10000

    println(map.get("MyName"))

    map["MyName"] = 88888

    println(map.get("MyName"))

}