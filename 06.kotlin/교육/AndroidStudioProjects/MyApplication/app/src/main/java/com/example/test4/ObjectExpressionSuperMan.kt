package com.example.test4

open class Superman() {
    fun work() = println("Talk photos")
    fun talk() = println("Talk with people")
    open fun fly() = println("Flying in the air.")
}

fun main() {
    val pretendedMan = object: Superman() {
        override fun fly() = println("I'm mot a real superman. I can't fly!")
    }
    pretendedMan.work()
    pretendedMan.talk()
    pretendedMan.fly()
}