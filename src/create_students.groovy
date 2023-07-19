import com.globalpayex.college.domain.Student

println Student.count // 0
def s1 = new Student(name: 'mehul', gender: 'f', roll: 10)
// s1.gender = 'm'
// s1.gender = 'd'
println s1.gender
s1.gender = 'm' // implicitly s1.setGender('t')
println s1.name // implicitly s1.getName()

// s1.setGender('d' as Character)
// println s1.getGender()


def s2 = new Student(name: 'jane', roll: 12, gender: 'f', contactNos: ['986789689', '886876909'])

println Student.count // 2

// println s1.name
// println s2.name

println s1.getDetails()
// println s2.getDetails()

s1.printContactNos()
s2.printContactNos()

def s3 = new Student()
println Student.count // 3
println s3.name

def s4 = Student.createInstance(name: 'jill', gender: 'f', roll: 11)
println s4.getDetails()