package OOP

fun main() {
 var girl = Kizlar()
    girl.displayedAge(25)
    var girl1 = Kizlar()
    girl1.name = null
    println("Adi: ${girl1.name}")
    var girl2 = Kizlar()
    girl2.name = "Ayse"
    println("Adi: ${girl2.name}")
}


open class Kisilik(){
    open fun displayedAge(age : Int) {
        println("Age: $age")
    }

    open var name : String? = null
    get() = field
    set(value) {
        field = value
    }

}

class Kizlar() : Kisilik(){
    override fun displayedAge(age: Int) {
        println("Age: ${age-3}")
        super.displayedAge(age)
    }

    override var name: String? = null
        get() = field // bunu field yerine super.name yazarsak no name yerine null çıktısı verir.
        set(value) {
            field = if (value == null) "No Name" else value
        }
}