package OOP

/*
* SOYUTLAMA
* 1.Soyut siniftan nesne türetilemez.
* 2.Eğer bir sinifin içierisinde soyut bir metod varsa mutlaka o sınıfta soyut  olmalıdır.
* 3.Soyut sınıflardan soyut alt sınıf turetilebilir.
*   Bu durumda üst sınıfın metodunu override etmek zorunda değildir.
* */

fun main() {

    val ogretmen = Ogretmen("Mehmet")
    ogretmen.isTanimiYaz("Muhendis")
    ogretmen.yasGsoter(45)
}


abstract class People(ad: String) {
    init {
        println("Ad: $ad")
    }

    fun yasGsoter(yas : Int){
        println("Yaş: $yas")
    }

    abstract fun isTanimiYaz(isTanimi : String)
}

class Ogretmen(ad: String): People(ad) {
    override fun isTanimiYaz(isTanimi: String) {
        println("İş Tanimi yapildi: $isTanimi")
    }

}

abstract  class Sekil(var yukseklik: Int , var genislik : Int){
    abstract fun alanHesapla(yukseklik: Int,genislik: Int)
}

abstract class Diktortgen(yukseklik: Int,genislik: Int) : Sekil(yukseklik,genislik){
    //abstract sınıf abstract sınıftan turetildi.
}