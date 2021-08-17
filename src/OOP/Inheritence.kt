package OOP

fun main() {
    var otomobil = Otomobil()
    otomobil.tekerlek = true
    otomobil.model = 2020
    otomobil.renk = "Kırmızı"
    otomobil.calisma()
    otomobil.hizlanma()
    otomobil.yavaslama()
}


open class Arac(var renk : String? = null, var model :Int? = null){
    fun calisma() = println("Araç çalıştırılıyor.")
    fun hizlanma() = println("Araç hızlanıyor.")
    fun yavaslama() = println("Araç yavaşlıyor.")
}

open class TekerlekliAraclar(var tekerlek : Boolean = true) : Arac(){

}

class Otomobil : TekerlekliAraclar(){

}