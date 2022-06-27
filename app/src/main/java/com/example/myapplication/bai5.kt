package com.example.myapplication

fun main() {
    val month : Int
    month = readLine()!!.toInt()
    val year : Int
    year = readLine()!!.toInt()
    when (month) {
        2 -> if (checkYear(year)) println("29")
        else println("28")
        4, 6, 9, 11 -> println("30")
        1, 3, 5, 7, 8, 10, 12 -> println("31")
        else -> println("sai")
    }
}

fun checkYear(year: Int) : Boolean {
    return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
}
