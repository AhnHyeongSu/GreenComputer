package com.example.test4

interface Pet3 {
    var category: String
    val msgTags: String
    get() = "I'm your lovely pet!"
    fun feeding()
    fun patting() {
        println("keep patting!")
    }
}

open class Animal(val name: String)

class Dog(name: String, override  var category: String) : Animal(name), Pet3 {
    override fun feeding() {
        println("Feed the dog a bone")
    }
}
class Cat3(name: String, override var category: String) : Animal(name), Pet3 {
    override fun feeding() {
        println("Feed the cat a tuna can!")
    }
}

class Master {
    fun playWithPet(dog: Dog) {
        println("Enjoy with my dog")
    }
    fun playWithPet(cat: Cat3) {
        println("Enjoy with my cat")
    }
}

fun main() {
    val master = Master()
    val dog = Dog("Toto", "Small")
    val cat = Cat3("Coco", "BigFat")
    master.playWithPet(dog)
    master.playWithPet(cat)
}

