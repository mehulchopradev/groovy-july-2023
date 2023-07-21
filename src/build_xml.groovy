import groovy.xml.MarkupBuilder

def str = new StringWriter()
def xb = new MarkupBuilder(str)
/* xb.employee {
    basicDetails {
        fullName 'mehul chopra'
        gender 'm'
        country 'IN'
    }
    contact {
        email 'mehulc@hey.com'
        phone '978976868'
    }
} */

xb.accounts {
    account(id: '1') {
        accountNumber 'ABC23213'
        accountType 'Savings'
        balance 10000
    }
    account(id: '2') {
        accountNumber 'XYZ456546'
        accountType 'Current'
        balance 12000
    }
}

println str.toString()

