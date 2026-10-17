package com.example.basickotlin

fun main(){
    var name: String?=null
    println(name?.length)
    println(name?.length ?: 0)

    name="Hi"
    println(name.length)
    name?.let {
        println("My name is $name")
    }


}