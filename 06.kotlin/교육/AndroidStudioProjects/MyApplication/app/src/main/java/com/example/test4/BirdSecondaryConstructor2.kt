package com.example.test4

class Bird3 {
    var name: String
    var wing: Int
    var beak: String
    var color: String

    constructor(_name: String, _wing: Int, _beak: String, _color: String) {
        name = _name
        wing = _wing
        beak = _beak
        color = _color
    }
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing col: $vol")
}

fun main() {
    val coco = Bird3("mybird", 2, "short", "blue")
    println("coco.color: ${coco.color}")
    coco.fly()
    coco.sing(3)
}
