package com.bank

class SavingsAccount() : Account() { 

    override var accountType: String = "Savings" 
    override var accountNumber: Int = 0
    override var accountHolderName: String  = "Default"
}