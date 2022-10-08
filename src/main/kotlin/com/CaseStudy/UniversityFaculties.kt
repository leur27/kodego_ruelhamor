package com.CaseStudy

class UniversityFaculties: UniversityPersonnel() {

    //overrides function from UniversityStakeholder
    override fun setLoginCredentials(userName: String, password: String){
        teacherUserName.add(userName)
        teacherPassword.add(password)
    }

    //overrides function from UniversityStakeholder
    override fun checkLoginCredentials(userName: String, password: String){
        if (teacherUserName.contains(userName)&&teacherPassword.contains(password)){
            println("Welcome ${(userName).uppercase()} to the University LMS Portal! \nyour current password is $password")
            println("Type: \"C\"- continue | \"N\"- quit ")
        }else{
            println("User name, password, or user type did not match \nCreate an account to continue")
        }
    }

    //override function from UniversityStakeholder
    override fun changePassword(newPassword: String, password: String){
        teacherPassword.remove(password)
        teacherPassword.add(newPassword)
    }

    //overrides function from UniversityStakeholder
    override fun deleteAccount(userName: String, password: String){
        if (teacherUserName.contains(userName)&&teacherPassword.contains(password)){
            teacherUserName.remove(userName)
            teacherPassword.remove(password)
            println("Successfully deleted")
        }else{
            println("Do not match")
        }
    }

    //overrides function from UniversityPersonnel
    override fun checkIfLoaded(universityID: Int){
        val filteredMap = loadedTeacher.filterKeys { it == universityID }
        for(key in filteredMap.keys) {
            if (key == universityID) {
                filteredMap.forEach { (k, v) ->
                    println("EmployeeID: $k   Faculty Name: $v")
                    println("S.Y. 2022-2023:   \"WITH TEACHING LOAD\"")
                    println("Age:               ${(loadedTeacher2[universityID])} years old")
                    println("Department:        ${(loadedTeacher3[universityID])}")
                    println("Employment Status: ${(loadedTeacher4[universityID])}")
                    println("Advisory Class:    ${(loadedTeacher5[universityID])}")
                    println("\nType: \"G\"- continue | \"N\"- quit ")
                }
            }else{
                println("You are not enrolled")
            }
        }
    }

    //overrides function from UniversityGeneralAdmin
    override fun displaySubjects(universityID: Int){
        if (universityID==2001){
            println(eveSubjects)
        }else if (universityID==2002){
            println(marySubjects)
        }else if (universityID==2003){
            println(estherSubjects)
        }else{
            println("Not found")
        }
    }

    //overrides function from UniversityGeneralAdmin
    override fun displaySchedules(universityID: Int){
        if (universityID==2001){
            println(eveSchedule)
        }else if (universityID==2002){
            println(marySchedule)
        }else if (universityID==2003){
            println(estherSchedule)
        }else{
            println("Not found")
        }
    }

    //overrides function from UniversityGeneralAdmin
    override fun displayFreeTime(name: String){
        if (name=="Eve"){
            println(eveFreeTime)
            println("$name can be reached through 09991234567 or 321-1234, \nFB: www.facebook.com/$name, ${name}_ganda01@gmail.com")
        }else if (name=="Mary"){
            println(maryFreeTime)
            println("$name can be reached through 09992345671 or 321-4321, \nFB: www.facebook.com/$name, ${name}_gwapa02@gmail.com")
        }else if (name=="Esther"){
            println(estherFreeTime)
            println("$name can be reached through 09993456712 or 321-3124, \nFB: www.facebook.com/$name, ${name}_beauty03@gmail.com")
        }else{
            println("Not found")
        }
    }

}