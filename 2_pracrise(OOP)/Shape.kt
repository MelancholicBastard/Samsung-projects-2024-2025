abstract class Shape: Comparable<Shape>{

    abstract fun getArea():Double

    override fun compareTo(other:Shape) : Int {
        if (getArea() == other.getArea())
        {
            return 0
        } else if (getArea() < other.getArea()){
            return 1
        } else {
            return -1
        }
    }


}