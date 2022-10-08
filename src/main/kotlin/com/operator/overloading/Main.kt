package com.operator.overloading

//a+b a.plus(b)
//a-b a.minus(b)
//a*b.times(b)
//a/b a.div(b)
//a%b a.plus(b)

fun main(){
    var newMath = NewMath("John")
    newMath.plus(8)
    newMath+8
    println(2+2)
}

public class NewMath(name:String){
    var name: String = name

    operator fun plus(num:Int){
        println("$name has the number $num")
    }
}

