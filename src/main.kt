fun main() {
    val robot = Robot("Робот", 200, 10, 3)
//    val knight1 = Knight("Рыцарь1", 100, 30, 5)
    val knight2 = Knight("Рыцарь2", 150, 20, 5)
    val mag = Wizard("Маг", 100, 35, 100)

    val queue = Queue_of_fighters(mag, robot)
    queue.add_fighter(knight2)
    while (queue.queueSize() > 1) {
        queue.move_next()
    }
    println(queue.print_results().toString())
}