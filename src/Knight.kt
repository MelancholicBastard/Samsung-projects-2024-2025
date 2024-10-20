import kotlin.math.*

class Knight(): Human() {
    var defence_value: Int = 0
        protected set


    constructor(nm: String, hp: Int, dmg: Int, df:Int) : this() {
        this.name = nm
        this.health_value = hp
        this.damage_value = dmg
        this.defence_value = df
    }

    override fun reduce_health(damage: Int): Int {
        val differ = min(health_value, damage - defence_value)
        health_value-= differ
        return differ
    }

    override fun attack(human: Human) {
        val damage_dealt = human.reduce_health(this.damage_value)
        this.increase_rate(damage_dealt, human.health_value)
        println("${this.name} атакует ${human.name} на ${damage_dealt} урона: У ${human.name} ${human.health_value} здоровья")
    }
}