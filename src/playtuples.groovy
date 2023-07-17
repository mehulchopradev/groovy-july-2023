// Tuple
// ideal for representing homogenous data
// is not mutable
// order is maintained

def t1 = new Tuple('mehul', 'm', 10, 90)
println t1[0]
println t1[-1]

def t2 = Tuple.tuple('mehul', 'm', 10, 90)
println t2.v4
println t2.v2
println t2.v1

// Unsupported operation (Immutable)
// t1[0] = 'Mehul'
// t1.add(90)
// t1.pop()

println t1.size()
println 'mehul' in t1
println 'jane' in t1
/* for (def v in t1) {
    println v
} */

t1.each {
    println it
}

/* List l = List.of(4, 'abc', 3)
println l
println l.add('mehul') */
