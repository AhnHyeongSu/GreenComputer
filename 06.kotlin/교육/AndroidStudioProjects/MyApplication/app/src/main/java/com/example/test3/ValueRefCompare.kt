package com.example.test3

fun main() {
    val a: Int = 128
    val b = a

    println(a === b)
    val c: Int? = a //힙영역 스캔 같은주소지만 그 주소에 가면 다른값
    val d: Int? = a //힙영역 스캔 "
    val e: Int? = c //포인터 e => c => a
    println(c == d)
    println(c === d)
    println(c === e)

}