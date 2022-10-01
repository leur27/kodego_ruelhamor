fun main(){

    var numComparator = NumberComparator()
    println(numComparator.getMaxNumber(3,2,6))

}

class NumberComparator(){

    fun getMaxNumber(num1:Int, num2:Int, num3:Int):Int {
        var maxValue: Int
        if ((num1 >= num2) && (num1 >= num3)){
            maxValue=num1
        }else if ((num2 >= num3) && (num2 >= num1)){
            maxValue=num2
        }else if ((num3 >= num2) && (num3 >= num1)) {
            maxValue = num3
        }else{
           maxValue = 0
        }
        return maxValue
    }

}