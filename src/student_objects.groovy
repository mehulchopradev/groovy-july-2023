import com.globalpayex.college.domain.Student

def students = [
        new Student(name: 'mehul', gender: 'm', roll: 10),
        new Student(name: 'jane', gender: 'f', roll: 13),
        new Student(name: 'jill', gender: 'f', roll: 14),
        new Student(name: 'rahul', gender: 'm', roll: 12),
]

// Get a new list of only the female students
def females = students.findAll {it.gender == 'f'}
println females


// Get a new list of only the male student names
def males = students
        .findAll {it.gender == 'm'}
        .collect {it.name}
println males


// Get the count of students based on gender
def counts = students.countBy {it.gender}
println counts