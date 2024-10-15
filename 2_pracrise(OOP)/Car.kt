import java.awt.Color

open class Car (
    var color: Color = Color.red,
    private var length:Int = 400,
    private var model:String = "Lada sedan"
) {
    companion object{
        var countofSold:Int = 0
    }

    open fun turnOn(){
        // запуск системы
    }
    fun reDraw(){
        println("перекрасить")
        // изменение цвета
    }

    // getter setter
    fun getLenght():Int {
        return length
    }
    fun setLenght(L:Int) {
        this.length = L
    }
    override fun toString():String{
        return "Cabriolete(Color=${color}, length=$length)"
    }
    }