fun main(){

    println(total (2, 4, 5, 5))
    var numbers = arrayOf<Int>(0,0,0)

    println(total2(2,4,6,7,8,4,5,6,1))

//    for(i in 1..3){
//        println("Enter a number $i+1:")
//        var input : Int = readln().toInt()
//        numbers.add(input)
//        numbers[i] + input

//    }
//    println(total2(numbers))
}

fun total(num1 : Int, num2 : Int, num3 : Int, num4 : Int): Int{
    println("This is a total function")
    return num1 + num2 + num3 + num4
}

fun total2(vararg numbers:Int):Int {
    var sumOfAllNumbers: Int = 0
    for (num in numbers) {
        sumOfAllNumbers = sumOfAllNumbers + num
    }
    return sumOfAllNumbers
}
