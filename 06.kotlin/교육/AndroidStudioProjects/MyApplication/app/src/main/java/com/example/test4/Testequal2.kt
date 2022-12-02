package com.example.test4

data class Custmoer3(var name: String, var email: String) {
    var job: String = "Unkown"
    constructor(name: String, email: String, _job: String): this(name, email) {
        job = _job
    }
    init {

    }
}

fun main() {
    val cus1 = Custmoer3("Sean", "Sean@mail.com")
    val cus3 = cus1.copy(name = "Ahn")
    println(cus1.toString())
    println(cus3.toString())
}