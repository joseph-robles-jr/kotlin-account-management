/*Bank Management System*/
package com.bank

import com.bank.Account //imports account class
import com.bank.SavingsAccount
import com.bank.Bank

fun main() {
    mainMenu()
}

fun mainMenu(): Unit {
    var selection : Int = 0
    while (selection != 8) {
        println("Main Menu:")
        println("1. Create A New Account") 
        println("2. Option 2") 
        println("3. Option 3") 
        println("4. Option 4") 
        println("5. Option 5") 
        println("6. Option 6") 
        println("7. Option 7") 
        println("8. Quit") 
        print("Select an option: ")

        var userChoose = readLine()?.toIntOrNull()

        when (userChoose) {
            1 -> {var banktest = Bank()
                banktest.createSavingsAccount(  )
                }
            2 -> println("Hello World")
            3 -> println("Hello World")
            4 -> println("Hello World")
            5 -> println("Hello World")
            6 -> println("Hello World")
            7 -> println("Hello World")
            8 -> selection = 8
            else -> println("That is not an option. Try Again!")
    }

    }
}

