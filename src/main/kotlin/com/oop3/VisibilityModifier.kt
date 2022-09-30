package com.oop3

//public - accessed anywhere, default
//private - within the class only
//protected - within the class and subclass
//internal - accessible within a module


fun main(){
    var obj = ClassA()
    println(obj.name)
//    println(obj.age)
//    println(obj.address)
}


open class ClassA{
    public var name:String = "Peter"
    private var age:Int = 23
    protected var address:String = "NY"
}

class ClassB : ClassA(){

    init {
        println(address)
//        println(age)
    }
}