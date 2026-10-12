package com.example.basickotlin

import android.util.Log.i

fun main(){
  var age = 20
  var status = if(age>=18) "Adult" else " minor"
  println(status)
  println(grade(70))
  println(grade(43))
  println(describe(0))
  println(describe(10))
  println(describe("ankit"))
  println(describe(listOf(1,2,3)))
  println(describe(1.4))
  val day=3
  var days = when(day){
      1 -> "monday"
     in 2..6 -> "weekdays"
      else -> "unknown"
  }
    println("days: $days")
  println(exercise(1))
  println(exercise(10))
  println(exercise(100))
  println(exercise(30))
}

fun grade(score:Int) : String = when {
    score !in 0..100 -> "Invalid"
    score >=90 -> "A"
    score >=75 -> "B"
    score >=50 -> "C"
    else -> "F"
}
fun describe(x:Any) : String = when (x) {
   0 -> "Zero"
   is Int -> "Int is $x"
   is String -> "String of the length is ${x.length}"
   is List<*> -> "List of size is ${x.size}"
   else -> "Unknown"
}

fun exercise(age: Int) : Int= when(age) {
   // Write ticketPrice(age: Int): Int returning 0 for under 3, 5 for ages 3-12, 10 for 13-59, and 7 for 60 and
   // above
   in 0..2 -> 3
   in 3..12 -> 5
   in 13..59 -> 10
   else -> 7
}