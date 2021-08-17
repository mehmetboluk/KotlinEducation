package ScopeFunction

fun main() {
    var list = listOf(1,2,3,4,5,6,7,8,9,10,11,12)
    list.printArray()
    println()

    println("------------------------")

    var list2 = list.filter { t -> t > 10 } // { it > 10 } da yazilabilir.
    list2.printArray()
    println()

    println("------------------------")

    var list3 = list.map { it * 3 }
    list3.printArray()
    println()

    println("------------------------")

    var a = list.all { it > 5 } // All' da icerdeki şart listedeki tüm elemanlar için doğru iste true döner. Aksi halde False doner.
    println(a)
    var b = list.all { it > -5 }
    println(b)

    println("------------------------")

    var c = list.any { it > 5 } // Any ' de şart listedeki herhang bir eleman için geçerli olması yeterli.
    println(c)

    println("------------------------")

    var d = list.count{ it > 5} // Listedeki 5 den buyuk elemanların sayisini veriyor.
    println(d)

    println("------------------------")

    var e = list.find { it > 5 } // 5 den buyuk ilk elemenı döndurur.
    println(e)
}

fun <T> List<T>.printArray(){
    for (item in this) print("$item ")
}