package OOP

class ClassName{
    //properties
    //methods
}

fun main() {
    val light = Light()
    light.isOn = true
    light.turnOff()
    light.turnOn()


    val car = Car("Kırmızı", 2020)
    println(car.color)
    println(car.model)
    car.start()
    car.accelerating()
    car.stop()

}

class  Light{
    var isOn : Boolean = false


    fun turnOn(){
        isOn = true
    }

    fun turnOff(){
        isOn= false
    }
}