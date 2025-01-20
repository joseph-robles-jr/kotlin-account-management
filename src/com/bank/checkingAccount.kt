package com.bank

class CheckingAccount : Account() {
    override var accountType: String = "Checking"
    override var accountNumber: Int = 0
    override var accountHolderName: String = "Default"



    override fun getAccountInterestRate() {
        accountInterestRate = 0.0f
    }

}
