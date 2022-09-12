fun main(){

    displayName()
    displayMessage("My name is Jack!")

//    println("Enter number 1:")
//    var number : Int = readln().toInt()
//
//    println("The cube is: ${number * number * number}")
//
//    println("Enter number 2:")
//    var number2 : Int = readln().toInt()
//
//    println("The cube is: ${number2 * number2 * number2}")

}

//no return, no parameter [fun displayName() = fun displayName():Unit]
fun displayName():Unit {
    println("Peter")
}

//no return, with 1 parameter
fun displayMessage(msg : String) {
    println("The message is \"$msg\" ")
}

//function (Kotlin) -> methods (Java) -> stored procedure -> sub procedure

//built-in standard functions in Kotlin - starts with small letter
//abstraction
//println()
//toInt()
//readln()
//main()
//arrayOf()
//listOf()

//user-defined functions
