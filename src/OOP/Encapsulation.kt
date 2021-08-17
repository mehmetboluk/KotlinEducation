package OOP

/*
* public        -> Herkese açık tüm sınıflar erişebilir.
* private       -> Sadece kendi sınıfından erişim sağlanabilir.
* protected     ->Kendi sınıfı ve alt sınıflarından eişilebilir.
* internal      -> Sadece kendi modülünden erişim.
* */


fun main() {

}



public class PublicClass {
    val i = 1
    fun func(){
        var pc = PrivateClass()
        //pc.a veya pc dediğimizde metodlara ulaşamıyoruz.
    }
}

private class PrivateClass{
    private val a = 0
    private fun Int.carp(b: Int) = this*b

}

open class A {
    protected val protectedValue = 2
}

class B : A() {
    fun getMethod() = protectedValue
}