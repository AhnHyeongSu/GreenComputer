package com.example.test3

//fun main() {
//    var str1 : String? = "Hello Kotlin"
//    str1 = null
//    val len = if(str1 != null) str1.length else -1
//    println("str1: $str1 length: ${len}")
//}

fun main() {
    var str1: String? = "Hello Kotlin"
    str1 = null
    println("str1: $str1 length: ${str1?.length ?: -1}")
    println("${str1?.length}")
}