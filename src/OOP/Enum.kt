package OOP

fun main() {


    println(gunlereGoreHesapla(Gunler.SALI, 500))

    println(Renk.KIRMIZI)
    println(Renk.YESIL)
    println(Renk.MAVI)
    println(Renk.KIRMIZI.rgb)
    println(Renk.YESIL.rgb)
    println(Renk.MAVI.rgb)


}

enum class Gunler {
    PAZARTESI, SALI, CARSAMBA, PERSEMBE, CUMA, CUMARTRSI, PAZAR
}

fun gunlereGoreHesapla(gunler : Gunler, deger : Int) : Int =
    when(gunler){
        Gunler.PAZARTESI -> deger + 6
        Gunler.SALI -> deger / 5
        Gunler.CARSAMBA -> deger + 500
        Gunler.PERSEMBE -> deger - 25
        Gunler.CUMA -> deger * 2
        Gunler.CUMARTRSI -> deger + 64
        Gunler.PAZAR -> deger - 600
        else -> -1
    }


enum class Renk(val rgb : Int){
    KIRMIZI(0xFF0000),
    YESIL(0x00FF00),
    MAVI(0x0000FF)
}
