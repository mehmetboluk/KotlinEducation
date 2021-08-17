package ScopeFunction

import java.nio.file.Paths

fun main() {
    // let ve with metodlarının birleşimidir

    val outputpath = Paths.get("/user/home").run {
        val path = resolve("output")
        path.toFile().createNewFile()
        path
    }
}