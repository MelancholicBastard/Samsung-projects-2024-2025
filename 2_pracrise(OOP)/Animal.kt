import java.awt.Color

open class Animal(
    var countofleg:Int = 1,
    var baseColor: Color = Color.blue,
    var scienceName:String = "HD"
) {
    override fun equals(other: Any?): Boolean {
        val anim = other as Animal
        return countofleg==anim.countofleg && baseColor.red == anim.baseColor.red && scienceName == anim.scienceName
    }
    open fun move(){
        println("Движение")
        //двигаться
    }

}