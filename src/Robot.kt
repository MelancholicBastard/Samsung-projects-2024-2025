import kotlin.math.*

class Robot(): Human() {
    var battery_boot: Int = 0
        protected set
    var battery_fullcharge: Int = 3
        protected set


    constructor(nm: String, hp: Int, dmg: Int, chrg: Int) : this() {
        this.name = nm
        this.health_value = hp
        this.damage_value = dmg
        this.battery_fullcharge = chrg
    }

    override fun reduce_health(damage: Int): Int {
        val differ = min(health_value, damage)
        health_value-= differ
        return differ
    }

    override fun attack(human: Human) {
        when (battery_boot) {
             battery_fullcharge -> {
                println("${this.name} увеличивает урон на ${this.damage_value * 4}")
                val damage_dealt = human.reduce_health(this.damage_value * 5)
                this.increase_rate(damage_dealt, human.health_value)
                println("${this.name} атакует ${human.name} на ${damage_dealt} урона: У ${human.name} ${human.health_value} здоровья")
                this.battery_boot = 0
            }
            else -> {
                val damage_dealt = human.reduce_health(this.damage_value)
                this.increase_rate(damage_dealt, human.health_value)
                println("${this.name} атакует ${human.name} на ${damage_dealt} урона: У ${human.name} ${human.health_value} здоровья")
                this.battery_boot+= 1
            }
        }
    }
}