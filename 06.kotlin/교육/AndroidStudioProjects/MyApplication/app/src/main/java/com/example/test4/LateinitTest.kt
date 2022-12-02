package com.example.test4

class Person3 {
    lateinit var name: String

    fun test() {
        if(!::name.isInitialized) {
            println("not initialized")
        } else {
            println("initialized")
        }
    }
}

fun main() {
    val kildong = Person3()
    kildong.test()
    kildong.name = "kildong"
    kildong.test()
    println("name = ${kildong.name}")
}