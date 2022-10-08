package com.CaseStudy

interface UniversityRegistrar {



    fun changeSubject(oldSubject: String, newSubject: String, universityID: Int){

    }

    fun dropSubject(oldSubject: String, universityID: Int){

    }

    fun addSubject(newSubject: String, universityID: Int){

    }

    fun viewEnrollment(universityID: Int){

    }

    fun searchStudentEnrolled(universityID: Int, studentID: Int){

    }

    fun addEnrollment(universityID: Int, studentID: Int, name: String, age: Int, course: String, year: Int, section: String){

    }

    fun editEnrollment(universityID: Int, studentID: Int, name: String, age: Int, course: String, year: Int, section: String){

    }

    fun deleteEnrollment(universityID: Int, studentID: Int, name: String, age: Int, course: String, year: Int, section: String){

    }

}