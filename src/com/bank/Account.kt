package com.bank

abstract class Account() {
    
    abstract protected var accountType: String
    abstract protected var accountNumber: Int
    abstract protected var accountHolderName: String 

    //attributes 
        
    protected var accountBalance : Float = 0.0f
    protected var accountInterestRate : Float = 0.0f
    protected var isSetup : Boolean = false
    protected var daysSinceSetup : Int = 0 //used to calculate interest with the calculateInterest() function.

    
    //Methods
    public fun returnBalance(): Float {
        return accountBalance
    }
    
    public fun returnAccountInfo(): String {
        return "Account Number: $accountNumber\nAccount Type: $accountType\nAccount Holder's Name: $accountHolderName\nBalance: $accountBalance" 
    }

    public fun updateBalance(operationType: String = "charge", amountToOperate: Float) { 
        if (operationType == "charge") {
            if (accountBalance >= amountToOperate) {
                accountBalance -= amountToOperate                
            } else {
                println("Insifficent Balance for the charge.")  
            }
        } else if (operationType == "deposit") {
            accountBalance += amountToOperate
        } else {
            println("Invalid operation type. Use 'charge' or 'deposit'.")
        }
    }
        

    protected fun getAccountNumber() {
        //Prompt for account number for setup
        var isNumber = false
                while (isNumber == false){
        println("Please enter the account Number: ")
        var readNumber = readLine()?.toIntOrNull()
            if (readNumber != null && readNumber >= 1) {
                accountNumber = readNumber
                isNumber = true
            } 
        
        }
    }

    protected fun getAccountHolderName() {
        //Prompt for name of account holder, set 
        var isName = false
        
        while (isName == false) {
            println("Please input the Account Holder Name: ")
            val nameInput = readLine()
            if (nameInput != null) {
                accountHolderName = nameInput 
                isName = true
            } else {
                println("Invalid input.")
            }
        }
    }

    protected fun getAccountInitialValue() {
        //Initial Deposit Amount
        var isNumber = false

        while (isNumber == false){
        println("Please enter the Initial Deposited Amount: ")
        var readNumber = readLine()?.toFloatOrNull()
            if (readNumber != null && readNumber>= 1) {
                accountBalance = readNumber
                isNumber = true
            } 
        
        }
    }

    
    fun calculateInterest(){
        //run at the end of each day to calculate interest. 
    } 

    public fun getAccount() {
        //used to make account. after run
        println("New Account Setup: \n")
        
        if (isSetup != true) {      
            getAccountNumber()
            getAccountHolderName()
            getAccountInitialValue()
            isSetup = true //this prevents the function from being run again. 
            println("Account has been set up! ")
        } else {
            println("Error! This account has already been SET UP.")
        }
        
    }
}
