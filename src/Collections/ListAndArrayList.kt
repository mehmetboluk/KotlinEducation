package Collections

fun main(){

    var list = listOf<String>("Kotlin","Java", "C++")
    //list[2]= "phtyon" immutable listde değer değişitirilemez.

    for(item in list) println(item)

    for(i in 0..list.size-1) println(list[i])

    println("--------ArrayList-----------")

    var mutableList = mutableListOf<String>("Kotlin", "Java", "Asp.Net","Phyton","Ruby")
    var ArrayList = ArrayList<String>()
    ArrayList.add("Kotlin")
    ArrayList.add("Asp.Net")
    ArrayList.add("Phyton")
    ArrayList.add("Ruby")

    var  arrayList = arrayListOf<String>("Kotlin", "Java", "Asp.Net","Phyton","Ruby")
    println("----İlk Hali----")
    for (items in arrayList) println(items)

    println()
    println("----Eleman Degistirme----")
    arrayList[2] = "Csharp"
    for (items in arrayList) println(items)

    println()
    println("----Eleman ekleme----")
    arrayList.add("Asp.Net")
    for (items in arrayList) println(items)

    println()
    println("----Eleman İsmine göre silme----")
    arrayList.remove("Java")
    for (items in arrayList) println(items)

    println()
    println("----Indeks degerine göre silme----")
    arrayList.removeAt(0)
    for (items in arrayList) println(items)
}