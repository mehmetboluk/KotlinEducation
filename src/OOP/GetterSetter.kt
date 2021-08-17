package OOP

fun main() {
    var person = PersonGetterSetter()
    person.name = "Ahmet"
    var isim = person.name

    var user1 = UserGetterSetter()
    user1.actualAge = 15
    user1.age = 15
    println("user1 actual age is ${user1.actualAge}")
    println("user1 is ${user1.age}")

    println()
    var user2 = UserGetterSetter()
    user2.actualAge = 35
    user2.age = 35
    println("user2 actual age is ${user2.actualAge}")
    println("user2 is ${user2.age}")
}

class PersonGetterSetter{
    var name : String = "Emre"
    get() = field
    set(value) {
        field = value
    }
}


class UserGetterSetter{
    var age : Int = 0
    get() = field
    set(value) {
        field = if(value < 18)
            18
        else if (value >=18 && value <= 30)
            value
        else
            value-3
    }

    var actualAge : Int = 0
}