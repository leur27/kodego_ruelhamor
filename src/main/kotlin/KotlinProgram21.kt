fun main(){

    //instantiation - process of creating an object
//    var myObject = MyClass("Hello World")
//    var myObject2 = MyClass("Hi Earth")
//
    var myGenericObject = MyGenericClass("words")
    var myGenericObject2 = MyGenericClass(3.1416)
}

class  MyGenericClass<T>(content : T){
    init {
        println(content.toString().length)
    }
}

class MyClass(word : String){
    init{
        println(word)
        println(word.length)
    }
}

class MyClass2(value : Int){
    init{
        println(value)
        println(value.toString().length)
    }
}
/*
class -> objects
objects -> variables
        -> functions(process)

(class) uppercase -> first letter
samples:
String
Int
 */

