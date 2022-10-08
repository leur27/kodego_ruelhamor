package com.oop

//Abstraction
//Encapsulation
open class Person(name:String, age:Int){
    var name: String = name
    var age: Int = age

    init{
        println("Object Created!")
        println("name is $name, age is $age")
    }

    open fun displayName(){
        println("Name is $name")
    }
    fun displayName(name:String){
        println("Name is $name")
    }
    fun displayName(numberOfTimes:Int){
        var ctr = numberOfTimes - 1
        while(ctr >=0){
            println("Name is $name")
            ctr--
        }
    }

//    open fun displayAge(){
//        println("Age is $age")
//    }
}