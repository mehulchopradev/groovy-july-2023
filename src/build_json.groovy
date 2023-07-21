import groovy.json.JsonBuilder

def jb = new JsonBuilder()
jb.employee {
    basicDetails {
        fullName 'mehul chopra'
        gender 'm'
        country 'IN'
    }
    contact {
        email 'mehulc@hey.com'
        phone '978976868'
    }
}
// println jb.toString()
println jb.toPrettyString()
// jb name: 'ach'

/* def accountsArray = [
        [accountNumber: 'ABC123', accountType: 'Savings', balance: 10000],
        [accountNumber: 'XYZ456', accountType: 'Current', balance: 12000],
]

jb {
    accounts accountsArray.collect {
        [
                accountNumber: it['accountNumber'],
                accountType: it['accountType'],
                balance: it['balance']
        ]
    }
} */
// println jb.toPrettyString()
/* def str = jb.toString()
println str */