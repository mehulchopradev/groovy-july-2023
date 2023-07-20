import com.globalpayex.bank.domain.Account

def a1 = new Account(accountNumber: 'ABC123', accountType: 'Savings', balance: 10000, contactNos: ['56456464', '97846238946'])
// println a1.withdraw(1000)
println a1 - 1000 // implicitly println a1.minus(1000)


// println a1.deposit(2000)
println a1 + 2000 // implicity println a1.plus(2000)

// println a1 + 2000 + 400

// a1.contactNos.add('89789797989')
a1 << '897987979' // implictly a1.leftShift('897987979')
// println a1.contactNos

def a2 = new Account(accountNumber: 'XYZ456', accountType: 'Current', balance: 20000)
a2 << '868979793' << '98789628492' // implicitly a2.leftShift('868979793').leftSift('98789628492')
// println a2.contactNos
// println a2.contactNos[0]
println a2[0] // '868979793' // implicitly a2.getAt(0)
println a2[1] // '98789628492' // implicitly a2.getAt(1)