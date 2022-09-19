package practice_activity

fun main(){
    //instantiation
    val cellPhone = SmartPhone(15.50, 12)
    var condition : Boolean = true
    lateinit var newPercent2: Number
    lateinit var newPercent: Number
    lateinit var recipient: String
    lateinit var newAmount: Number
    lateinit var message: String
    lateinit var minutes: Number
    lateinit var answer: String
    lateinit var input3: Number
    lateinit var select: Number
    lateinit var input2: Number
    lateinit var input: Number
    lateinit var call: Number

//    var cellPhone2 = SmartPhone(15.50)

    while(condition){
        println("--------------------------------------------")
        println("---Select an option---")
        println("[1] Reload Sim\n[2] Battery Recharge\n[3] Write Messages\n[4] Balance Inquiry\n[5] Make Calls\n[6] Power Status\n[0] Exit App\nEnter here:")
        println("--------------------------------------------")
        select = readln().toInt()
        if (select == 1){
            println("Enter amount to load: ")
            newAmount = readln().toDouble()
            cellPhone.buyLoad(newAmount)
        }else if (select == 2){
            println("[ Assumption: 1% power added per 2 minutes of charging & reduce by 1% every 2 minutes used  ]")
            println("Would you like to charge the battery? Y/N: ")
            answer = readln()
            if (answer=="Y"||answer=="y") {
                println("Percentage needed to full: ${100 - cellPhone.batCapacity}% \nCharging time needed to full: ${(100 - cellPhone.batCapacity) / 2} minutes")
                println("Choose: \n[1] Charged already \n[0] Return to Menu")
                input = readln().toInt()
                if (input == 1) {
                    println("Actual minutes of charging (minutes): ")
                    minutes = readln().toInt()
                    newPercent = minutes * 2
                    cellPhone.chargeBat(percent = newPercent)
                } else {
                    continue
                }
            }else{
                println("Percentage left to use: ${cellPhone.batCapacity}%\nTime left to shut down: ${(cellPhone.batCapacity)/2}")
                println("Choose: \n[1] Dont Charge \n[0] Return to Menu")
                input2  = readln().toInt()
                if (input2 == 1){
                    println("Actual used without charging (minutes): ")
                    minutes = readln().toInt()
                    newPercent2 = minutes*2
                    cellPhone.powerUpdate(percent2 = newPercent2)
                }else{
                    continue
                }
            }
        }else if (select==3){
            println("Recipient name: ")
            recipient = readln()
            println("Type your message: ")
            message = readln()
            cellPhone.sendText(message)
            println("Received by: ${recipient.uppercase()}")
        }else if (select==4){
            cellPhone.checkBalance(balance = cellPhone.load)
        }else if (select==5){
            if (cellPhone.load > 0.0){
                println("How long your call will take? (minutes):")
                cellPhone.makeCalls(readln().toDouble())
                println("[1] Call\n[0] Cancel")
                input3 = readln().toInt()
                if (input3==1){
                    println("Actual minutes of call made:")
                    call = (readln().toInt())
                    println("${cellPhone.load - call} minutes of call left")
                }else{
                    continue
                }
            }else{
                println("Check operator services")
            }
        }else if (select==6){
            cellPhone.powerUpdate(percent2 = cellPhone.batCapacity)
        }else{
            println("Enter a valid option")
            condition = false
        }
    }
}

class SmartPhone(var load : Double, var batCapacity : Int){


    init {
        println("---------------------Phone Status----------------------")
        println("Your initial balance is Php ${load}0 and battery life of $batCapacity%")
    }
//    constructor(load:Double): this(load, 12)

    fun buyLoad(amount:Double) {                                                        //does not accept zero or negative values
        if (amount > 0){
            load += amount
        }else{
            println("You entered an invalid amount")
        }
    }
    fun chargeBat(percent:Int){                                                         //(percent)-> does not accept zero or negative values

        if (percent > 0){
            batCapacity += percent
            if (batCapacity>=100){
                println("Battery Full")
            }else{
                println("Battery Charged ")
            }
        }else{
            println("Battery is empty!")
        }
    }
    fun sendText(message:String){                                                       //-> display message sent
        if (load>0){
            println("Message sent: \"$message\"")
            load--
            if (load<0){
                load = 0.0
            }
        }else{
            println("Check operator services")
        }
    }
    fun checkBalance(balance:Double){                                                   //-> display current load, if zero: display "Check operator services"
        if (load > 0){
            println("Your current balance is Php ${balance}0")
        }else{
            println("Check operator services")
        }
    }
    fun makeCalls(minutes:Double){                                                       //(minutes)-> 8 load per minute, will not push through if no sufficient load
        val loadCall = minutes*8

        if (load == loadCall){
            println("You only have a minute of call")
        }else if (load < loadCall){
            println("Insufficient load!")
        }else{
            println("${load/8} minutes of call available")
        }
    }
    fun powerUpdate(percent2:Int){
           if (percent2==batCapacity){
               println("${batCapacity}% remaining: shutting down")
           }else if (percent2<batCapacity){
               println("${batCapacity}% remaining: ${batCapacity/2} minutes to use")
           }else{
               println("Dead Battery!!!")
           }
    }
}













