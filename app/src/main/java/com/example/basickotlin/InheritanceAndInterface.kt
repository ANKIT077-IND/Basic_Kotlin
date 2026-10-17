package com.example.basickotlin

interface Drawable{
    val name: String
    fun draw(){
        println("name is $name")
    }
}

interface clickable {
    fun onClick()
}

abstract class Shape (override val name: String) : Drawable {
    abstract  fun area() : Double
    open fun discribe()= "name with area ${"%.2f".format(area())}"
}

class circle(val radius: Double): Shape("Circle"){
    override fun area(): Double {
        return  Math.PI * radius* radius
    }

}

fun main(){
    val shape = listOf(circle(10.0))
    shape.forEach {
        println(it.discribe())
        it.draw()
    }
}