package com.example.test4

class Outer2 {
    class Nested {
        fun accessOuter() {
            println(country)
            getSomething()
            //println(getSomething)
        }
    }

    companion object {
        const val country = "Korea"
        fun getSomething() = println("Get something...")
        //const val getSomething: String = "Get something..."
    }
}

fun main() {
    val abc = Outer2.Nested().accessOuter()

}