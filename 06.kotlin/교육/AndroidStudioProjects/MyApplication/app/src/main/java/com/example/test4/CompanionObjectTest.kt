package com.example.test4

class Person5 {
    var id: Int = 0
    var name: String = "Youngdeok"
    companion object {
        var language: String = "Korean"
        fun work() {
            println("working...")
        }
    }
}

fun main() {
    println(Person5.language)
    Person5.language = "English"
    println(Person5.language)
    Person5.work()
    //println(Person.name) //name은 companion object가 아니므로 에러
}