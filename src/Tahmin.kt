import java.util.*

fun main(){

    val random = Random()
    val sayi = random.nextInt(10)
    var sayac = 1
    var tahmin : Int

    while(true){
        println("Tahmininiz: ")
        tahmin = readLine()!!.toInt()
        if(tahmin > sayi){
            println("Lutfen daha kucuk bir sayi deneyiniz.")
            sayac++
        }else if(tahmin < sayi){
            println("Lutfen daha buyuk bir sayi deneyiniz")
            sayac++
        }else{
            println("Tebrikler $sayac denemede sayiyi bildiniz. Seçilen sayi: $sayi")
            break
        }
    }
}