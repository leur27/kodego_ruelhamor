//Practice activity 6 -> Activity01-F improvement (Palindrome problem)
fun main(){
    println("Enter a word:")
    var input : String = readln()

    println("You entered the word $input")
    palindromeChecker(input)
}

fun palindromeChecker(input: String){
    if (input == input.reversed()) {
        println("$input is a palindrome")
    }else{
        println("$input is not palindrome")
    }

}