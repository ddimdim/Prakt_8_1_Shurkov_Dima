class Airplane {
    var marka:String = "Boeing"
    var place:String = "Москва"
    var toplace:String = "Дубаи"
    var data:String = "8.02.2023"
    var start:String = "14:23"
    var time:String = "8:05"

    fun print(){
        println("Марка самолета: $marka")
        println("Пункт отправления самолета: $place")
        println("Пункт назначения самолета: $toplace")
        println("Дата отправления самолета: $data")
        println("Время отправления самолета: $start")
        println("Время в пути: $time")
    }
    fun user(){
            println("Введите марку самолета")
            marka = readLine()!!.toString()
            println("Введите пункт отправления самолета")
            place = readLine()!!.toString()
            println("Введите пункт назначения самолета")
            toplace = readLine()!!.toString()
            println("Введите дату отправления самолета")
            data = readLine()!!.toString()
            println("Введите время отправления самолета")
            start = readLine()!!.toString()
            println("Введите время в пути")
            time = readLine()!!.toString()
        print()
        }

    fun dubai(){
        println("Введите город, в котором вы живете")
        place = readLine()!!.toString()
        if (place != "Москва" && place != "Санкт-Петербург" && place != "Казань" && place != "Сочи") println("В этом городе вы не можете полететь в Дубай(((")
        else println("Вы можете полететь в Дубай")

    }
}