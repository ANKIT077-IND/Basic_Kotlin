package com.example.basickotlin

 fun main(){
     for (i in 1..10){
         println(i)
     }

     for(i in 10 downTo 1 step 2){
         println(i)
     }

     for (i in 0 until 8){
      println(i)
     }

     // while
     var n=3
     while (n>0){
      println("numbar is $n")
         n--
     }



 }