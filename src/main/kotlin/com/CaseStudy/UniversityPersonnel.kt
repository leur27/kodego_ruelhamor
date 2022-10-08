package com.CaseStudy

open class UniversityPersonnel:UniversityStakeholders(), UniversityGeneralAffairs {

    //Map list of authorized admin staff Employee No. to: 1.Name, 2.Age, 3.Department, 4.Position, 5.Level of authorization
    val allowedAdminStaff = mutableMapOf(1001 to "Noy Noy", 1002 to "Van Van", 1003 to "Ysa Ysa")
    val allowedAdminStaff2 = mutableMapOf(1001 to 39, 1002 to 34, 1003 to 29)
    val allowedAdminStaff3 = mutableMapOf(1001 to "Program & Development", 1002 to "IT Department", 1003 to "LMS Department")
    val allowedAdminStaff4 = mutableMapOf(1001 to "Director", 1002 to "Dept. Head", 1003 to "Admin Officer")
    val allowedAdminStaff5 = mutableMapOf(1001 to "Highest", 1002 to "Higher", 1003 to "High")

    //Map of Employee ID with teaching load to: 1.Name, 2.Age, 3.Department, 4.Employment Status, 5.With/without Advisory
    val loadedTeacher = mutableMapOf(2001 to "Eve Aa", 2002 to "Mary Ee", 2003 to "Esther Oo")
    val loadedTeacher2 = mutableMapOf(2001 to 29, 2002 to 27, 2003 to 25)
    val loadedTeacher3 = mutableMapOf(2001 to "Arts and Sciences", 2002 to "Mathematics", 2003 to "P.E")
    val loadedTeacher4 = mutableMapOf(2001 to "Regular", 2002 to "Part-time", 2003 to "Regular")
    val loadedTeacher5 = mutableMapOf(2001 to "With Advisory", 2002 to "With Advisory", 2003 to "No Advisory")
    //Set for teaching load
    val eveSubjects = mutableSetOf("Psychology", "Sociology", "Psychology")
    val marySubjects   = mutableSetOf("Discrete Math", "Differential Equation", "Algebra")
    val estherSubjects = mutableSetOf("Swimming", "Folk Dance", "Volleyball")
    //Map for schedule of subjects
    val estherSchedule = mutableMapOf("Swimming" to "MWF 8-10am", "Folk Dance" to "TTh 4-5:30am", "Volleyball" to "MWF 10-11am")
    val marySchedule = mutableMapOf("Discrete Math" to "MWF 9=10am", "Algebra" to "MWF 11-12nn", "Differential Equation" to "TTh 1-2:30pm")
    val eveSchedule = mutableMapOf("Psychology" to "MWF 1-2pm", "Sociology" to "TTH 2:30-4pm", "Psychology" to "MWF 2-3pm")
    //Set for available time, part-time is half-day only while regular is whole day duty
    val eveFreeTime = mutableSetOf("MWF: 11-12nn, 1-5pm", "TTh: 8-12nn, 1-4pm")
    val maryFreeTime   = mutableSetOf("MWF: 8-9nn, 10-11pm", "TTh: 2:30-5pm")
    val estherFreeTime = mutableSetOf("MWF: 8-12nn, 3-5pm", "TTh: 8-12nn, 4-5pm")

    open fun checkIfLoaded(universityID: Int){

    }

    open fun checkIfAuthorized(universityID: Int){

    }


}