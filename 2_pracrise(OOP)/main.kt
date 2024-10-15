import java.awt.Color

fun main() {
    val car:Car = Car() // /название.класса()/ конструктор
    car.turnOn()
    car.reDraw()
//    car.length = 200
    //
    Car.countofSold = 4


    val cabr:Cabriolete = Cabriolete()
    cabr.openRoof()
    cabr.reDraw()
    cabr.turnOn()



    val kangaroo = kengoroo()
    val Snake = snake()
    val slon = elephant()

    kangaroo.move()
    Snake.move()
    slon.move()

    Snake.eatChervei()

    val array = mutableListOf<Animal>()
    array.add(kangaroo)
    array.add(Snake)
    array.add(slon)
    println("--------------------")
    for (i in array)
    {
        i.move()
    }

    val kangAnim = kangaroo as Animal
    println("!!!!!!!!!!!!!!!!!!!!!!!!!")
    kangAnim.move()
//    kangAnim.openbag()
    println("!!!!!!!!!!!!!!!!!!!!!!!!!")

    println(cabr.toString())

    val mebel:Furniture = Furniture(material = "ДСП", lwh = "134", price = 1000)
    println(mebel.toString())

    val animal1 = Animal(4, Color.PINK, "hagehog")
    val animal2 = Animal(4, Color.PINK, "hagehog")
    println(animal2 == animal1)

    var direction = Direction.WEST
    fun getDirectionInfo(direction: Direction) {
        when (direction) {
            Direction.NORTH -> println("Going North")
            Direction.SOUTH -> println("Going South")
            Direction.EAST -> println("Going East")
            Direction.WEST -> println("Going West")
        }
    }
}