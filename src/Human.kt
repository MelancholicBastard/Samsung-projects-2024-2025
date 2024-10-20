abstract class Human() {
    var rating_array: IntArray = intArrayOf(0, 0)
        protected set
    var health_value: Int = 100
        protected set
    var damage_value: Int = 15
        protected set
    lateinit var name: String
        protected set

    constructor(nm: String, hp: Int, dmg: Int) : this() {
        this.name = nm
        this.health_value = hp
        this.damage_value = dmg

    }

    fun change_name(nm: String) {
        this.name = nm
    }

    fun increase_rate(value: Int, hp_of_enemy: Int) {
        rating_array[1]+= value
        if (hp_of_enemy == 0)
            rating_array[0]+= 1
    }

    abstract fun reduce_health(damage: Int): Int

    abstract fun attack(human: Human)

}