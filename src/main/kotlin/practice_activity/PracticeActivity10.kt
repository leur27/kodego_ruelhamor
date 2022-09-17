package practice_activity

fun main(){
    //instantiation
    var cellPhone = SmartPhone(15.50, 12)
//    var cellPhone2 = SmartPhone(15.50)

    //call for buyLoad function
//    println("\nEnter amount to load:")
//    var newAmount : Double = readln().toDouble()
//    cellPhone.buyLoad(amount = newAmount)

    //call for chargeBat function
//    print("\n*** 5 minutes of charging adds 1% to battery life & decreases by 1% with 5 minutes of used ***")
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
//        println("You have $newPercent2% power left.")
//    }else{
//        println("Wrong input, enter a valid answer")
//    }

    //call for sendText function
//    println("\nType your message:")
//    var message : String = readln()
//    cellPhone.sendText(message = message)

    //call for checkBalance function
//    println("\nHow much load did you buy?")
//    var balance : Double = readln().toDouble()
//    cellPhone.checkBalance(balance = balance)

    //call for makeCalls function
    println("\nHow much is your load? ")
    var call : Double = readln().toDouble()
    cellPhone.makeCalls(loadCall = call)

}

class SmartPhone(var load : Double, var batCapacity : Int){
    var eLoad : Double = load
    var percentage : Int = batCapacity

    init {
        println("---------------------Phone Status----------------------")
        println("Your initial balance is Php $load and battery life of $batCapacity%")
    }
    constructor(load:Double): this(load, 12)

    //does not accept zero or negative values
    fun buyLoad(amount:Double) {
        if (amount > 0){
            println("You have added Php $amount to your load")
            println("Your total load is Php ${amount + eLoad} ")
        }else{
            println("Php $amount is an invalid amount")
        }
    }
    //(percent)-> does not accept zero or negative values
    fun chargeBat(percent:Int){

        if (percent > 0){
            println("The power charged in your battery is $percent")
            println("Your phone's current battery life is ${percent + percentage} ")
        }else{
            println("You have $percentage% power left.")
        }
    }
    //-> display message sent
    fun sendText(message:String){
        println("Message sent: ${message.uppercase()}")
    }
    //-> display current load, if zero: display "Check operator services"
    fun checkBalance(balance:Double){
        if (balance > 0){
            println("You have added Php $balance to your load")
            println("Your total load is Php ${balance + eLoad} ")
        }else if(balance < 0){
            println("You have entered an invalid amount")
        }else{
            println("Check operator services")
        }
    }
    //(minutes)-> 8 load per minute, will not push through if no sufficient load
    fun makeCalls(loadCall:Double){
        if (loadCall > 7){
            println("You have ${loadCall/8} minutes of call")
        }else{
            println("Insufficient load!")
        }
    }

    fun callDuration(loadCall: Double) {

    }
}


