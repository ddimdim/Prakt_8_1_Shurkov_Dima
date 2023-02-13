class Exam {
    var name:String = "Дмитрий Шурков"
    var subject:String = "Математика"
    var data:String = "8.02.2023"
    var grade:Int = 5

    fun vivod() {
        println("Студент: $name")
        println("Предмет: $subject")
        println("Дата экзамена: $data")
        println("Оценка за экзамен: $grade")
    }

    fun student(){
        try {
            println("Введите имя и фамилию студента")
            name = readLine()!!.toString()
            println("Введите предмет, по которому будет экзамен")
            subject = readLine()!!.toString()
            println("Введите дату экзамена")
            data = readLine()!!.toString()
            grade = 0
            while (grade<=0 || grade >=6)
            {
            println("Введите оценку, которую получил студент")
            grade = readLine()!!.toInt()
            if (grade<=0 || grade >=6) println("Такой оценки не может быть")
                else vivod()
            }

        }
        catch (e: Exception)
        {
            println("\nОшибка \nОценка вводится цифрой")
        }

    }
    fun subject(){
        println("Введите предмет, чтобы узнать когда будет экзамен")
        subject = readLine()!!.toString()
        when (subject) {
            "Математика" -> println("Экзамен по математике будет: 8.03.2023")
            "Русский язык" -> println("Экзамен по русскому языку будет: 9.03.2023")
            "Физика" -> println("Экзамен по физике будет: 10.03.2023")
            "Английский язык" -> println("Экзамен по английскому языку будет: 11.03.2023")
            else -> println("По этому предмету не будет экзамена")
        }
    }
}