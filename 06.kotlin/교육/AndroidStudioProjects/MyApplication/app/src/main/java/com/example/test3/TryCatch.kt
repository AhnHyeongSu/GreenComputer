package com.example.test3

import java.lang.ArithmeticException
import java.lang.Exception

fun main() {
    val a = 6
    val b = 0
    val c : Int

//    try {
//        c= a/b
//    } catch (e : Exception){
//        println("Exception is handled")
//    } finally {
//        println("finally 블록은 반드시 항상 실행됨.")
//    }

//    try {
//        c= a/b
//    } catch (e: ArithmeticException){
//        println("Exception if handled. ${e.message}")
//    } finally {
//        println("finally 블록은 반드시 항상 실행됨.")
//    }

    try {
        c= a/b
    } catch (e: Exception){
        e.printStackTrace()
    } finally {
        println("finally 블록은 반드시 항상 실행됨.")
    }
}