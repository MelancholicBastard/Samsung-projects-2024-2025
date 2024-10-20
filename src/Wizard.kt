import kotlin.math.*

class Wizard(): Human() {
    var mana_value: Int = 100
        protected set
    val low_hp: Int = health_value / 4

    constructor(nm: String, hp: Int, dmg: Int, mn:Int) : this() {
        this.name = nm
        this.health_value = hp
        this.damage_value = dmg
        this.mana_value = mn
    }

    override fun reduce_health(damage: Int): Int {
        val differ = min(health_value, damage)
        health_value-= differ
        return differ
    }

    override fun attack(human: Human) {
        if (mana_value < 15) {
            mana_value+= 45
            println("${this.name} пропускает ход и копит силы: У ${this.name} ${this.mana_value} маны")
        } else if (this.health_value < this.low_hp && mana_value >= 25) {
            mana_value-= 25
            health_value+= 50
            println("${this.name} пропускает ход и регенерирует: У ${this.name} ${this.mana_value} маны и ${this.health_value} здоровья")
        } else {
            val damage_dealt = human.reduce_health(this.damage_value)
            this.increase_rate(damage_dealt, human.health_value)
            mana_value-= 15
            println("${this.name} атакует ${human.name} на ${damage_dealt} урона: У ${this.name} ${this.mana_value} маны, у ${human.name} ${human.health_value} здоровья")
        }
    }
}