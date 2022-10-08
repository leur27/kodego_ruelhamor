package com.CaseStudy

class UniversityStudents: UniversityStakeholders(), UniversityGeneralAffairs  {

    //overrides function from UniversityStakeholders
    override fun setLoginCredentials(userName: String, password: String){
        studentUserName.add(userName)
        studentPassword.add(password)
    }

    //overrides function from UniversityStakeholders
    override fun checkLoginCredentials(userName: String, password: String){
        if (studentUserName.contains(userName)&&studentPassword.contains(password)){
            println("Welcome ${(userName).uppercase()} to the University LMS Portal! \nyour current password is $password")
            println("Type: \"C\"- continue | \"N\"- quit ")
        }else{
            println("User name, password, or user type did not match. \nCreate an account to continue")
        }
    }

    //overrides function from UniversityStakeholders
    override fun changePassword(newPassword: String, password: String){
        studentPassword.remove(password)
        studentPassword.add(newPassword)
    }

    //overrides function from UniversityStakeholders
    override fun deleteAccount(userName: String, password: String){
        if (studentUserName.contains(userName)&&studentPassword.contains(password)){
            studentUserName.remove(userName)
            studentPassword.remove(password)
            println("Successfully deleted")
        }else{
            println("Do not match")
        }
    }

    //overrides function from UniversityRegistrar
    override fun checkIfEnrolled(universityID: Int){
        val filteredMap = enrolledStudent.filterKeys { it == universityID }
        for(key in filteredMap.keys) {
            if (key == universityID) {
                filteredMap.forEach { (k, v) ->
                    println("StudentID: $k   Student Name: $v")
                    println("S.Y. 2022-2023:   \"ENROLLED\"")
                    println("Age:             ${(enrolledStudent2[universityID])} years old")
                    println("Course & Year:   ${(enrolledStudent3[universityID])}-${(enrolledStudent4[universityID])}")
                    println("Section:         ${(enrolledStudent5[universityID])}")
                    println("\nType: \"G\"- continue | \"N\"- quit ")
                }
            }else{
                println("You are not enrolled")
            }
        }
    }

    //overrides function from UniversityGeneralAffairs
    override fun displaySubjects(universityID: Int){
        if (universityID==3001){
            println(johnSubjects)
        }else if (universityID==3002){
            println(lukeSubjects)
        }else if (universityID==3003){
            println(matthewSubjects)
        }else{
            println("Not found")
        }
    }

    //overrides function from UniversityGeneralAffairs
    override fun displaySchedules(universityID: Int){
        if (universityID==3001){
            println(johnSchedule)
        }else if (universityID==3002){
            println(lukeSchedule)
        }else if (universityID==3003){
            println(matthewSchedule)
        }else{
            println("Not found")
        }
    }

    //overrides function from UniversityRegistrar
    override fun changeSubject(oldSubject: String, newSubject: String, universityID: Int) {
        if (universityID == 3001) {
            johnSubjects.remove(oldSubject)
            johnSubjects.add(newSubject)
        } else if (universityID == 3002) {
            lukeSubjects.remove(oldSubject)
            lukeSubjects.add(newSubject)
        } else if (universityID == 3003) {
            matthewSubjects.remove(oldSubject)
            matthewSubjects.add(newSubject)
        } else {
            println("Not found")
        }
    }

    //overrides function from UniversityRegistrar
    override fun dropSubject(oldSubject: String, universityID: Int) {
        if (universityID == 3001) {
            johnSubjects.remove(oldSubject)
        } else if (universityID == 3002) {
            lukeSubjects.remove(oldSubject)
        } else if (universityID == 3003) {
            matthewSubjects.remove(oldSubject)
        } else {
                println("Not found")
        }
    }

    //overrides function from UniversityRegistrar
    override fun addSubject(newSubject: String, universityID: Int) {
        if (universityID == 3001) {
            johnSubjects.add(newSubject)
        } else if (universityID == 3002) {
            lukeSubjects.add(newSubject)
        } else if (universityID == 3003) {
            matthewSubjects.add(newSubject)
        } else {
            println("Not found")
        }
    }

