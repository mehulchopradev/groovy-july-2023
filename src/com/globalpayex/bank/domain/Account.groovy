package com.globalpayex.bank.domain

/*
Every account object will have attributes
- account number
- account type
- balance
- contactNos

- withdraw(amt) on an account object should return updated balance
- deposit(amt) on an account object should return updated balance
- getDetails()
 */

// Groovy bean
class Account {

    String accountNumber
    String accountType
    Double balance
    List<String> contactNos

    Double withdraw(Double amt) {
        this.balance -= amt
        this.balance
    }

    Double deposit(Double amt) {
        this.balance += amt
        this.balance
    }

    Double minus(Double amt) {
        this.withdraw(amt)
    }

    Double plus(Double amt) {
        this.deposit(amt)
    }

    Account leftShift(String contactNo) {
        if (!this.contactNos) {
            this.contactNos = []
        }
        this.contactNos << contactNo
        this
    }

    String getAt(Integer index) {
        this.contactNos[index]
    }
}
