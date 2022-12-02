package com.example.test4

//커스텀 게터와 세터의 사용
class User1(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
    var name: String = _name
    set(value) {
        println("The name was changed")
        field = value.toUpperCase() // 1.받은인자를 대문자로 변경
    }

    var age: Int = _age
}

fun main() {
    val user1 = User1(1, "kildong", 35)
    user1.name = "coco" // 2. 여기서 사용자 고유의 출력코드가 실행
    println("user3.name = ${user1.name}")
}