    //overrides function from UniversityGeneralAffairs
    override fun displayFreeTime(name: String){
        if (name=="John"){
            println(johnFreeTime)
            println("$name can be reached through 09996543217 \nFB: www.facebook.com/$name, \n${name}_gwapo21@gmail.com")
        }else if (name=="Luke"){
            println(lukeFreeTime)
            println("$name can be reached through 09995432176 \nFB: www.facebook.com/$name, \n${name}_pogi22@gmail.com")
        }else if (name=="Matthew"){
            println(matthewFreeTime)
            println("$name can be reached through 09994321765 \nFB: www.facebook.com/$name, \n${name}_cute23@gmail.com")
        }else{
            println("Not found")
        }
    }

    //overrides function from UniversityGeneralAffairs
    override fun computeBalance(universityID: Int, numberOfSubjects: Double, numberOfLab: Double, downpayment: Double, secondPayment: Double){
        val subjectsAmount: Double = numberOfSubjects*512*3
        val labAmount: Double = numberOfLab*610*3
        val tuitionFee: Double = subjectsAmount+labAmount
        val totalAmount: Double = tuitionFee+3500
        val balance: Double = totalAmount - (downpayment+secondPayment)
        if (universityID==3001){
            println("Registrar record: ${johnSubjects.size} subjects enrolled")
            println(johnSubjects)
            println("\nEntered  subjects enrolled: $numberOfSubjects \nUnits per subject: 3 \nAmount per unit: Php 512.00 \nTotal: Php ${subjectsAmount}0")
            println("\nNo. of subjects with laboratory: $numberOfLab \nUnits per laboratory: 5 \nAmount per unit: Php 610.00 \nTotal: Php ${labAmount}0")
            println("\nTuition Fee: Php ${tuitionFee}0 \nMiscellaneous Fee: Php 3,500.00  \nTotal Amount Due: Php ${totalAmount}0")
            println("\nPartial downpayment: Php ${downpayment}0 \nSecond installment: Php ${secondPayment}0 \nRemaining balance:Php ${balance}0")
        }else if (universityID==3002){
            println("Enrolled ${lukeSubjects.size} subjects")
            println(lukeSubjects)
            println("\nNo. of subjects enrolled: $numberOfSubjects \nUnits per subject: 3 \nAmount per unit: Php 512.00 \nTotal: Php ${subjectsAmount}0")
            println("\nNo. of subjects with laboratory: $numberOfLab \nUnits per laboratory: 5 \nAmount per unit: Php 610.00 \nTotal: Php ${labAmount}0")
            println("\nTuition Fee: Php ${tuitionFee}0 \nMiscellaneous Fee: Php 3,500.00  \nTotal Amount Due: Php ${totalAmount}0")
            println("\nPartial downpayment: Php ${downpayment}0 \nSecond installment: Php ${secondPayment}0 \nRemaining balance:Php ${balance}0")
        }else if (universityID==3003){
            println("Enrolled ${matthewSubjects.size} subjects")
            println(matthewSubjects)
            println("\nNo. of subjects enrolled: $numberOfSubjects \nUnits per subject: 3 \nAmount per unit: Php 512.00 \nTotal: Php ${subjectsAmount}0")
            println("\nNo. of subjects with laboratory: $numberOfLab \nUnits per laboratory: 5 \nAmount per unit: Php 610.00 \nTotal: Php ${labAmount}0")
            println("\nTuition Fee: Php ${tuitionFee}0 \nMiscellaneous Fee: Php 3,500.00  \nTotal Amount Due: Php ${totalAmount}0")
            println("\nPartial downpayment: Php ${downpayment}0 \nSecond installment: Php ${secondPayment}0 \nRemaining balance:Php ${balance}0")
        }else{
            println("Not found")
        }
    }

}