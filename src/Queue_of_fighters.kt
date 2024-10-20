import kotlin.random.Random

class Queue_of_fighters(vararg array: Human) : prototupe_of_array {
    private var queue: ArrayDeque<Human> = ArrayDeque()
    private var list_losers: MutableList<List<Any>> = mutableListOf()
    private lateinit var fighter1: Human
    private lateinit var fighter2: Human
    private var rnd: Int = 0

    init {
        for (fighter in array) {
            queue.add(fighter)
        }
    }

    // Метод для получения размера очереди
    fun queueSize(): Int {
        return queue.size
    }

    override fun move_next() {
        if (queue.size > 1) {
            fighter1 = queue.removeAt(0) // Убираем первого бойца из очереди
            rnd = Random.nextInt(0, queue.size) // Выбираем случайного второго бойца
            fighter2 = queue[rnd] // Не удаляем его из очереди, просто берем по индексу

            // Атака первого бойца на второго
            fighter1.attack(fighter2)

            // Проверяем здоровье второго бойца после атаки
            if (fighter2.health_value <= 0) {
                // Если здоровье второго бойца упало до 0, он выбывает
                list_losers.add(listOf(fighter2.name, fighter2.rating_array[0], fighter2.rating_array[1]))
                queue.removeAt(rnd) // Теперь удаляем его из очереди
                println("${fighter2.name} выбывает")
            }

            // Возвращаем первого бойца в конец очереди
            queue.add(fighter1)

        } else {
            println("Недостаточно бойцов для сражения")
        }
    }

    override fun print_results(): List<Any> {
        fighter1 = queue.removeAt(0)
        list_losers.add(listOf(fighter1.name, fighter1.rating_array[0], fighter1.rating_array[1]))
        val sortedList = list_losers.sortedWith(
            compareByDescending<List<Any>> { it[1] as Int } // Сортируем по второму элементу
                .thenByDescending { it[2] as Int })           // Затем по третьему элементу
        return sortedList
    }

    override fun add_fighter(human: Human) {
        queue.add(human)
    }
}
