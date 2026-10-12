package com.example.basickotlin

fun main (){
   var nickname: String?=null
   println(nickname?.length)
   println(nickname?.length?:0 )

   nickname = "Ri"
    println(nickname.length)
   nickname?.let {
      println("Nickname is $it")
   }
val label = readCity() ?:"unknown"
    println(label)
 val S: String?="Kotlin"
  val length=S?.takeIf { it.isNotBlank() }?.length ?: -1
    println(length)
  printLength(null)
    printLength("Ankit")
    println(exercise("an","ankit"))
}
fun readCity() : String?= null
fun printLength(title : String?){
  val length = title?.length ?: return
    println("Length:"+length)

}

fun exercise(first: String?,second: String?) : String{
    //  Write initials(first: String?, last: String?) that returns the two upper-case initials, or "NA" when either
    //name is null or blank.

    if (first.isNullOrBlank() || second.isNullOrBlank()){
     return "NA"
    }
    else{
      return "${first.first().uppercaseChar()}  ${second.first().uppercaseChar()}"
    }

}