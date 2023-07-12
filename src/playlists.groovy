// List
def marks = [5, 7, 8, 5, 4, 10, 10, 9, 1]
def el = []

println marks[0] // 5
println marks[-1] // 1
println marks[-3] // 10

println marks[0..3] // [5, 7, 8, 5]
println marks[-2..-1] // [9, 1]

// update
marks[2] = 3
println marks

// add at the end
marks << 2
println marks

marks << 3 << 10
println marks

def l1 = [5, 8, 2]
def n = marks + l1

println n
println marks

// whether 0 marks is in the list or no
println(0 in marks)
println (10 in marks)

// println marks[2000] // null


/* for(def m in marks) {
    println m
} */

/* println marks.size()
println marks.count(10)
println marks.max()
println marks.min()
println marks.sum()
println marks.average() */
// marks.addAll(l1)

println marks.removeLast()
println marks

marks.push(9) // adds at the start
println marks

println marks.pop() // removes from the start
println marks

println marks.join(',')

def divisions = [
        [5, 6, 3],
        [10, 7, 3, 5],
        [3, 8, 9]
]
def one = divisions.flatten()
println one
println one.max()

def d1 = [5, 6, 7]
def d2 = [6, 3, 7]

println d1.intersect(d2)
println d1 - d2
println d2 - d1
def d3 = d1 + d2
println d3.unique()


