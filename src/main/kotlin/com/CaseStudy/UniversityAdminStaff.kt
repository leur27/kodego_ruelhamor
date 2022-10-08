package com.CaseStudy

class UniversityAdminStaff: UniversityPersonnel() {

    //overrides function from UniversityStakeholder
    override fun setLoginCredentials(userName: String, password: String){
        adminUserName.add(userName)
        adminPassword.add(password)
    }

    //overrides function from UniversityStakeholder
    override fun checkLoginCredentials(userName: String, password: String){
        if (adminUserName.contains(userName)&&adminPassword.contains(password)){
            println("Welcome ${(userName).uppercase()} to the University LMS Portal \nyour current password is $password")
            println("Type: \"C\"- continue | \"N\"- quit ")
        }else{
            println("User name, password, or user type did not match \nCreate an account to continue")
        }
    }

    //overrides function from UniversityStakeholder
    override fun changePassword(newPassword: String, password: String){
        adminPassword.remove(password)
        adminPassword.add(newPassword)
    }

    //overrides function from UniversityStakeholder
    override fun deleteAccount(userName: String, password: String){
        if (adminUserName.contains(userName)&&adminPassword.contains(password)){
            adminUserName.remove(userName)
            adminPassword.remove(password)
            println("Successfully deleted")
        }else{
            println("Do not match")
        }
    }

    //overrides function from UniversityPersonnel
    override fun checkIfAuthorized(universityID: Int){
        val filteredMap = allowedAdminStaff.filterKeys { it == universityID }
        for(key in filteredMap.keys) {
            if (key == universityID) {
                filteredMap.forEach { (k, v) ->
                    println("EmployeeID: $k   Employee Name: $v")
                    println("S.Y. 2022-2023:   \"AUTHORIZED STAFF\"")
                    println("Age:               ${(allowedAdminStaff2[universityID])} years old")
                    println("Department:        ${(allowedAdminStaff3[universityID])}")
                    println("Position:          ${(allowedAdminStaff4[universityID])}")
                    println("Level:             ${(allowedAdminStaff5[universityID])}")
                    println("\nType: \"G\"- continue | \"N\"- quit ")
                }
            }else{
                println("You are not enrolled")
            }
        }
    }

    //overrides function from UniversityRegistrar
    override fun viewEnrollment(universityID: Int){
        val filteredMap = allowedAdminStaff.filterKeys { it == universityID }
        for(key in filteredMap.keys) {
            if (key == universityID) {
                println("${filteredMap[key]} with employee ID $universityID is authorized\n")
                for (key in enrolledStudent.keys){
                    println("Student ID: $key  Student Name: ${enrolledStudent[key]}")
                }
                println("Total students enrolled: ${enrolledStudent.size} ")
            }else{
                println("You are not authorized to view this data")
            }
        }
    }

    //overrides function from UniversityRegistrar
    override fun searchStudentEnrolled(universityID: Int, studentID: Int){
        val filteredMap = allowedAdminStaff.filterKeys { it == universityID }
        for(key in filteredMap.keys) {
            if (key == universityID) {
                println("${filteredMap[key]} with employee ID $universityID is authorized\n")
                println("Student ID:    $studentID")
                println("Name:          ${(enrolledStudent[studentID])}")
                println("Age:           ${(enrolledStudent2[studentID])}")
                println("Course:        ${(enrolledStudent3[studentID])}")
                println("Year:          ${(enrolledStudent4[studentID])}")
                println("Section:       ${(enrolledStudent5[studentID])}")
            }else{
                println("You are not authorized to search any entry from the data")
            }
        }
    }

    //overrides function from UniversityRegistrar
    override fun addEnrollment(universityID: Int, studentID: Int, name: String, age: Int, course: String, year: Int, section: String){
        val filteredMap = allowedAdminStaff.filterKeys { it == universityID }
        for(key in filteredMap.keys) {
            if (key == universityID) {
                println("${filteredMap[key]} with ID $universityID has ${allowedAdminStaff5[universityID]} authorization level\n")
                enrolledStudent.put(key = studentID, value = name)
                enrolledStudent2.put(key = studentID, value = age)
                enrolledStudent3.put(key = studentID, value = course)
                enrolledStudent4.put(key = studentID, value = year)
                enrolledStudent5.put(key = studentID, value = section)
                println("Enrolled students: ")
                for (key in enrolledStudent.keys){
                    println("Student ID: $key  Student Name: ${enrolledStudent[key]}")
                }
                println("Total students enrolled: ${enrolledStudent.size} ")
            }else{
                println("You are not authorized to add entry in the data")
            }
        }
    }

    //overrides function from UniversityRegistrar
    override fun editEnrollment(universityID: Int, studentID: Int, name: String, age: Int, course: String, year: Int, section: String){
        val filteredMap = allowedAdminStaff.filterKeys { it == universityID }
        for(key in filteredMap.keys) {
            if (key == universityID) {
                println("${filteredMap[key]} with ID $universityID has ${allowedAdminStaff5[universityID]} authorization level\n")
                enrolledStudent.replace(studentID, name)
                enrolledStudent2.replace(studentID, age)
                enrolledStudent3.replace(studentID, course)
                enrolledStudent4.replace(studentID, year)
                enrolledStudent5.replace(studentID, section)
                for (key in enrolledStudent.keys){
                    println("Student ID: $key  Student Name: ${enrolledStudent[key]}")
                }
                println("Total students enrolled: ${enrolledStudent.size} ")
            }else{
                println("You are not authorized to edit entry in this data")
            }
        }
    }

    //overrides function from UniversityRegistrar
    override fun deleteEnrollment(universityID: Int, studentID: Int, name: String, age: Int, course: String, year: Int, section: String){
        val filteredMap = allowedAdminStaff.filterKeys { it == universityID }
        for(key in filteredMap.keys) {
            if (key == universityID) {
                println("${filteredMap[key]} with ID $universityID has ${allowedAdminStaff5[universityID]} authorization level\n")
                enrolledStudent.remove(studentID)
                enrolledStudent2.remove(studentID)
                enrolledStudent3.remove(studentID)
                enrolledStudent4.remove(studentID)
                enrolledStudent5.remove(studentID)
                println("Enrolled students: ")
                for (key in enrolledStudent.keys){
                    println("Student ID: $key  Student Name: ${enrolledStudent[key]}")
                }
                println("Total students enrolled: ${enrolledStudent.size} ")
            }else{
                println("You are not authorized to delete any entry in this data")
            }
        }
    }

    //overrides function from UniversityStakeholder
    override fun viewUserAccounts(universityID: Int){
        val filteredMap = allowedAdminStaff.filterKeys { it == universityID }
        for(key in filteredMap.keys) {
            if (key == universityID) {
                println("${filteredMap[key]} with ID $universityID has ${allowedAdminStaff5[universityID]} authorization level\n")
                println("Student Users: \n $studentUserName")
                println("Teacher Users: \n $teacherUserName")
                println("Admin Staff Users: \n $adminUserName")
            }else{
                println("You are not authorized to view this data")
            }
        }
    }

    //overrides function from UniversityStakeholder
    override fun deleteUserAccounts(universityID: Int, name: String){
        val filteredMap = allowedAdminStaff.filterKeys { it == universityID }
        for(key in filteredMap.keys) {
            if (key == universityID) {
                println("${filteredMap[key]} with ID $universityID has ${allowedAdminStaff5[universityID]} authorization level\n")
                studentUserName.remove(name)
                teacherUserName.remove(name)
                adminUserName.remove(name)
            }else{
                println("You are not authorized to view this data")
            }
        }
    }


}