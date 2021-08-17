package ScopeFunction

fun main() {
    var person = Home()
    var x = person.takeUnless { person is Home }  // icerisi false ise kendisini döndürüyor.
    println(x)
    var y = person.takeUnless { person !is Home }
    println(y)
    var z = person.takeUnless { person is Home } ?: "a person"
    println(z)


}

class Home {
    var name : String? = null
    var age : Int? = null
    fun run() = println("running")
    fun eat() = println("eating")
}