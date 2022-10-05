package com.CaseStudy

import com.CaseStudy.UniversityStudents


fun main(){

    var universityStakeholders = UniversityStakeholders()
    var universityStudent = UniversityStudents()
    var universityFaculty = UniversityFaculties()
    var condition: Boolean = true
    var universityID: Int
    var select: Int
    var option: Int
    var choose: Int
    var input: Int
    var reply: String
    var name: String = " "
    var oldSubject: String = " "
    var newSubject: String = " "
    var userName: String = " "
    var password: String = " "
    var newPassword: String = " "

    println("=======================================================")
    println("==||  ||=========||    ,===/    ||===||   ,_____||=====")
    println("==||  ||____=====||   |=,=/=|   ||===||_______,  >======")
    println("==||_________|===||___|==V==|___||===||_________||=====")
    println("=======================================================")
    println("***********   Learning Management System   ************")
    println("-----P--------O--------R--------T--------A--------L----")

    while (condition){
        println("----------------------------------")
        println("USER MENU \nCreate an account or Log-in \n[1] Sign-Up \n[2] Sign-In \n[0] Close \nEnter here:")                      //call to action, main menu
        println("----------------------------------")
        select = readln().toInt()
        if (select==1){
            println("[1] Student  [2] Faculty   [3] Admin")
            choose = readln().toInt()
            println("Set your user name:")
            userName = readln()
            println("Set your password:")
            password = readln()
            when(choose){
                1 -> universityStudent.setLoginCredentials(userName, password)
                2 -> universityFaculty.setLoginCredentials(userName, password)
                else ->{continue}
            }
            println("Successfully created your account")
        }else if (select==2){
            println("[1] Student  [2] Faculty   [3] Admin")
            choose = readln().toInt()
            println("Enter your user name:")
            userName = readln()
            println("Enter your password:")
            password = readln()
            when(choose){
                1 -> universityStudent.checkLoginCredentials(userName, password)
                2 -> universityFaculty.checkLoginCredentials(userName, password)
                else ->{continue}
            }
            println("Please enter to confirm:")
            reply = readln().lowercase()
            if(reply=="c"){
                println("ACCOUNT MENU \n[1] Explore LMS \n[2] Change Password \n[3] Delete Account \n[0] Exit \nEnter here:")                      //call to action, main menu
                println("----------------------------------")
                option = readln().toInt()
                if (option==1){
                    println("PROFILE MENU \n[1] Student \n[2] Faculty \n[3] Admin \n[0] Exit \nEnter here:")                                        //call to action, main menu
                    println("----------------------------------")
                    input = readln().toInt()
                    if (input==1){
                        println("Are you enrolled? Y/N:")
                        reply = readln().lowercase()
                        if (reply!="y"){
                            println("Sorry but you must be enrolled to access the LMS")
                            break
                        }else{
                            println("Enter your student ID:")
                            universityID = readln().toInt()
                            universityStudent.checkIfEnrolled(universityID)
                            println("Please enter to confirm:")
                            reply = readln().lowercase()
                            if (reply=="g"){
                                println("STUDENT MENU \n[1] School Update \n[2] Subjects Concerned \n[3] Accounts Balance \n[4] Meet Professor \n[0] Exit \nEnter here:")
                                option = readln().toInt()
                                if (option==1){
                                    println("********************************************")
                                    println(">>>>>>>>>>>>  A D V I S O R Y  <<<<<<<<<<<<<")
                                    println("********************************************")
                                    println("Beloved Parents & Students: \nBased on the PAG-ASA's storm update, our city is not included in the storm signal but may still experience heavy rain and strong wind. \nWe are announcing that classes for today is suspended until further notice. \nPlease be guided accordingly. Stay safe!")
                                    println("Your teachers will reach you out in case you will have an online class or not, but you may contact them if the condition permits you to do so...thank you!")
                                }else if (option==2){
                                    println("Subjects Concerned: \n[1] Enrolled Subjects \n[2] Classes Schedule \n[3] Change Subject \n[4] Drop Subject \n[5] Add Subject \n[0] Exit \nEnter here:")
                                    input = readln().toInt()
                                    if(input==1){
                                        println("Enter your student ID:")
                                        universityID = readln().toInt()
                                        println("These are the subjects you enrolled:")
                                        universityStudent.displaySubjects(universityID)
                                    }else if (input==2){
                                        println("Enter your student ID:")
                                        universityID = readln().toInt()
                                        println("These are your schedules:")
                                        universityStudent.displaySchedules(universityID)
                                    }else if (input==3){
                                        println("Only 1 subject is allowed to change:")
                                        println("Current subject to be changed:")
                                        oldSubject = readln()
                                        println("New subject for replacement:")
                                        newSubject = readln()
                                        println("Enter student ID to confirm:")
                                        universityID = readln().toInt()
                                        universityStudent.changingSubject(oldSubject, newSubject, universityID)
                                        println("Visit the registrar personally for verification")
                                    }else if (input==4){
                                        println("Only 1 subject is allowed to drop:")
                                        println("Current subject to be dropped:")
                                        oldSubject = readln()
                                        println("Enter student ID to confirm:")
                                        universityID = readln().toInt()
                                        universityStudent.dropSubject(oldSubject, universityID)
                                        println("Visit the registrar personally for verification")
                                    }else if (input==5){
                                        println("Only 1 subject is allowed to add:")
                                        println("Current subject to be added:")
                                        newSubject = readln()
                                        println("Enter student ID to confirm:")
                                        universityID = readln().toInt()
                                        universityStudent.addSubject(newSubject, universityID)
                                        println("Visit the registrar personally for verification")
                                    }else{
                                        continue
                                    }
                                }else if (option==3){
                                    println("Enter your student ID:")
                                    universityID = readln().toInt()
                                    universityStudent.computeBalance(universityID)
                                }else if (option==4){
                                    println("Enter your teacher's name:")
                                    name = readln()
                                    println("Ms./Mr. $name is available on the following schedule")
                                    universityFaculty.displayFreeTime(name)
                                    println("$name can be reached through 09991234567, FB: www.facebook.com/$name, ${name}_ganda01@gmail.com")
                                }else{
                                    continue
                                }
                            }else{
                                continue
                            }
                        }
                    }else if (input==2){
                        println("Do you have a teaching load? Y/N:")
                        reply = readln().lowercase()
                        if (reply!="y"){
                            println("Sorry but you must have a teaching load to access the LMS")
                            break
                        }else {
                            println("Enter your employee ID:")
                            universityID = readln().toInt()
                            universityFaculty.checkIfLoaded(universityID)
                            println("Please enter to confirm:")
                            reply = readln().lowercase()
                            if (reply == "g") {
                                println("FACULTY MENU \n[1] School Update \n[2] Subjects Load \n[3] Meet Student \n[0] Exit \nEnter here:")
                                option = readln().toInt()
                                if (option == 1) {
                                    println("********************************************")
                                    println(">>>>>>>>>>>>  A D V I S O R Y  <<<<<<<<<<<<<")
                                    println("********************************************")
                                    println("All Faculties: \nBased on the PAG-ASA's storm update, our city is not included in the storm signal but may still experience heavy rain and strong wind. \nWe are announcing that classes for today is suspended until further notice. \nPlease be guided accordingly. Stay safe!")
                                    println("Inform your students if you will have an online lecture due classes suspension if needed and possible but we highly advised that you do so, thank you.")
                                } else if (option == 2) {
                                    println("Subjects Load: \n[1] Subjects Assignment \n[2] Classes Schedule \n[0] Exit \nEnter here:")
                                    input = readln().toInt()
                                    if(input==1){
                                        println("Enter your employee ID:")
                                        universityID = readln().toInt()
                                        println("These are your teaching loads:")
                                        universityFaculty.displaySubjects(universityID)
                                    }else if (input==2){
                                        println("Enter your employee ID:")
                                        universityID = readln().toInt()
                                        println("These are your schedules:")
                                        universityFaculty.displaySchedules(universityID)
                                    }else{
                                        continue
                                    }
                                }else if (option==3){
                                    println("Enter your student's name:")
                                    name = readln()
                                    println("Ms./Mr. $name is available on the following schedule")
                                    universityStudent.displayFreeTime(name)
                                    println("$name can be reached through 09997654321, FB: www.facebook.com/$name, ${name}_gwapo01@gmail.com")
                                }else{
                                    continue
                                }
                            }else{
                                continue
                            }
                        }
                    }else{
                        continue
                    }
                }else if (option==2){
                    println("[1] Student  [2] Faculty   [3] Admin")
                    choose = readln().toInt()
                    println("Enter your old password:")
                    password = readln()
                    println("Enter your new password:")
                    newPassword = readln()
                    when(choose){
                        1 -> universityStudent.changePassword(newPassword, password)
                        2 -> universityFaculty.changePassword(newPassword, password)
                        else ->{continue}
                    }
                    println("Successfully changed your password")
                }else if (option==3){
                    println("Enter your user name:")
                    userName = readln()
                    println("Enter your password:")
                    password = readln()
                    println("Do you really want to delete your account? Y/N:")
                    reply = readln().lowercase()
                    if (reply=="y"){
                        println("[1] Student  [2] Faculty   [3] Admin")
                        choose = readln().toInt()
                        when(choose){
                            1 -> universityStudent.deleteAccount(userName, password)
                            2 -> universityFaculty.deleteAccount(userName, password)
                            else ->{continue}
                        }

                    }else{
                        println("Logging out...")
                        break
                    }
                }else{
                    continue
                }
            }else{
                continue
            }
        }else{
            condition = false
        }

    }

}