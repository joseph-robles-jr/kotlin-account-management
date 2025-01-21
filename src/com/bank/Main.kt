/*Bank Management System*/
package com.bank

import com.bank.Account //imports account class
import com.bank.SavingsAccount
import com.bank.CheckingAccount
import com.bank.FillerAccount
import com.bank.Bank

var accounting = Bank()

fun main() {
    clearScreen()
    mainMenu()
}

fun mainMenu(): Unit {
    var selection : Int = 0

    while (selection != 8) {
        println("Main Menu:")
        println("1. Create A New Savings Account")
        println("2. Create A New Checking Account") 
        println("3. Account Info") 
        println("4. Update Intrest") 
        println("5. Remove Account") 
        // println("5. Option 5") 
        // println("6. Option 6") 
        // println("7. Option 7") 
        println("8. Quit") 
        print("Select an option: ")

        var userChoose = readLine()?.toIntOrNull()
        clearScreen()

        when (userChoose) {
            1 -> accounting.createSavingsAccount()
            2 -> accounting.createCheckingAccount()
            3 -> { //Get account Info
                var isNumber = false
                while (isNumber == false){
                    println("Please enter the Account Number to see: ")
                    var readNumber = readLine()?.toIntOrNull()
                        if (readNumber != null && readNumber >= 1){
                            clearScreen()
                            println("Account Summary:\n" + accounting.getAccountDetails(readNumber - 1) + "\n") 
                            isNumber = true
                        }
                    }
                    
                }
            4 -> { //Update the interest on ALL accounts in the accounting object. Meant to be run monthly
                    accounting.updateInterest()}
            5 -> { //Remove an account
                    var isNumber = false
                    while (isNumber == false){
                    println("Please enter the account Number: ")
                    var readNumber = readLine()?.toIntOrNull()
                    if (readNumber != null && readNumber >= 1) {
                        var results : String = accounting.removeAccount(readNumber)
                        clearScreen()
                        println(results)
                        isNumber = true
                        } 
                    }
                    
                }
            // 5 -> println("Hello World")
            // 6 -> println("Hello World")
            // 7 -> println("Hello World")
            8 -> selection = 8 //Quit the program
            else -> {
                clearScreen()
                println("That is not an option. Try Again!")
                }
    }

    }

}

fun clearScreen() {
    println("\u001B[2J\u001B[H")
}
