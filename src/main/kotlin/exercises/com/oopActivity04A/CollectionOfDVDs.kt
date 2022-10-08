package exercises.com.oopActivity04A

class CollectionOfDVDs: DVDRegistrySystem() {

    //Map of Periodicals: Name/Title to 1.Editor, 2.Type, 3.Publication Date. 4.Volume No., 5.Location, 6.Availability
    val bookTitle = mutableMapOf<String, String>(
        "Pacific Bulletin" to "JL Garcia",
        "Filipino Star" to " SL Mangubat",
        "Philippine Education" to "JE Martinez"
    )
    val bookTitle2 = mutableMapOf<String, String>(
        "Pacific Bulletin" to "Newspaper",
        "Filipino Star" to "Magazine",
        "Philippine Education" to "Journal"
    )
    val bookTitle3 = mutableMapOf<String, Int>(
        "Pacific Bulletin" to 2004,
        "Filipino Star" to 2016,
        "Philippine Education" to 2019
    )
    val bookTitle4 =
        mutableMapOf<String, Int>("Pacific Bulletin" to 4, "Filipino Star" to 2, "Philippine Education" to 10)
    val bookTitle5 = mutableMapOf<String, String>(
        "Pacific Bulletin" to "A5",
        "Filipino Star" to "B3",
        "Philippine Education" to "C1"
    )
    val bookTitle6 =
        mutableMapOf<String, Int>("Pacific Bulletin" to 10, "Filipino Star" to 10, "Philippine Education" to 10)
}