/*Bank Management System*/
package com.bank

import com.bank.Account //imports account class
import com.bank.SavingsAccount
import com.bank.Bank

var accounting = Bank()

fun main() {
    mainMenu()
}

fun mainMenu(): Unit {
    var selection : Int = 0

    while (selection != 8) {
        println("Main Menu:")
        println("1. Create A New Savings Account") 
        println("2. Account Info") 
        println("3. Update Intrest") 
        println("4. Remove Account") 
        // println("5. Option 5") 
        // println("6. Option 6") 
        // println("7. Option 7") 
        println("8. Quit") 
        print("Select an option: ")

        var userChoose = readLine()?.toIntOrNull()

        when (userChoose) {
            1 -> {
                accounting.createSavingsAccount(  )
                }
            2 -> {
                var isNumber = false
                while (isNumber == false){
                    println("Please enter the Account Number to see: ")
                    var readNumber = readLine()?.toIntOrNull()
                        if (readNumber != null && readNumber >= 1){
                            println(accounting.getAccountDetails(readNumber - 1))
                            isNumber = true
                        }
                    }
                }
            3 -> {println("Updating intrest ... ... ...")
                    accounting.updateInterest()}
            4 -> {
                    var isNumber = false
                    while (isNumber == false){
                    println("Please enter the account Number: ")
                    var readNumber = readLine()?.toIntOrNull()
                    if (readNumber != null && readNumber >= 1) {
                        var results : String = accounting.removeAccount(readNumber)
                        println(results)
                        isNumber = true
                        } 
                    }
                }
            // 5 -> println("Hello World")
            // 6 -> println("Hello World")
            // 7 -> println("Hello World")
            8 -> selection = 8
            else -> println("That is not an option. Try Again!")
    }

    }
}

