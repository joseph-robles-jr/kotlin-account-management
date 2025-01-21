package com.bank

class FillerAccount : Account() {
    override var accountType: String = "ACCOUNT HAD BEEN REMOVED"
    override var accountNumber: Int = 0
    override var accountHolderName: String = "REMOVED"
    override var isSetup : Boolean = true



    override fun getAccountInterestRate() {
        accountInterestRate = 0.0f
    }


}