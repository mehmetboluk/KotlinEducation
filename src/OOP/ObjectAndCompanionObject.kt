package OOP

fun main() {

    var result = MyObject.multiple(2,3)
    println(result)

    println(Math.sqrt(5.0))

    val food = object : Food(){ //anonim oluyor.
        override fun writeCode() {
            println("I dont write code")
        }
    }
            food.eat()
            food.drink()
            food.writeCode()
    println("----------CompanionObject-----------")

    val use = Users()
    use.name = "Mehmet"
    println(use.name)
    use.func()
    println(Users.age)
    Users.funcComp()

}

object ObjectExample {
    //property
    //method
}

object MyObject{
    var a : Int = 0
    var b : Int = 1

    fun multiple(x : Int, y : Int) = x * y
}


open class Food(){
    fun eat() = println("Eating food")
    fun drink() = println("Drink")

    open fun writeCode() = println("Writing code")
}

class Users {
    var name : String? = null
    fun func() = println("func.")

    companion object {
        var age : Int? = 0
        fun funcComp() = println("From companion")
    }
}