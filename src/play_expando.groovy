// Expando

def p1 = new Expando()
p1.name = 'mehul chopra'
p1.gender = 'm'
p1.subjects = ['physics', 'chemistry']
p1.getDetails = {
    "Name: $name\nGender: $gender"
}

/* println p1
println p1.gender
println p1.name */
println p1.getDetails()
