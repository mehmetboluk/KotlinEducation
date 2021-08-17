package FunctionalProgramming

fun main() {
    // { parameter -> fonksiyon gövdesi }
    //{ a : Int, b : Int > a*b }
    hello()
    hello2()

    println(topla(3,4))
    println(topla2(5,6))
    println(max(5,9))
    println(max2(8,5))


    var myLambda= { ad : String ,soyad :String ->
        println("ad : $ad soyad: $soyad")
    }

    myLambda("mehmet","boluk")

    var list = listOf(1,2,3,4,5,6)
    list.forEach { println(it) }
}


fun hello(){
    println("Hello")
}
val hello2 = { println("Hello")}

fun topla(a: Int, b: Int) : Int = a+b
val topla2 = { a : Int, b : Int -> a+b }

fun max(x:Int, y:Int): Int = if(x>y) x else y
val max2 = {x: Int, y: Int -> if(x>y) x else y}



