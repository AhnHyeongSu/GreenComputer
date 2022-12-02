package com.example.test3

fun main() {
    print("Enter the score:")
    var score = readLine()!!.toDouble()
    var grade: Char = 'F'

    when {
        score >= 90.0 -> grade = 'A' //인자가 없어도 같은 함수 안이면 가능
        score in 80.0..89.9 -> grade = 'B'
        score in 70.0..79.9 -> grade = 'C'
        score < 70.0 -> grade = 'F'
    }
    println("Scroe: $score, Grade: $grade")
}