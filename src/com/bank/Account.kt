package com.bank

abstract class Account() {
    
    abstract protected var accountType: String
    abstract protected var accountNumber: Int
    abstract protected var accountHolderName: String
     

    //attributes 
        
    protected var accountBalance : Float = 0.0f
    protected var accountInterestRate : Float = 0.0f
    abstract protected var isSetup : Boolean
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
        println("Please enter the Initial Deposited Amount: $")
        var readNumber = readLine()?.toFloatOrNull()
            if (readNumber != null && readNumber>= 1) {
                accountBalance = readNumber
                isNumber = true
            } 
        
        }
    }

    abstract protected fun getAccountInterestRate() 
       
    public fun calculateInterest(){
        //run at the end of each day to calculate interest. 
        accountBalance = accountBalance * (1 + (accountInterestRate / 100))
    } 

    public fun getAccount(newAccountNumber : Int) {
        //used to make account. after run
        println("New Account Setup: \n")
        
        if (isSetup != true) {      
            accountNumber = newAccountNumber
            getAccountHolderName()
            getAccountInitialValue()
            getAccountInterestRate()
            isSetup = true //this prevents the function from being run again. 
            println("Account has been set up! ")
        } else {
            println("Error! This account has already been SET UP.")
        }
        
    }
}
