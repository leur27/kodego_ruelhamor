fun main(){


}

class empty{}

//class Outer{
//
//    val name = "Outer"
//    fun show() = "The name $name"
//
//    class  Nested{
//        val name = "Nested"
//        fun show() = "The name $name"
//    }
}

class Outer2 {

    val name1 = "Outer2"
    fun show() = "The name $name1"

    class Inner {
        val name2 = "Inner"
        fun show() = "The name $name2"
    }
}

//sealed class
//open class
//abstract class
//data class



//fun main(){
//
//    var john = Person()
//    var joe = Person()
//    println("John's memory address is $john")
//    println("Joe's memory address is $joe")
//
//    println(john == joe)
//
//    john.name = "Ludwig"
//    println(john.name)
//
//    println(joe.name)
//
//}
//
//class Person{
//    var name : String = "Default name"
//    init{
//        println("Hello $name")
//    }
//
//    fun walk(){
//        println("Walking...")
//    }
//}