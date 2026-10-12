package com.example.basickotlin

import android.service.autofill.Validators.and
import android.util.Log

fun main(){
    println("this is my new kotlin learning")
    val name = "Ankit Kushwaha"
    println("Hello $name")
    println("10 + 20 = ${10+20}")
   // My name is Priya and I am 21 years old
    val age = 20
    println("My name is $name and I am $age years old")
    // define variable
    defineVariableAndPerformOperation()
    exercise()
}



fun defineVariableAndPerformOperation(){
    val appName = "Task Master"
    var download = 1_000
    download +=200

    val rating: Double= 4.7
    val isFree : Boolean = true
    val grade : Char='A'
    val big : Long= 9_00000_000
    val small:Byte= 100
    val price : Float = 1.4f
    val inferred = 42

    println("$appName  | Download=$download | Rating=$rating")
    println("isFree $isFree | grade=$grade  | big=$big  | small=$small | price=$price")

    // multiline String
    val multi= """"
        Line One
        Line two
        Line three
        """
    println(multi)
    println(inferred::class.java)
}
fun exercise() {
 //   Convert 36.6 degrees Celsius to Fahrenheit and print it with one decimal place.

  val celsius=36.6
    val fahrenheit = celsius * 9/5 + 32
    print("$celsius C= ${"%.1f".format(fahrenheit)} F")

}