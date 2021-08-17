package Function

fun main(){


    println(5 topla 2)

    println("Mehmet" concat " Boluk")
}

infix fun Int.topla(sayi : Int) : Int = (this + sayi)

infix fun String.concat(word: String) : String = (this + word)