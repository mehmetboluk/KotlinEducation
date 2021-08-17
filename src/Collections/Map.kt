package Collections

fun main(){
    // Map verileri anahtar - deger iliskisine gore tutar (key - value)

    var immutableMap = mapOf<Int,String>(10 to "Mehmet", 20 to "Ahmet", 30 to "Ali", 40 to "Veli")
    for(key in immutableMap.keys) println("Key: ${key}, Value: ${immutableMap[key]}")

    println("------Mutable Map------")

    val mutableMap = HashMap<Int,String>()
    mutableMap.put(10,"Mehmet")
    mutableMap.put(20,"Ahmet")
    mutableMap.put(30,"Ali")
    mutableMap.put(40,"Veli")
    for(key in mutableMap.keys) println("Key: ${key}, Value: ${mutableMap[key]}")

    println()
    mutableMap.replace(30,"Ayse")
    for(key in mutableMap.keys) println("Key: ${key}, Value: ${mutableMap[key]}")

    println()
    mutableMap.remove(40)
    for(key in mutableMap.keys) println("Key: ${key}, Value: ${mutableMap[key]}")


    println()
    val hashMapOf = hashMapOf<Int,String>(10 to "Mehmet", 20 to "Ahmet", 30 to "Ali", 40 to "Veli") //HashMap  Donuruyor (verdiğin sirada dondurmez, karistirir.)
    for(key in hashMapOf.keys) println("Key: ${key}, Value: ${hashMapOf[key]}")

    println()
    val mutableMapOf = mutableMapOf<Int,String>(10 to "Mehmet", 20 to "Ahmet", 30 to "Ali", 40 to "Veli") //LinkedHashMap donduruyor (verdigin sirada dondurur.
    for(key in mutableMapOf.keys) println("Key: ${key}, Value: ${mutableMapOf[key]}")
}