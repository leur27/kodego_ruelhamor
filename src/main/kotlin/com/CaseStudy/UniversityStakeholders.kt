package com.CaseStudy

open class UniversityStakeholders: UniversityRegistrar {

    //Settng-up for student account 1.UserName, 2.Password
    val studentUserName = mutableSetOf("John", "Luke", "Matthew")
    val studentPassword = mutableSetOf("password1", "password2", "password3")
    //Settng-up for faculty account1.UserName, 2.Password
    val teacherUserName = mutableSetOf("Eve", "Mary", "Esther")
    val teacherPassword = mutableSetOf("password4", "password5", "password6")
    //Settng-up for admin account1.UserName, 2.Password
    val adminUserName = mutableSetOf("Noy", "Van", "Ysa")
    val adminPassword = mutableSetOf("password7", "password8", "password9")

    //Map of enrolled Student ID to: 1.Name, 2.Age, 3.Course, 4.Year, 5.Section,
    val enrolledStudent = mutableMapOf(3001 to "John Juan", 3002 to "Luke Lucas", 3003 to "Matthew Mateo")
    val enrolledStudent2 = mutableMapOf(3001 to 21, 3002 to 20, 3003 to 19)
    val enrolledStudent3 = mutableMapOf(3001 to "BSIT", 3002 to "BSECE", 3003 to "BSEd")
    val enrolledStudent4 = mutableMapOf(3001 to 4, 3002 to 3, 3003 to 2)
    val enrolledStudent5 = mutableMapOf(3001 to "Comp-A", 3002 to "Eng-B", 3003 to "Ed-C")

    //Set for subjects enrolled
    val johnSubjects = mutableSetOf("Discrete Math", "C Language", "Artificial Intelligence")
    val lukeSubjects   = mutableSetOf("Circuits", "Electronics", "Differential Equation")
    val matthewSubjects = mutableSetOf("Environmental Science", "Sociology", "Economics")
    //Map for schedule of subjects
    val johnSchedule = mutableMapOf("Discrete Math" to "MWF 9-10am", "C Language" to "TTh 9-10:30am", "Artificial Intelligence" to "MWF 10-11am")
    val lukeSchedule = mutableMapOf("Circuits" to "TTh 10:30-12nn", "Electronics" to "MWF 11-12nn", "Differential Equation" to "TTh 1-2:30pm")
    val matthewSchedule = mutableMapOf("Environmental Science" to "MWF 1-2pm", "Sociology" to "TTH 2:30-4pm", "Economics" to "MWF 2-3pm")
    //Set for available time, part-time is halfday only while regular is whole day duty
    val johnFreeTime = mutableSetOf("MWF: 11-12nn, 1-3pm", "TTh: 10:30-12nn, 1-3pm")
    val lukeFreeTime   = mutableSetOf("MWF: 1-3pm", "TTh: 29-10:30am")
    val matthewFreeTime = mutableSetOf("MWF: 9-12nn", "TTh: 9-12nn, 1-2pm")

    //List of Messages Inboxes for 1.Eve, 2.Mary, 3.Esther
    val johnInbox = mutableListOf("MESSAGES: ")
    val lukeInbox = mutableListOf("MESSAGES:")
    val matthewInbox = mutableListOf("MESSAGES:")
    val eveInbox = mutableListOf("MESSAGES:")
    val maryInbox = mutableListOf("MESSAGES:")
    val estherInbox = mutableListOf("MESSAGES:")
    //List of Sent Items for 1.Eve, 2.Mary, 3.Esther
    val johnSentItems = mutableListOf("MESSAGES:")
    val lukeSentItems = mutableListOf("MESSAGES:")
    val matthewSentItems = mutableListOf("MESSAGES:")
    val eveSentItems = mutableListOf("MESSAGES:")
    val marySentItems = mutableListOf("MESSAGES:")
    val estherSentItems = mutableListOf("MESSAGES:")


    open fun checkIfEnrolled(universityID: Int){

    }

    open fun setLoginCredentials(userName: String, password: String){

    }
    open fun checkLoginCredentials(userName: String, password: String){

    }
    open fun changePassword(newPassword: String, password: String){

    }
    open fun deleteAccount(userName: String, password: String){

    }

    open fun viewUserAccounts(universityID: Int){

    }

    open fun deleteUserAccounts(universityID: Int, name: String){

    }
    fun postAnnouncement(message: String){
        println("\n $message \n")
    }

    fun editAnnouncement(){
        println("Type your new message ")
    }

    fun johnSendMessage(message: String, name: String, recipient: String){
        when(name){
            "John" -> println("\nSent to: $recipient \nSent by: $name \nMessage: $message \n${johnSentItems.add(message)}\n")
            "Luke" -> println(" ")
            "Matthew" -> println(" ")
            else -> {println("Don't match")}
        }
    }

    fun lukeSendMessage(message: String, name: String, recipient: String){
        when(name){
            "John" -> println(" ")
            "Luke" -> println("\nSent to: $recipient \nSent by: $name \nMessage: $message \n${lukeSentItems.add(message)}\n")
            "Matthew" -> println(" ")
            else -> {println("Don't match")}
        }
    }

