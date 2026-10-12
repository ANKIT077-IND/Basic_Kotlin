package com.example.basickotlin

fun main(){
    val a=10
    val b= 20
    println(a+b)
    println(a-b)
    println(a*b)
    println(a/b)

    var counter=0
    counter++
    counter += 5
    counter *= 2
    println("counter $counter")

    println(a > b && b>0)
    println(a >0 && b==5)
    println(5 in 1..10)
    println(5 in 1 until 5)
    println(5 !in 1..5)


}