package OOP

fun main() {

    val person = Community("Mehmet", 26)

    person.component1()
    person.component2()
    println("name: ${person.component1()}, age: ${person.component2()}")

    val person2 = person.copy("emre")
    println("name: ${person2.isim}, age: ${person2.age}")
    println(person.toString())

    val person3 = person2.copy()
    println("person hashcode : ${person.hashCode()}")
    println("person2 hashcode : ${person2.hashCode()}")
    println("person3 hashcode : ${person3.hashCode()}")

    if(person.equals(person2))  println("person = person2")
    else println("person != person2")

    if(person2.equals(person3))  println("person2 = person3")
    else println("person2 != person3")

    if(person.equals(person3))  println("person = person3")
    else println("person != person3")
}

data class Community(var isim : String, var age : Int)