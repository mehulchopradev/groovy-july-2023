def eid = 'E007'
def name = 'Rock'

def s1 = [E001:'Mehul', E006: 'Jane', (eid): name]
def s2 = [:] // empty map

def s3 = [
        'E001': Tuple.tuple('mehul', 'm'),
        'E006': Tuple.tuple('jane', 'f'),
        'E003': Tuple.tuple('jill', 'f'),
        'E009': Tuple.tuple('rock', 'm'),
        'E002': Tuple.tuple('sunny', 'm')
]

// Mutable
// add new entry
s1['E003'] = 'Jill'
println s1

// update an entry
s1['E001'] = 'Rahul'
println s1

// looping
/* for(def entry in s1) {
    println entry.key
    println entry.value
} */

println s1.size()

// print the entries from s3 map as following : Name: mehul | Roll: E001
// Without looping
/*
Name: mehul | Eid: E001
Name: jane | Eid: E006
 */
// s3.each {println "Name: $it.value.v1 | Eid: $it.key"}
s3.each {empId, employeeTuple -> println "Name: $employeeTuple.v1 | Eid: $empId"}

// find all the female employees from the s3 map --> Get a new map of only the female employees (functional)
def s4 = s3.findAll {empId, employeeTuple -> employeeTuple.v2 == 'f'}
println s4

// find all the male employees from the s3 map --> Get a new map of only the male employees where key -> empId, value -> name
// findAll + collectEntries
def s5 = s3
        .findAll {empId, employeeTuple -> employeeTuple.v2 == 'm'}
        .collectEntries {empId, employeeTuple -> [empId, employeeTuple.v1]}
println s5

// build a new map key -> gender, value -> count of employees of that gender
// countBy
def s6 = s3.countBy {empId, employeeTuple -> employeeTuple.v2}
println s6

// group all entries in a map by gender
def s7 = s3.groupBy {empId, employeeTuple -> employeeTuple.v2}
println s7