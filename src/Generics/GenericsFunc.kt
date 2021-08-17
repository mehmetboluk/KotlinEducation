package Generics

fun main() {

    printRepeated("Hello World" , 5)
    printRepeated(0,10)

    val array1 = arrayOf(1,2,3,4,5,6,7)
    var array2 = arrayOf("Hello", "World", "Solar", "Sun")
    var array3 = arrayOf(2.4,3.5,8.7,9.6,10.5)
    printArray(array1)
    printArray(array2)
    printArray(array3)


    array1.printArrayExt()
    array2.printArrayExt()
    array3.printArrayExt()


    var sonuc = maximum(4,5,6)
    println(sonuc)

    var sonuc2 = maximum(4.5,5.8,6.9)
    println(sonuc2)

}

fun <T> printRepeated(t: T , n : Int) {
    for (i in 1..n) println(t)
}

fun <T> printArray(array: Array<T>){
    for (item in array) println(item)
}

fun <T> Array<T>.printArrayExt(){
    for (items in this) println(items)
}

fun <T:Comparable<T>> maximum(x: T, y : T, z: T) : T{
    var max = x
    if(y.compareTo(max) > 0) max = y
    if(z.compareTo(max) > 0) max = z

    return max

}