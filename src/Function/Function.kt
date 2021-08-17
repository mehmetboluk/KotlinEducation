package Function

fun main(){
    var sonuc = toplama(40,5)
    println(sonuc)

    var sonuc1 = cikarma(40,5)
    println(sonuc1)

    var sonuc2 = carpma(40,5)
    println(sonuc2)

    var sonuc3 = bolme(40,5)
    println(sonuc3)

    println(hesaplama(40,5,"*"))

}
fun toplama(sayi1 : Int, sayi2: Int): Int = sayi1 + sayi2
fun cikarma(sayi1 : Int, sayi2: Int): Int = sayi1 - sayi2
fun carpma(sayi1 : Int, sayi2: Int): Int = sayi1 * sayi2
fun bolme(sayi1 : Int, sayi2: Int): Int = sayi1 / sayi2

fun hesaplama(sayi1: Int, sayi2: Int, islem : String): Int = when(islem) {
    "+" -> toplama(sayi1, sayi2)
    "-" -> cikarma(sayi1, sayi2)
    "*" -> carpma(sayi1, sayi2)
    "/" -> bolme(sayi1, sayi2)
    else -> 0
}

