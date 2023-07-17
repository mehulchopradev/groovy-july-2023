def marks = [5, 7, 8, 5, 4, 10, 10, 9, 1]

def s1 = marks.sort(false)
println s1
println marks

def s2 = marks.sort(false) {e1, e2 ->
    /*
    Natural order - Ascending
    e1 < e2 -- -1
    e1 == e2 -- 0
    e1 > e2 -- 1
     */
    e2.compareTo(e1)
}
println s2

// spaceship operator
def s3 = marks.sort(false) {e1, e2 -> e2 <=> e1}
println s3

