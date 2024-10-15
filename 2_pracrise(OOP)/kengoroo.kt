class kengoroo(
    var material:String = "wool"
):Animal(countofleg = 5) {
    override fun move(){
        println("*прыгает*")
    }

//    constructor(material: String, cofL:Int) : this() {
//        this.material = material
//        super.countofleg = cofL
//    }

    fun openbag(){
        //
    }
}