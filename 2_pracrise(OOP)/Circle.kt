class Circle(
    var radius:Int): Shape() {


    override fun getArea():Double {
        return radius*radius*Math.PI
    }

    override fun toString(): String {
        return super.toString()
    }
}