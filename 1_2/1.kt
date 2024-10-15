class Robot(
    var x: Int = 0,
    var y: Int = 0,
    var direction: Direction = Direction.UP,
) {
    override fun toString(): String {
        return "x: $x, y: $y, dir: $direction"
    }
    fun turnLeft() {
        direction = when (direction) {
            Direction.UP -> Direction.LEFT
            Direction.DOWN -> Direction.RIGHT
            Direction.RIGHT -> Direction.UP
            Direction.LEFT -> Direction.DOWN
        }
    }
    fun turnRight() {
        direction = when (direction) {
            Direction.UP -> Direction.RIGHT
            Direction.DOWN -> Direction.LEFT
            Direction.RIGHT -> Direction.DOWN
            Direction.LEFT -> Direction.UP
        }
    }
    fun stepForward() {
        when (direction) {
            Direction.UP -> y++
            Direction.DOWN -> y--
            Direction.RIGHT -> x++
            Direction.LEFT -> x--
        }
    }
}

fun moveRobot(robot: Robot, fX:Int, fY:Int) {
    if (robot.y > fY) {
        while (robot.direction != Direction.DOWN) robot.turnRight()
        while (robot.y > fY) robot.stepForward()
    } else {
        while (robot.direction != Direction.UP) robot.turnRight()
        while (robot.y < fY) robot.stepForward()
    }
    if (robot.x > fX) {
        while (robot.direction != Direction.LEFT) robot.turnRight()
        while (robot.x > fX) robot.stepForward()
    } else {
        while (robot.direction != Direction.RIGHT) robot.turnRight()
        while (robot.x < fX) robot.stepForward()
    }
}