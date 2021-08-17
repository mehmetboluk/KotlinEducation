package ScopeFunction

fun main() {
     // let bir değişkenin null olup olmadığını tanımlar.

    var str : String? = "Kotlin"

    if(str != null){
        //null olmadığında calisacak kodlar
    }else{
        //null olduğunda calisacak kodlar
    }

    str?.let {
        // null olmadığında calisacak kodlar
        println("nuull degil")
    } ?: println("null")// null oldugunda calicak kodlar

    val result = str?.let {
        println(str) //Argument
        5  //return value
    }
    println(result)
}