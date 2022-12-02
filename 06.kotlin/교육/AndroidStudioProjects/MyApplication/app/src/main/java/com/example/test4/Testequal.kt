package com.example.test4

data class Customer2(var name: String, var email: String) {
    var job: String = "Unknown"
    constructor(name: String, email: String, _job:String): this(name, email) {
        job = _job
    }
}









fun main() {
    val cus1 = Customer2("Sean", "sean@mail.com")
    val cus2 = Customer2("Sean", "sean@mail.com")
    println(cus1 == cus2)
    println(cus1.equals(cus2))
    println("${cus1.hashCode()}, ${cus2.hashCode()}") //논리적인 주소값은 다르지만, 물리적인 주소값은 라이브러리에 의해서 같다
}