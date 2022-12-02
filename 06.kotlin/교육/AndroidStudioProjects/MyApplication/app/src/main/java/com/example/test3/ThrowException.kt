package com.example.test3

import java.lang.Exception

class InvalidNameExecption(message : String) : Exception(message)

fun main() {
    var name = "kildong123"
    try {
        validateName(name)
    }catch (e : InvalidNameExecption) {
        println(e.message)
    }catch (e : Exception) {
        println(e.message)
    }
}

fun validateName(name : String) {
    if(name.matches(Regex(".*\\d+.*"))) {
        throw InvalidNameExecption("Your name : $name : contains numelals.")
    }
}