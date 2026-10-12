package com.example.basickotlin

fun main(){
  // for loop
    for(i in 1..10){
        println(i)
    }
    for(i in 10 downTo  1 step 3){
        println("downTo $i")
    }
    for(i in 0 until 3){
        println("until $i")
    }
    val fruit = listOf<String>("Apple","Mango","Graps","Banana")
    for (f in fruit){
        println(f)
    }
    for((index,f) in fruit.withIndex())
        println("$index  --- $f ")
// while loop
    var n=3
    while (n>0){
        println(" $n..")
        n--
    }

    do {
        println("Run at least one time")
    } while (false)
//
    //  Print the numbers 1 to 15, but print Fizz for multiples of 3, Buzz for multiples of 5 and FizzBuzz for multiples of
    //  both.
    for(i in 1..15){
        println(when{
            i % 15==0 -> "FizzBuzz"
            i % 3==0 -> "Fizz"
            i % 5==0 -> "Buzz"
            else  -> i.toString()
        })
    }

}

