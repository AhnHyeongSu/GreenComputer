package com.example.test4

class User(_id: Int, _name: String, _age: Int) {
    //프로퍼티
    val id: Int = _id
    get() = field //프로퍼티를 참조하는 변수로 보조필드로 불림

    var name: String = _name
    get()= field
    set(value) {
        field = value
    }

    var age: Int = _age
    get() = field
    set(value) {
        field = value
    }
}

fun main() {
    val user1 = User(1, "kildong", 30)
    // user1.id = 2 // val이라 에러
    user1.age = 35 //세터동작
    println("user1.age = ${user1.age}") //게터동작
}