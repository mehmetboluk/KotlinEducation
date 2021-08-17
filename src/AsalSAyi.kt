fun main(){
    val ustSınır : Int
    var bolenSayisi : Int
    println("Lutfen ust sinir degeri giriniz: ")
    ustSınır = readLine()!!.toInt()

    for (i in 2..ustSınır){
        bolenSayisi = 0
        for(j in 1..i){
            if(i % j == 0){
                bolenSayisi++
            }
        }
        if(bolenSayisi == 2){
            println(i)
        }
    }
}