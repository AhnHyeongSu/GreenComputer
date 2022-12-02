package com.example.test3

fun main(args: Array<String>) {
    nomalVarargs(1, 2, 3, 4)
    nomalVarargs(4, 5, 6)
}

fun nomalVarargs(vararg counts: Int) {
    for (num in counts) {
        println("$num")
    }
    print("\n")
}