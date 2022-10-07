package com.CaseStudy

fun main(){

    val universityStakeholders = UniversityStakeholders()
    val universityStudent = UniversityStudents()
    val universityFaculty = UniversityFaculties()
    val universityAdmin = UniversityAdminStaff()
    var condition = true
    var universityID: Int
    var studentID: Int
    var select: Int
    var option: Int
    var choose: Int
    var input: Int
    var reply: String
    var name: String = ""
    var message: String = " "
    var oldSubject: String
    var newSubject: String
    var userName: String
    var password: String
    var newPassword: String
    var numberOfSubjects: Double
    var age: Int = 0
    var course: String = ""
    var year: Int = 0
    var section: String = ""

    println("=======================================================")
    println("==||  ||=========||    ,===/    ||===||   ,_____||=====")
    println("==||  ||____=====||   |=,=/=|   ||===||_______,  >=====")
    println("==||_________|===||___|==V==|___||===||_________||=====")
    println("=======================================================")
    println("***********   Learning Management System   ************")
    println("-----P--------O--------R--------T--------A--------L----")

    while (condition){
        println("----------------------------------")
        println("USER MENU \nCreate an account or Log-in \n[1] Sign-Up \n[2] Sign-In \n[0] Close \nEnter here:")                        //call to action, main menu
        println("----------------------------------")
        select = readln().toInt()
        if (select==1){                                                                                                                 //selection 1: signing-up
            println("Select: [1]Student  [2]Faculty   [3]Admin")                                                                        //user type selection
            choose = readln().toInt()
            println("Set your user name:")
            userName = readln()
            println("Set your password:")
            password = readln()
            when(choose){                                                                                                               //creating new user account
                1 -> universityStudent.setLoginCredentials(userName, password)
                2 -> universityFaculty.setLoginCredentials(userName, password)
                3 -> universityAdmin.setLoginCredentials(userName, password)
                else ->{continue}
            }
            println("Successfully created your account")
        }else if (select==2){                                                                                                           //selection 2: signing-in
            println("Select: [1]Student  [2]Faculty   [3]Admin")                                                                        //selecting user type
            choose = readln().toInt()
            println("Enter your user name:")
            userName = readln()
            println("Enter your password:")
            password = readln()
            when(choose){                                                                                                               //matching username, password & user type
                1 -> universityStudent.checkLoginCredentials(userName, password)
                2 -> universityFaculty.checkLoginCredentials(userName, password)
                3 -> universityAdmin.checkLoginCredentials(userName, password)
                else ->{continue}
            }
            println("Press enter to confirm:")                                                                                          //hidden type 'C' to continue
            reply = readln().lowercase()
            if(reply=="c"){
                println("ACCOUNT MENU \n[1] Explore LMS \n[2] Change Password \n[3] Delete Account \n[0] Logout \nEnter here:")         //call to action, account menu (3)
                println("----------------------------------")
                option = readln().toInt()
                if (option==1){                                                                                                         //account menu option 1: Explore LMS
                    println("PROFILE MENU \n[1] Student \n[2] Faculty \n[3] Admin \n[0] Logout \nEnter here:")                          //call to action, profile menu (3)
                    println("----------------------------------")
                    input = readln().toInt()
                    if (input==1){                                                                                                      //profile menu input 1: Student
                        println("Are you enrolled? Y/N:")
                        reply = readln().lowercase()
                        if (reply!="y"){                                                                                                //if not enrolled - can't continue
                            println("Sorry but you must be enrolled to access the LMS")
                            break
                        }else{                                                                                                          //if enrolled - continues
                            println("Enter your student ID:")
                            universityID = readln().toInt()
                            universityStudent.checkIfEnrolled(universityID)
                            println("Press enter to confirm:")
                            reply = readln().lowercase()
                            if (reply=="g"){                                                                                            //call to action, student menu (4)
                                println("STUDENT MENU \n[1] School Update \n[2] Subjects Concern \n[3] Accounts Balance \n[4] Meet Professor \n[0] Logout \nEnter here:")
                                option = readln().toInt()
                                if (option==1){                                                                                         //student menu option 1: School Update
                                    println("********************************************")
                                    println(">>>>>>>>>>>>  A D V I S O R Y  <<<<<<<<<<<<<")
                                    println("********************************************")
                                    println("Beloved Parents and Students: \n\nBased on the PAG-ASA's storm update, our city is not included in the storm" +
                                            " signal \nbut may still experience heavy rain and strong wind. \nWe are announcing that classes for today is " +
                                            "suspended until further notice. \nPlease be guided accordingly. Stay safe!")
                                    println("\nYour teacher might reach you out to inform you if you will \nhave an online class or not " +
                                            "you may contact your teachers for or the school admin \nfor any concern (text 777 or call 333-2211), thank you.")
                                    universityStakeholders.postAnnouncement(message)
                                }else if (option==2){                                                                                   //student menu option 2: Subjects Concern
                                    println("Subjects Concern: \n[1] Enrolled Subjects \n[2] Class Schedules \n[3] Change Subject \n[4] Drop Subject \n[5] Add Subject \n[0] Logout \nEnter here:")
                                    input = readln().toInt()                                                                            //call to action: Subjects Concern Menu (5)
                                    if(input==1){                                                                                       //SUBJ CON input 1: enrolled subjects
                                        println("Enter your student ID:")
                                        universityID = readln().toInt()
                                        println("These are the subjects you enrolled:")
                                        universityStudent.displaySubjects(universityID)
                                    }else if (input==2){                                                                                //SUBJ CON input 2: class schedules
                                        println("Enter your student ID:")
                                        universityID = readln().toInt()
                                        println("These are your schedules:")
                                        universityStudent.displaySchedules(universityID)
                                    }else if (input==3){                                                                                //SUBJ CON input 3: changing subject
                                        println("Only 1 subject is allowed to change:")
                                        println("Current subject to be changed:")
                                        oldSubject = readln()
                                        println("New subject for replacement:")
                                        newSubject = readln()
                                        println("Enter student ID to confirm:")
                                        universityID = readln().toInt()
                                        universityStudent.changingSubject(oldSubject, newSubject, universityID)
                                        println("Visit the registrar personally for verification")
                                    }else if (input==4){                                                                                //SUBJ CON input 4: dropping subject
                                        println("Only 1 subject is allowed to drop:")
                                        println("Current subject to be dropped:")
                                        oldSubject = readln()
                                        println("Enter student ID to confirm:")
                                        universityID = readln().toInt()
                                        universityStudent.dropSubject(oldSubject, universityID)
                                        println("Visit the registrar personally for verification")
                                    }else if (input==5){                                                                                //SUBJ CON input 5: adding subject
                                        println("Only 1 subject is allowed to add:")
                                        println("Current subject to be added:")
                                        newSubject = readln()
                                        println("Enter student ID to confirm:")
                                        universityID = readln().toInt()
                                        universityStudent.addSubject(newSubject, universityID)
                                        println("Visit the registrar personally for verification")
                                    }else{
                                        continue
                                    //end of Subject Concern Menu (student)
                                    }
                                }else if (option==3){                                                                                   //Student Menu option 3: accounts balance
                                    println("Number of subjects enrolled:")
                                    numberOfSubjects = readln().toDouble()
                                    println("How many subjects with laboratory? ")
                                    val numberOfLab = readln().toDouble()
                                    println("Downpayment amount: ")
                                    val downpayment = readln().toDouble()
                                    println("Second partial payment: ")
                                    val secondPayment = readln().toDouble()
                                    println("Enter your student ID:")
                                    universityID = readln().toInt()
                                    universityStudent.computeBalance(universityID, numberOfSubjects, numberOfLab, downpayment, secondPayment)
                                    println("\nVisit the Business Office personally for verification")
                                }else if (option==4){                                                                                   //Student Menu option 4: meet professor
                                    println("Enter your teacher's name:")
                                    name = readln()
                                    println("Mr/Ms $name is available on the following schedule:")
                                    universityFaculty.displayFreeTime(name)
                                    println("\nIn case you can't get through, you can use LMS Messenger to chat")
                                    println("Message Menu [1]Write [2]Inbox [3]Sent [0}Cancel")                                         //call to action, Message Menu (3)
                                    choose = readln().toInt()
                                    if (choose==1){                                                                                     //message menu choose 1: write messages
                                        println("WRITE MESSAGES")
                                        println("Enter sender name:")
                                        name = readln()
                                        println("Recipient name:")
                                        val recipient = readln()
                                        println("Type your message and press enter to send:")
                                        message = readln()
                                        universityStakeholders.johnSendMessage(message, name, recipient)                               //printing message composition
                                        universityStakeholders.lukeSendMessage(message, name, recipient)
                                        universityStakeholders.matthewSendMessage(message, name, recipient)
                                        println("Message sent:")
                                    }else if (choose==2){                                                                               //message menu choose 2: message inbox
                                        println("MESSAGE INBOX")
                                        println("Enter sender name:")
                                        name = readln()
                                        println("Recipient name:")
                                        val recipient = readln()
                                        println("Message received:")
                                        universityStakeholders.johnGetMessage(message, name, recipient)                                 //displaying message from specific sender
                                        universityStakeholders.lukeGetMessage(message, name, recipient)
                                        universityStakeholders.matthewGetMessage(message, name, recipient)
                                        when(recipient){                                                                                //displaying inbox with respect to owner
                                            "John" -> println(universityStakeholders.johnInbox)
                                            "Luke" -> println(universityStakeholders.lukeInbox)
                                            "Matthew" -> println(universityStakeholders.matthewInbox)
                                        }
                                        println("---nothing follows---")
                                    }else if (choose==3){                                                                               //message menu choose 3: sent items
                                        println("SENT ITEMS")
                                        println("Recipient name:")
                                        val recipient = readln()
                                        when(recipient){                                                                                //displaying sent items according to owner
                                            "John" -> println(universityStakeholders.johnSentItems)
                                            "Luke" -> println(universityStakeholders.lukeSentItems)
                                            "Matthew" -> println(universityStakeholders.matthewSentItems)
                                        }
                                        println("---nothing follows---")
                                    }else{
                                        continue
                                    }
                                    //end of Messages
                                }else{
                                    //end of student 2nd level if-else: STUDENT MENU
                                    continue
                                }
                            }else{
                                //end of student 1st level if-else: reply 'g' to continue if enrolled
                                continue
                            }
                        //end of student profile selection: type hidden 'g' to continue
                        }
                    }else if (input==2){                                                                                                //profile menu input 2: Faculty
                        println("Do you have a teaching load? Y/N:")
                        reply = readln().lowercase()
                        if (reply!="y"){                                                                                                //if without teaching loads - can't continue
                            println("Sorry but you must have teaching load/s to access the LMS")
                            break
                        }else {                                                                                                         //if with teaching loads - continues
                            println("Enter your employee ID:")
                            universityID = readln().toInt()
                            universityFaculty.checkIfLoaded(universityID)
                            println("Please enter to confirm:")
                            reply = readln().lowercase()
                            if (reply == "g") {                                                                                         //call to action, faculty menu (3)
                                println("FACULTY MENU \n[1] School Update \n[2] Subject Loads \n[3] Meet Student \n[0] Logout \nEnter here:")
                                option = readln().toInt()
                                if (option == 1) {                                                                                      //faculty menu option 1: school update
                                    println("********************************************")
                                    println(">>>>>>>>>>>>  A D V I S O R Y  <<<<<<<<<<<<<")
                                    println("********************************************")
                                    println("All Faculties: \n\nBased on the PAG-ASA's storm update, our city is not included in the storm signal \nbut " +
                                            "may still experience heavy rain and strong wind. \nWe are announcing that classes for today is suspended until " +
                                            "further notice. \nPlease be guided accordingly. Stay safe!")
                                    println("\nInform your students if you will have an online lecture due classes suspension \nif needed and possible but " +
                                            "we highly advised that you do so, thank you.")
                                    universityStakeholders.postAnnouncement(message)
                                } else if (option == 2) {                                                                               //faculty menu option 2: subject loads
                                    println("Subjects Load: \n[1] Subjects Assignment \n[2] Class Schedules \n[0] Logout \nEnter here:")
                                    input = readln().toInt()                                                                            //call to action, SUBJECT LOAD MENU (2)
                                    if(input==1){                                                                                       //SUBJ LOAD input 1: Subjects Assignment
                                        println("Enter your employee ID:")
                                        universityID = readln().toInt()
                                        println("These are your teaching loads:")
                                        universityFaculty.displaySubjects(universityID)
                                    }else if (input==2){                                                                                //SUBJ LOAD input 2: class schedules
                                        println("Enter your employee ID:")
                                        universityID = readln().toInt()
                                        println("These are your schedules:")
                                        universityFaculty.displaySchedules(universityID)
                                    }else{
                                        //end of Subjects Load
                                        continue
                                    }
                                }else if (option==3){                                                                                   //faculty menu option 3: Meet Students
                                    println("Enter your student's name:")
                                    name = readln()
                                    println("Mr/Ms $name is available on the following schedule:")
                                    universityStudent.displayFreeTime(name)
                                    println("\nIn case you can't get through, you can use LMS Messenger to chat")
                                    println("Message Menu [1]Write [2]Inbox [3]Sent [0}Cancel")                                         //call to action, message menu for faculty
                                    choose = readln().toInt()
                                    if (choose==1){                                                                                     //message menu choose 1: write messages
                                        println("WRITE MESSAGES")
                                        println("Enter sender name:")
                                        name = readln()
                                        println("Recipient name:")
                                        val recipient = readln()
                                        println("Type your message and press enter to send:")
                                        message = readln()
                                        universityStakeholders.eveSendMessage(message, name, recipient)                                 //printing message composition
                                        universityStakeholders.marySendMessage(message, name, recipient)
                                        universityStakeholders.estherSendMessage(message, name, recipient)
                                        println("Message sent")
                                    }else if (choose==2){                                                                               //message menu choose 2: message inbox
                                        println("MESSAGE INBOX")
                                        println("Enter sender name:")
                                        name = readln()
                                        println("Recipient name:")
                                        val recipient = readln()
                                        println("Message received:")
                                        universityStakeholders.eveGetMessage(message, name, recipient)                                  //displaying message received from specific sender
                                        universityStakeholders.maryGetMessage(message, name, recipient)
                                        universityStakeholders.estherGetMessage(message, name, recipient)
                                        when(recipient){                                                                                //displaying inbox with respect to owner
                                            "Eve" -> println(universityStakeholders.eveInbox)
                                            "Mary" -> println(universityStakeholders.maryInbox)
                                            "Esther" -> println(universityStakeholders.estherInbox)
                                        }
                                        println("---nothing follows---")
                                    }else if (choose==3){                                                                               //message menu choose 3: sent items
                                        println("SENT ITEMS")
                                        println("Recipient name:")
                                        val recipient = readln()
                                        when(recipient){                                                                                //displaying sent items according to owner
                                            "Eve" -> println(universityStakeholders.eveSentItems)
                                            "Mary" -> println(universityStakeholders.marySentItems)
                                            "Esther" -> println(universityStakeholders.lukeSentItems)
                                        }
                                        println("---nothing follows---")
                                    }else{
                                        continue
                                    }
                                    //end of Messages option
                                }else{
                                    //end of faculty 2nd level if-else: FACULTY MENU
                                    continue
                                }
                            }else{
                                //end of faculty 1st level if-else: reply 'g' to continue if with teaching load
                                continue
                            }
                        //end of faculty profile selected: type hidden 'g' to continue
                        }
                    }else if(input==3){                                                                                                 //profile menu input 3: Admin Staff
                        println("Do you have authorization? Y/N:")
                        reply = readln().lowercase()
                        if (reply!="y"){                                                                                                //if not authorized - can't continue
                            println("Sorry but you must have authorization to access the LMS")
                            break
                        }else {                                                                                                         //if authorized continues
                            println("Enter your employee ID:")
                            universityID = readln().toInt()
                            universityAdmin.checkIfAuthorized(universityID)
                            println("Please enter to confirm:")
                            reply = readln().lowercase()
                            if (reply == "g") {                                                                                         //call to action, Admin Menu (3)
                                println("ADMIN MENU \n[1] School Bulletin \n[2] Enrollment Update \n[3] LMS Accounts \n[0] Logout \nEnter here:")
                                option = readln().toInt()
                                if (option == 1) {                                                                                      //admin menu option 1: School Bulletin
                                    println("Create announcement:")
                                    message = readln()
                                    println("Choose: [1]Post [2]Edit [0}Cancel")                                                        //call to action, post menu (2)
                                    choose = readln().toInt()
                                    if(choose==1){
                                        universityStakeholders.postAnnouncement(message)
                                    }else if (choose==2){
                                        universityStakeholders.editAnnouncement()
                                        println("Edit here:")
                                        message = readln()
                                        universityStakeholders.postAnnouncement(message)
                                    }else{
                                        //end of School Bulletin
                                        continue
                                    }
                                    println("\nYour announcement is already posted")
                                } else if (option == 2) {                                                                               //Admin Menu option 2: enrollment update
                                    println("Update Enrollment: \n[1] View \n[2] Search \n[3] Add \n[4] Edit \n[5] Delete \n[0] Logout \nEnter here:")
                                    input = readln().toInt()                                                                            //call to action, Enrollment Update Menu (5)
                                    if (input == 1) {                                                                                   //ENROL UPD input 1: Viewing
                                        println(">>> VIEW <<<")
                                        println("Enter your employee ID to view:")
                                        universityID = readln().toInt()
                                        println("Displaying enrolled students...")
                                        universityAdmin.viewEnrollment(universityID)
                                        println("...display completed")
                                    } else if (input == 2) {                                                                            //ENROL UPD input 2: Searching
                                        println(">>> SEARCH <<<")
                                        println("Enter your employee ID:")
                                        universityID = readln().toInt()
                                        universityAdmin.viewEnrollment(universityID)
                                        println("\nEnter student ID to search:")
                                        studentID = readln().toInt()
                                        println("Displaying enrolled students...")
                                        universityAdmin.searchStudentEnrolled(universityID, studentID)
                                        println("...search completed")
                                    } else if (input == 3) {                                                                            //ENROL UPD input 43 Adding
                                        println(">>> ADD <<<")
                                        println("Enter your employee ID to add:")
                                        universityID = readln().toInt()
                                        universityAdmin.viewEnrollment(universityID)
                                        println("\nAdd student ID:")
                                        studentID = readln().toInt()
                                        println("Add student name:")
                                        name = readln()
                                        println("Add student age:")
                                        age = readln().toInt()
                                        println("Add student course:")
                                        course = readln()
                                        println("Add student year:")
                                        year = readln().toInt()
                                        println("Add student section:")
                                        section = readln()
                                        universityAdmin.addEnrollment(universityID, studentID, name, age, course, year, section)
                                        println("...adding complete")
                                    } else if (input == 4) {                                                                            //ENROL UPD input 4: Editing
                                        println(">>> EDIT <<<")
                                        println("Enter your employee:")
                                        universityID = readln().toInt()
                                        println("Enrolled students...")
                                        universityAdmin.viewEnrollment(universityID)
                                        println("\nEnter student ID to edit:")
                                        studentID = readln().toInt()
                                        println("New student name:")
                                        name = readln()
                                        println("New student age:")
                                        age = readln().toInt()
                                        println("New student course:")
                                        course = readln()
                                        println("New student year:")
                                        year = readln().toInt()
                                        println("New student section:")
                                        section = readln()
                                        universityAdmin.editEnrollment(universityID, studentID, name, age, course, year, section)
                                        println("...editing complete")
                                    } else if(input==5){                                                                                //ENROL UPD input 5: Deleting
                                        println(">>> DELETE <<<")
                                        println("Enter your employee ID:")
                                        universityID = readln().toInt()
                                        universityAdmin.viewEnrollment(universityID)
                                        println("Enter student ID to delete:")
                                        studentID = readln().toInt()
                                        universityAdmin.deleteEnrollment(universityID, studentID, name, age, course, year, section)
                                        println("...deleting complete")
                                    }else{
                                        //end of enrollment update
                                        continue
                                    }
                                } else if (option == 3) {                                                                           //Admin Menu option 3: LMS Accounts
                                    println("<<< LMS Accounts >>>")
                                    println("Enter your employee ID:")
                                    universityID = readln().toInt()
                                    println("LMS Account: \n[1] View \n[2] Delete \nEnter here:")                                   //call to action, LMS Accounts Menu (2)
                                    choose = readln().toInt()
                                    if (choose==1){                                                                                 //Accounts Menu choose 1: Viewing
                                        universityAdmin.viewUserAccounts(universityID)
                                        println("...display completed")
                                    }else if (choose==2){                                                                           //LMS Accounts Menu choose 2: Deleting
                                        println("Existing LMS accounts:")
                                        universityAdmin.viewUserAccounts(universityID)
                                        println("Enter user name to delete:")
                                        name = readln()
                                        universityAdmin.deleteUserAccounts(universityID, name)
                                        println("...deleting completed")
                                    }else{
                                        //end of LMS Account
                                        continue
                                    }
//                                } else if (option == 4) {
////                                    println("Enter your student's name:")
//                                    //
                                } else {
                                    //end of faculty 2nd level if-else: ADMIN MENU
                                    continue
                                }
                            } else {
                                //end of faculty 1st level if-else: reply 'g' to continue if authorized
                                println("Logging off...")
                                break
                            }
                        //end of admin profile selection
                        }
                    }else{
                        //end of 4th level if-else: PROFILE MENU
                        continue
                    }
                }else if (option==2){                                                                                                   //ACCOUNT MENU option 2: Change Password
                    println("Select: [1]Student  [2]Faculty   [3]Admin")                                                                //user type selection
                    choose = readln().toInt()
                    println("Enter your old password:")
                    password = readln()
                    println("Enter your new password:")
                    newPassword = readln()
                    when(choose){                                                                                                       //matching username, password, & user type
                        1 -> universityStudent.changePassword(newPassword, password)
                        2 -> universityFaculty.changePassword(newPassword, password)
                        3 -> universityAdmin.changePassword(newPassword, password)
                        else ->{continue}
                    }
                    println("Successfully changed your password")
                }else if (option==3){                                                                                                   //ACCOUNT MENU option 3: Delete Account
                    println("Enter your user name:")
                    userName = readln()
                    println("Enter your password:")
                    password = readln()
                    println("Do you really want to delete your account? Y/N:")
                    reply = readln().lowercase()
                    if (reply=="y"){
                        println("Select: [1]Student  [2]Faculty   [3]Admin")
                        choose = readln().toInt()
                        when(choose){                                                                                                   //matching username. password, & user type
                            1 -> universityStudent.deleteAccount(userName, password)
                            2 -> universityFaculty.deleteAccount(userName, password)
                            3 -> universityAdmin.deleteAccount(userName, password)
                            else ->{continue}
                        }
                    }else{
                        println("Logging out...")
                        break
                    }
                }else{
                    //end of 3rd level if-else: ACCOUNT MENU
                    continue
                }
            }else{
                //end of 2nd level if-else: reply 'c' to continue
                continue
            }
        }else{
            //end of 1st level if-else: USER MENU
            condition = false
        }
    //end of while
    }
}