package com.example.test4

interface  Pet2 {
    var category: String
    val msgTags: String
    get() = "I'm your lovely pet!"

    fun feeding()
    fun patting() {
        println("keep patting!")
    }
}

class Cat2(override var category: String) : Pet2 {
    override fun feeding() {
        println("Feed the cat a tuna can!")
    }
}

fun main() {
    val obj = Cat2("small")
    println("Pet Message Tags: ${obj.msgTags}")
    obj.feeding()
    obj.patting()
}