package ScopeFunction

fun main() {

    val task = Runnable { println("running") }
    val thread = Thread(task)
    thread.isDaemon = true
    thread.name = "thread"
    thread.state
    thread.start()

    val task2 = Runnable { println("Task2") }
    val thread2 = Thread(task2)
        thread2.apply {
        isDaemon= true
        name = "thread2"
        state
        start()
    }

    var developer = Developer()
    developer.apply {
        name = "Mehmet"
        age = 26
        writeCode()
    }

    repeat(10, {println("Kotlin")})
}

class Developer {
    var name : String? = null
    var age : Int? = null

    fun writeCode() = println( "Writing Code!!!")
}