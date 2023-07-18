def students = [
        Tuple.tuple('mehul', 10, 'm', 90),
        Tuple.tuple('jane', 12, 'f', 95),
        Tuple.tuple('jill', 7, 'f', 85),
        Tuple.tuple('rahul', 15, 'm', 78)
]

println "Please enter the roll no to search: "

// most of the java packages are auto imported in groovy files
def scanner = new Scanner(System.in)
def roll = scanner.nextInt()

def student = students.find {it.v2 == roll}
println(student ?: 'Not found')

