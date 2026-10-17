package com.example.basickotlin

fun main(){

    val a=10
    val b=40
    println(a+b)
    println(a-b)
    println(a*b)
    println(a/b)

    var counter=0
    counter++
    counter +=5
    counter *=2
    println(counter)

    println(a>b)
    println(a<b)
    println(a==b)

    println(5 in 1..10)
}