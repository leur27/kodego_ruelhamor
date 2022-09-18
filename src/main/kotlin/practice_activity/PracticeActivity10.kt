package practice_activity

fun main(){
    //instantiation
    var cellPhone = SmartPhone(15.50, 12)
//    var cellPhone2 = SmartPhone(15.50)

    //call for buyLoad function
    println("\n**\"buyLoad function\"**")
    println("Enter amount to load:")
    var newAmount : Double = readln().toDouble()
    cellPhone.buyLoad(amount = newAmount)

    //call for chargeBat function
//    println("\n**\"chargeBat function\"**")
//    print("\n[[Assumtion: 5 minutes of charging adds 1% to battery life & decreases by 1% with 5 minutes of used]]")
//    println("\nDid you charge your phone or still charging? Y/N:")
//    var response : String = readln().toString()
//    if (response == "Y" || response == "y"){
//        println("How long has it been charging? (minutes):")
//        var minutes : Int = readln().toInt()
//        var newPercent : Int = minutes/5
//        cellPhone.chargeBat(percent = newPercent)
//    }else if (response == "N" || response == "n"){
//        println("How long has it been turning on? (minutes):")
//        var minutes2 : Int = readln().toInt()
//        val percentage = 12
//        var newPercent2 : Int = percentage - (minutes2/5)
//        println("${percentage - newPercent2}% has been deducted from your existing $percentage% battery life")
//        println("You have $newPercent2% power left.")
//    }else{
//        println("Wrong input, enter a valid answer")
//    }

    //call for sendText function
//    println("\n**\"sendText function\"**")
//    println("Enter recipient name:")
//    var name : String = readln()
//    println("Type your message:")
//    var newMessage : String = readln()
//    println("\nMessage sent to: -> $name <-")
//    cellPhone.sendText(message = newMessage)

    //call for checkBalance function
//    println("\n**\"checkBalance function\"**")
//    println("Balance inquiry? Y/N")
//    var answer : String = readln()
//    if (answer == "Y" || answer == "y"){
//        println("How many texts messages did you send?")
//        var text : Double = readln().toDouble()
//        println("How long was your previous call lasts? (minutes)")
//        var call : Double = readln().toDouble()
//        var  call2 : Double = 0.0
//        call = call*8
//        var newBalance : Double = 0.0
//        newBalance = newAmount-(text+call2)
//        cellPhone.checkBalance(balance = newBalance)
//    }else{
//        println("Nothing to show")
//    }

    //call for makeCalls function
//    println("\nHow much is your load? ")
//    var call : Double = readln().toDouble()
//    cellPhone.makeCalls(loadCall = call)

}

class SmartPhone(var load : Double, var batCapacity : Int){
    var eLoad : Double = load
    var percentage : Int = batCapacity

    init {
        println("---------------------Phone Status----------------------")
        println("Your initial balance is Php ${load}0 and battery life of $batCapacity%")
    }
    constructor(load:Double): this(load, 12)

    //does not accept zero or negative values
    fun buyLoad(amount:Double) {
        if (amount > 0){
            println("You have added Php ${amount}0 to your (P15.50) existing load")
            println("Your total load is Php ${amount + eLoad}0 ")
        }else{
            println("Php $amount is an invalid amount")
        }
    }
    //(percent)-> does not accept zero or negative values
    fun chargeBat(percent:Int){

        if (percent > 0){
            println("Your existing $percentage% battery level has been charged with additional power of $percent%")
            println("Your phone's current battery life is ${percent + percentage}% in total")
        }else{
            println("You have ${percent}% power left.")
        }
    }
    //-> display message sent
    fun sendText(message:String){
        println("Your message is: ${message.uppercase()}")
    }
    //-> display current load, if zero: display "Check operator services"
    fun checkBalance(balance:Double){

        if (balance > 0){
            println("Your current balance is Php ${balance}0")
        }else{
            println("Check operator services")
        }
    }
    //(minutes)-> 8 load per minute, will not push through if no sufficient load
    fun makeCalls(loadCall:Double){
        if (loadCall > 7){
            println("You only have ${loadCall/8} minutes of call to make")
        }else{
            println("Insufficient load!")
        }
    }

}


