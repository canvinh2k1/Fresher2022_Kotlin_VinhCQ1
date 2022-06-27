package com.example.myapplication

fun main(args: Array<String>) {
    for (i in 10 until 200) {
        if (i % 7 == 0 && i % 5 != 0) {
            print("$i, ")
        }
    }
}
