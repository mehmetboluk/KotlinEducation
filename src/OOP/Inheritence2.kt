package OOP

fun main() {
    var ogretmen = Ogrentmen("mehmet" , 18)
    ogretmen.dersVerme()
    var futbolcu = Futbolcu("ahmet" , 28)
    futbolcu.futbolOynama()
    var isAdami = IsAdami("ali" , 38)
    isAdami.calisma()
}

open class Kisi(var isim: String, var yas: Int){
    init {
        println("İsim: $isim")
        println("Yaş: $yas")
    }
}

class Ogrentmen(isim : String, yas: Int) : Kisi(isim,yas){
    fun dersVerme() = println("$isim ders veriyor.")
}
class Futbolcu(isim : String, yas: Int) : Kisi(isim,yas){
    fun futbolOynama() = println("$isim futbol oynuyor.")
}
class IsAdami(isim : String, yas: Int) : Kisi(isim,yas){
    fun calisma() = println("$isim çalisiyor.")
}