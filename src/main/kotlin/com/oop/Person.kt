package com.oop

//Abstraction
//Encapsulation
open class Person{
    var name: Any = "John"
        get() {return field}
        set(value){
            field = value
        }
    var age: Int = 23
        get() {return field}
        set(value) {
            if (value < 1){
                println("Invalid Age")
            }else{
                field = value
            }
        }

    init{
        println("Object Created!")
        println("name is $name, age is $age")
    }

    fun upAge():Int{
        age++
        return age
    }

//    fun setAge(name:Int):Int{
//
//    }

    fun change(age:Int){
        println(this.age)
    }

}