    fun matthewSendMessage(message: String, name: String, recipient: String){
        when(name){
            "John" -> println(" ")
            "Luke" -> println(" ")
            "Matthew" -> println("\nSent to: $recipient \nSent by: $name \nMessage: $message \n${matthewSentItems.add(message)}\n")
            else -> {println("Don't match")}
        }
    }

    fun eveGetMessage(message: String, name: String, recipient: String){
        val universityStakeholders = UniversityStakeholders()
        if (recipient=="Eve" && name=="John"){
            println(universityStakeholders.johnSendMessage(message, name, recipient))
            eveInbox.add(message)
        }else if (recipient=="Eve" && name=="Luke"){
            println(universityStakeholders.lukeSendMessage(message, name, recipient))
            eveInbox.add(message)
        }else if (recipient=="Eve" && name=="Matthew"){
            println(universityStakeholders.matthewSendMessage(message, name, recipient))
            eveInbox.add(message)
        }else{
            println(" ")
        }
    }

    fun maryGetMessage(message: String, name: String, recipient: String){
        val universityStakeholders = UniversityStakeholders()
        if (recipient=="Mary" && name=="John"){
            println(universityStakeholders.johnSendMessage(message, name, recipient))
            maryInbox.add(message)
        }else if (recipient=="Mary" && name=="Luke"){
            println(universityStakeholders.lukeSendMessage(message, name, recipient))
            maryInbox.add(message)
        }else if (recipient=="Mary" && name=="Matthew"){
            println(universityStakeholders.matthewSendMessage(message, name, recipient))
            maryInbox.add(message)
        }else{
            println(" ")
        }
    }

    fun estherGetMessage(message: String, name: String, recipient: String){
        val universityStakeholders = UniversityStakeholders()
        if (recipient=="Esther" && name=="John"){
            println(universityStakeholders.johnSendMessage(message, name, recipient))
            estherInbox.add(message)
        }else if (recipient=="Esther" && name=="Luke"){
            println(universityStakeholders.lukeSendMessage(message, name, recipient))
            estherInbox.add(message)
        }else if (recipient=="Esther" && name=="Matthew"){
            println(universityStakeholders.matthewSendMessage(message, name, recipient))
            estherInbox.add(message)
        }else{
            println(" ")
        }
    }

    fun eveSendMessage(message: String, name: String, recipient: String){
        when(name){
            "Eve" -> println("\nSent to: $recipient \nSent by: $name \nMessage: $message \n${eveSentItems.add(message)}\n")
            "Mary" -> println(" ")
            "Esther" -> println(" ")
            else -> {println("Don't match")}
        }
    }

    fun marySendMessage(message: String, name: String, recipient: String){
        when(name){
            "Eve" -> println(" ")
            "Mary" -> println("\nSent to: $recipient \nSent by: $name \nMessage: $message \n${marySentItems.add(message)}\n")
            "Esther" -> println(" ")
            else -> {println("Don't match")}
        }
    }

    fun estherSendMessage(message: String, name: String, recipient: String){
        when(name){
            "Eve" -> println(" ")
            "Mary" -> println(" ")
            "Esther" -> println("\nSent to: $recipient \nSent by: $name \nMessage: $message \n${estherSentItems.add(message)}\n")
            else -> {println("Don't match")}
        }
    }

    fun johnGetMessage(message: String, name: String, recipient: String){
        val universityStakeholders = UniversityStakeholders()
        if (recipient=="John" && name=="Eve"){
            println(universityStakeholders.eveSendMessage(message, name, recipient))
            johnInbox.add(message)
        }else if (recipient=="John" && name=="Mary"){
            println(universityStakeholders.marySendMessage(message, name, recipient))
            johnInbox.add(message)
        }else if (recipient=="John" && name=="Esther"){
            println(universityStakeholders.estherSendMessage(message, name, recipient))
            johnInbox.add(message)
        }else{
            println(" ")
        }
    }

    fun lukeGetMessage(message: String, name: String, recipient: String){
        val universityStakeholders = UniversityStakeholders()
        if (recipient=="luke" && name=="Eve"){
            println(universityStakeholders.eveSendMessage(message, name, recipient))
            lukeInbox.add(message)
        }else if (recipient=="luke" && name=="Mary"){
            println(universityStakeholders.marySendMessage(message, name, recipient))
            lukeInbox.add(message)
        }else if (recipient=="luke" && name=="Esther"){
            println(universityStakeholders.estherSendMessage(message, name, recipient))
            lukeInbox.add(message)
        }else{
            println(" ")
        }
    }

    fun matthewGetMessage(message: String, name: String, recipient: String){
        val universityStakeholders = UniversityStakeholders()
        if (recipient=="matthew" && name=="Eve"){
            println(universityStakeholders.marySendMessage(message, name, recipient))
            matthewInbox.add(message)
        }else if (recipient=="matthew" && name=="Mary"){
            println(universityStakeholders.marySendMessage(message, name, recipient))
            matthewInbox.add(message)
        }else if (recipient=="matthew" && name=="Esther"){
            println(universityStakeholders.estherSendMessage(message, name, recipient))
            matthewInbox.add(message)
        }else{
            println(" ")
        }
    }

}