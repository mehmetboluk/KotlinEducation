package OOP

fun main() {

    val person = Person("Mehmet" , "Boluk")
    println(person)


    val user = User("ahmet", 50)
    
}


class Person(var name : String? = null, val lastName : String? = null){
    override fun toString(): String {
        return "$name $lastName"
    }
}



class User(firstName: String,userAge: Int){
    var name : String? = null
    var age : Int? = null


    init {
        name = firstName.capitalize()
        age= userAge
        println("Firs Name : $name")
        println("Age: $age")
    }
}