package OOP

fun main() {
 val myInterface = InterfaceImpl()
    println(myInterface.prop)
    println(myInterface.hello())
    myInterface.foo()
}


interface InterfaceName {
    //properties
    //methods
}

interface MyInterface {
    var prop : String
    fun foo()
    fun hello() = "Hello!!"
}
interface Alll{
 fun  aFunc()
}

class InterfaceImpl : MyInterface, Alll {
    override var prop: String = "Welcome!!"

    override fun foo() {
        println("foo Func cagrildi.")
    }

    override fun aFunc() {
        TODO("Not yet implemented")
    }

}