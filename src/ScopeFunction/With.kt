package ScopeFunction

fun main() {
    var person = University()
    with(person){
        name = "Mehmet"
        age = 26
        run()
        eat()
    }
}

class University {
    var name : String? = null
    var age : Int? = null
    fun run() = println("running")
    fun eat() = println("eating")
}