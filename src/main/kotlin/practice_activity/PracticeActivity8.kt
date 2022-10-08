  fun main(){

    var numbers = intArrayOf(0,0,0)

//    println("You entered numbers: $num1, $num2, $num3")

    for(i in 0..2){
        println("Enter number ${i+1}:")
        var num : Int = readln().toInt()
        numbers[i] = num
    }
    println("You entered: ${numbers[0]}, ${numbers[1]}, ${numbers[2]}")
    println(maxNumber())

}

fun maxNumber(vararg numbers:Int):Int{

    var maxNumber : Int = 0
    var ctr : Int = 1

    for(value in numbers){
        while (value == numbers.max()) {
            println("The maximum number is $value")
        }
        ctr++
    }

    return maxNumber
}

//if (numbers[0] > numbers[1] && numbers[0] > numbers[2]){
//    maxNumber = numbers[0]
//}else if(numbers[1] > numbers[2] && numbers[1] > numbers[0]){
//    maxNumber = numbers[1]
//}else{
//    maxNumber = numbers[1]
//}
