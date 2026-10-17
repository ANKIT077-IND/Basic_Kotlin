package com.example.basickotlin

fun main(){
    println(printName("Ankit"))
    println(sum(10,30))
}
fun printName(name: String) : String{
   return "$name"
}
fun sum(num1: Int,num2:Int) : Int{
    return num1+num2
}