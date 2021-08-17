package ScopeFunction

import OOP.Person

fun main() {
 var person = College()
    var x = person.takeIf { person is College }  // icerisi true ise kendisini döndürüyor.
    println(x)
    var y = person.takeIf { person !is College }
    println(y)
    var z = person.takeIf { person !is College } ?: "not a person"
    println(z)


}

class College {
    var name : String? = null
    var age : Int? = null
    fun run() = println("running")
    fun eat() = println("eating")
}