package com.bank

class SavingsAccount() : Account() { 

    override var accountType: String = "Savings" 
    override var accountNumber: Int = 0
    override var accountHolderName: String  = "Default"
    override var isSetup = false

    override fun getAccountInterestRate() {
        var isNumber = false

        while (isNumber == false){
        println("Please enter the intrest rate of this account in percent:  ")
        var readNumber = readLine()?.toFloatOrNull()
            if (readNumber != null && readNumber>= 1) {
                accountInterestRate = readNumber
                clearScreen()
                isNumber = true
            } 
        
        }
        
    }
}