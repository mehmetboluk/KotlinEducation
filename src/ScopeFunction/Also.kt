package ScopeFunction

fun main() {

    val address = Address( "new street", 34720)
    val user = Visitor("Mehmet", address)
    val result = user.also { it.age = 26 }


}

data class Address(var street : String? = null, var code : Int? = null)
data class Visitor(var name : String? = null,var address: Address? = null, var age : Int? = null)
