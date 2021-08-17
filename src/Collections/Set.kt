package Collections

fun main(){
   // Set: verileri tek (unique) olarak tanimlayan yapi

    println("----Immutable Set----")
    val immutableSet = setOf<Int>(1,2,3,4,5,6,7,8,9,9,9,9,10)
    println(immutableSet.size)



    println("-----Mutable Set (mutableSetOf)-----")
    val mutableSet = mutableSetOf<Int>(1,2,3,4,5,6,7,8,9,9,9,9,10)
    println(mutableSet.size)
    mutableSet.add(11)
    for (item in mutableSet) print("$item, ")
    println()
    mutableSet.remove(9)
    println(mutableSet.size)
    for (item in mutableSet) print("$item, ")


    println()
    println("-----Mutable Set (hashSetOf)-----")
    val hashSet = hashSetOf<Int>(1,2,3,4,5,6,7,8,9,9,9,9,10)
    println(hashSet.size)
    hashSet.add(11)
    for (item in hashSet) print("$item, ")
    println()
    hashSet.remove(9)
    println(hashSet.size)
    for (item in hashSet) print("$item, ")
}