class Square(
    var L:Int) : Shape() {

    override fun getArea(): Double {
        return L*L.toDouble()
    }

}