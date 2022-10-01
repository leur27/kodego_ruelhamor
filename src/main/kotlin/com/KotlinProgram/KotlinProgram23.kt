fun main() {
    var result : Int = cube(2)
    println(result)

    println(add(5,1))
}

//with return, 1 parameter
fun cube(number : Int) : Int {
    return number * number * number
}

//with return,  parameters
fun add(number1 : Int, number2 : Int) : Int {
    println("Welcome to add function")
    return number1 + number2
}