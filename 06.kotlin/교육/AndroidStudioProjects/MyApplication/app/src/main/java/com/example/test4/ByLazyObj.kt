package com.example.test4

class Person4(val name: String, val age: Int)

fun main() {
    var isPersonInstantiated: Boolean = false

    val person: Person4 by lazy {
        isPersonInstantiated = true
        Person4("kim", 23)
    }
    val personDelegate = lazy { Person4("hong", 40) }

    println("person Init: $isPersonInstantiated")
    println("personDelegate Init: ${personDelegate.isInitialized()}")

    println("person.name = ${person.name}") // ⑤ 이 시점에서 초기화
    println("personDelegate.value.name = ${personDelegate.value.name}") // ⑥ 이 시점에서 초기화

    println("person Init: $isPersonInstantiated")
    println("personDelegate Init: ${personDelegate.isInitialized()}")
}
