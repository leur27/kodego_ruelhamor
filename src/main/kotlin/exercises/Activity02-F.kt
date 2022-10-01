package exercises


fun main(){

    var condition : Boolean = true
    var select : Int
    var option : Int
    var itemNumber: Int = 0
    var productName: String = " "
    var category: String = " "
    var inventory: Double = 0.0
    var itemUnit: String = " "
    var itemPrice: Double = 0.0
    var inventoryProgram = InventoryProgram()

    while (condition){
        println("\nSelect an option \n[1] Display \n[2] Search  \n[3] Add  \n[4] Edit  \n[5] Delete  \n[0] Exit  \nEnter here:")
        select = readln().toInt()
        if (select == 1) {
            println("<< Displaying all entries >>")
            inventoryProgram.displayInventory()
            println("...Display completed...")
            println("----------------------------------")
        }else if (select == 2) {
            println("<< Search selected >>")
            println("Searching...")
            println("\nSearch by \n[1] Item No. \n[2] Product Name \n[0] Exit \nEnter here:")
            option = readln().toInt()
            if (option == 1) {
                println("<< Search selected >>")
                println("Searching by item number...")
                println("Enter item number:")
                itemNumber = readln().toInt()
                inventoryProgram.searchByItemNumber(itemNumber)
                println("\n...searching completed")
                println("----------------------------------")
            }else if (option == 2) {
                println("<< Search selected >>")
                println("Searching by product name...")
                println("Enter product name:")
                productName = readln()
                println("Searching details for product ${(productName).uppercase()}")
                inventoryProgram.searchByProductName(productName)
                println("\n...searching completed")
                println("----------------------------------")
            }else{
                println("Item is not listed")
                println("\n...searching completed")
                println("----------------------------------")
            }
        }else if (select == 3) {
            println("<< Add selected >>")
            println("Adding...")
            println("New item no.: ")
            itemNumber = readln().toInt()
            println("New product name: ")
            productName = readln()
            println("New product category: ")
            category = readln()
            println("New inventory count: ")
            inventory = readln().toDouble()
            println("New item unit: ")
            itemUnit = readln()
            println("New unit price: ")
            itemPrice = readln().toDouble()
            inventoryProgram.addInventory(itemNumber, productName, category, inventory, itemUnit, itemPrice)
            println("\n...adding completed")
            println("----------------------------------")
        }else if (select == 4) {
            println("<< Edit selected >>")
            println("Editing...")
            println("Enter the item no.: ")
            itemNumber = readln().toInt()
            println("New product name: ")
            productName = readln()
            println("New product category: ")
            category = readln()
            println("New inventory count: ")
            inventory = readln().toDouble()
            println("New item unit: ")
            itemUnit = readln()
            println("New unit price: ")
            itemPrice = readln().toDouble()
            inventoryProgram.editInventory(itemNumber, productName, category, inventory, itemUnit, itemPrice)
            println("\n...editing completed")
            println("----------------------------------")
        }else if (select == 5) {
            println("<< Delete selected >>")
            println("Deleting...")
            println("Enter the item no.: ")
            itemNumber = readln().toInt()
            
            println("\n...deleting completed")
            println("----------------------------------")
        }
    }

}



