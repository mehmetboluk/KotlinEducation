package OOP

fun main() {
val z = Z()
    z.hello()
    z.tFunc()
}


interface X {
    fun hello() = println("Hello from X")
}
interface T{
    fun tFunc()
}
interface D {
    interface C{
        fun cFunct()
    }
}
interface Y : T {
    fun hello() = println("Hello from Y")
}
class Z : X,Y, D.C{
    override fun hello() {
        super<X>.hello()
        super<Y>.hello()
    }

    override fun tFunc() {
        TODO("Not yet implemented")
    }

    override fun cFunct() {
        TODO("Not yet implemented")
    }

}