fun main() {
    val student: Student? = Student()

    var Unit = student?.let { it -> // работает с объектом через it, возвращает сам объект

        it.hi()
        it.name = "123"

    }

    println("*********************************")

    // apply как let
    student?.apply() { // работает с содержимым объекта, возвращает сам объект
        hi()
        bye()
        name = "123"
    }

    println("*********************************")

    val stringStudent = Student().run { // работает с содержимым объекта, возвращает последнее значение
        hi()
        bye()
        lastname // return lastname
    }
    println(stringStudent)

    println("*********************************")

    val nameStudent = with(Student()) { // работает с содержимым объекта, возвращает последнее значение
        bye()
        hi()
        123
    }
    println(nameStudent)

    println("*********************************")

    val StudentCringe = Student().also { st -> // работает с объектом через st, возвращает сам объект
        st.hi()
        st.bye()
        st.name = "hello"
        Math.PI // не выведется
    }

    println(Student().name)

}