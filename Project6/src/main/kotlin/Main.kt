import java.util.Scanner

open abstract class Zoo
{
    abstract var name: String

    abstract fun breath()
    abstract fun move()
    abstract fun info()
}


class Beast : Zoo()
{
    override var name = ""
    var does = ""

    override fun breath() {
        println("${this.name} это зверь. Звери дышат через нос.")
    }

    override fun move() {
        println("Звери передвигаются по земле. Они могут ходить, бегать, прыгать.")
    }

    override fun info() {
        breath()
        move()
        println("${this.name} ${this.does} \n")
    }
}


class Bird : Zoo()
{
    override var name: String = ""
    var does = ""

    override fun breath() {
        println("${this.name} это птица. Птицы дышат через клюв.")
    }

    override fun move() {
        println("Птицы летают по воздуху и могут ходить по земле на ногах.")
    }

    override fun info() {
        breath()
        move()
        println("${this.name} ${this.does} \n")
    }
}


class Fish : Zoo()
{
    override var name: String = ""
    var does = ""

    override fun breath() {
        println("${this.name} это рыба. Рыбы дышат через жабры.")
    }

    override fun move() {
        println("Рыбы плавают в воде и могут выпрыгивать из воды в воздух.")
    }

    override fun info() {
        breath()
        move()
        println("${this.name} ${this.does} \n")
    }
}


fun main() {

    val lion = Beast()
    lion.name = "Лев"
    lion.does = "рычит"

    val horse = Beast()
    horse.name = "Лошадь"
    horse.does = "скачет"

    val elephant = Beast()
    elephant.name = "Слон"
    elephant.does = "набирает воду хоботом"

    val raven = Bird()
    raven.name = "Ворон"
    raven.does = "каркает"

    val eagle = Bird()
    eagle.name = "Орел"
    eagle.does = "кружит в воздухе"

    val shark = Fish()
    shark.name = "Акула"
    shark.does = "охотится"

    val salmon = Fish()
    salmon.name = "Лосось"
    shark.does = "выпрыгивает из воды"


    val zoo = listOf<Zoo>(lion, horse, elephant, raven, eagle, shark, salmon)
    println("Список животных в зоопарке:")
    var i: Int = 0
    for(beast in zoo)
    {
        println("${++i} - ${beast.name}")
    }
    println()


    println("Выберете животное из списка для вывода информации о нем:")
    var numberInZoo: Int = 0

    while(numberInZoo == 0 || numberInZoo < 1 || numberInZoo > 7)
    {
        var inputStr = readln()!!
        try {
            numberInZoo = inputStr.toInt()
        }
        catch (e: NumberFormatException)
        {
            numberInZoo = 0
            println("Вы ввели неверное значение. Пожалуйста, попробуйте еще раз.")
        }
    }
    zoo[numberInZoo - 1].info()
}
