fun main(){
    //implicit dec         0      1    2
    // array size = 3
    var names = arrayOf("John","Paul","Mark")
    println(names[0])

    //explicit
    var numbers = arrayOf<Int>(2,3,4,5,110)
    println(numbers[0])

    //array size
    println(numbers.size)
    println("@@@@@@@@")
    println(numbers[0])
    println(numbers[1])
    println(numbers[2])
    //names[1] = "Matther"
    names.set(1, "Matthew")
    println("@@@@@@@@")
    println(names.get(0))
    println(names.get(1))
    println(names.get(2))

}
