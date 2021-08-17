package Collections

/*
* Array : mutable (sabit)
* Immutable (Read Only)
*   1.Immutable List -> listOf
*   2.Immutable Map -> mapOf
*   3.Immutable Set -> setOf
*
* Mutable (Read and Write)
*   1.Mutable List -> ArrayList, arrayListOf, mutableListOf
*   2.Mutable Map -> HashMap, hashMapOf, mutableMapOf
*   3.Mutable Set -> mutableSetOf, hashSetOf
*
* */


fun main(){
    val array = Array<Int>(5){0} //Butun elemanlari sıfır olan uzunluğu beş olan array.
    val array1 = arrayOf(1,2,3,4,5,6)
    println(array1[3])
    array1[3] = 20
    println(array1[3])
    for(indeks in array1) print("$indeks ")

}