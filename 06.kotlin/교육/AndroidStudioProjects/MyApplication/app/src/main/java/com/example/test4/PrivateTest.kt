package com.example.test4

    private class PrivateClass {
    private var i = 1
    private fun privateFunc() {
        i += 1
        println(i)
    }
    fun access() {
        println(i)
        privateFunc()
    }
}

class OtherClass {
    //val opc = PrivateClass()
    fun test() {
        val pc = PrivateClass()
    }
}

fun main() {
    val pc = PrivateClass()
    val test = pc.access()

}

fun TopFunction() {
    val tpc = PrivateClass()
}