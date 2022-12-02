package com.example.test3

//fun main() {
//    val n: Int = 5
//
//    if((n%2) == 1) {
//        println("$n is an Odd number")
//    }
//    if((n%2) == 0) {
//        println("$n is an Even number")
//    }
//}

//fun main() {
//    var num1 = 10
//    var num2 = 20
//    val result1 = ++num1
//    val result2 = num2++
//
//    println("result1: $result1")
//    println("result2: $result2")
//    println("num1: $num1")
//    println("num2: $num2")
//}

fun main() {
    var check = (5>3) && (5>2)
    check = (5>3) || (2>5)
    check = !(5>3)
    println(check)
}