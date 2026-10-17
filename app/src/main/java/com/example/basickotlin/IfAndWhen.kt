package com.example.basickotlin

fun main() {
    val age = 21
    val status = if (age >= 18) "Adult" else "minor"
    println(status)
     val day=3
    val kind = when(day){
        1,7 -> "Weekend"
      in  2..7 -> "Week days"
      else -> "invalid day"
    }

    println(kind)
}