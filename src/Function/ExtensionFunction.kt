package Function

fun main(){

    println(10.triple())

    println("kotlin".reversed())

    val list = arrayListOf("Kotlin", "Java", "C","Phyton")
    println(list.reversed())

    list.swab(1,3)
    for (i in list){
        print(i)
    }


}

fun Int.triple() = this * this * this


fun ArrayList<String>.swab(index1 : Int, indek2 : Int) {
    val temp = this[index1]
    this[index1] = this[indek2]
    this[indek2] = temp
}