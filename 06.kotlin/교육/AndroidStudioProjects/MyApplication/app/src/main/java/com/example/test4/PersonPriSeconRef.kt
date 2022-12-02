package com.example.test4

class Pesron(firstName: String, out: Unit = println("[Primary Constructor] Parameter")) {
    val fName = println("[Property] Person fName: $firstName")

    init {
        println("[init] Person init block")
    }

    constructor(firstName: String, age: Int,
        out: Unit = println("[Secondary Constructor] Parameter")): this(firstName) {
            println("[Secondary Constructor] Body: $firstName, $age")
        }
}

fun main() {
    val p1 = Pesron("kildong", 30)
    println()
    val p2 = Pesron("Dooly")
}