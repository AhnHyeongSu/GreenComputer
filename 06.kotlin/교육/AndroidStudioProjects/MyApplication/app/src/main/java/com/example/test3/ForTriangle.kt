package com.example.test3

fun main() {
    print("Enter the lines: ")
    val n = readLine()!!.toInt()

    for (line in 1..n) {
        for (space in 1..(n-line)) print(" ")
        for (star in 1..(2* line -1)) print("*")
        println()
    }

    for (line in n downTo 1) {
        for (space in 1..(n - line)) print(" ")
        for (star in 1..(2 * line -1)) print("*")
        println()
    }
}