package FunctionalProgramming

fun main() {
    //(Parametre Tipleri) -> (Donus Tipi)

    callMe {
        println("Hello!!!")
    }
    sayHello("mehmet",{ println(it)})
    foo("pencil", { it.reversed()})
    add(2,3, { println(it)})

    fooBar {
        func1()
        func2()
        func3()
    }
}

fun callMe(func : () -> Unit){
    func()
}

fun sayHello(name : String, body : (String) -> Unit){
    body("Hello $name")
}

fun foo(str : String, func: (String) -> String){
    var x = func(str)
    println(x)
}

fun add(a: Int,b: Int, action : (Int) -> Unit){
    action(a + b)
}
class Bar{
    fun func1() = println("func1")
    fun func2() = println("func2")
    fun func3() = println("func3")
}

fun fooBar(block : Bar.() -> Unit){
    var bar = Bar()
    bar.block()
}