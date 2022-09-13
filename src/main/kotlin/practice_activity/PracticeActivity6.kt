//Practice activity 6 -> Activity01-F improvement (Palindrome problem)
fun main(){
    println("Enter string:")
    var input : String = readln()
    palindromeChecker(input)
}

fun palindromeChecker(input: String){
    if (input == input.reversed()) {
        println("$input is a palindrome")
    }else{
        println("$input is not palindrome")
    }

}