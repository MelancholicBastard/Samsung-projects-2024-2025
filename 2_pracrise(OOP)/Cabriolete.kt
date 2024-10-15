class Cabriolete() : Car() {

    fun openRoof(){

    }
    override fun turnOn(){
        println("launch of cabriolet")
    }

    override fun toString():String{
        return "Cabriolete(Color=${color}, length=${getLenght()})"
    }

}