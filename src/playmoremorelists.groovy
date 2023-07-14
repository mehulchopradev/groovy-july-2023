def marks = [5, 7, 8, 5, 4, 10, 10, 9, 1]

// build a new List object consisting of even marks more than 4 from the above marks List object
// print the new List object
/* def l1 = []
marks.each {
    if (it % 2 == 0 && it > 4) {
        l1 << it
    }
}
println l1 */
// filtering operations
def l1 = marks.findAll { it % 2 == 0 && it > 4}
println l1

// build a new List object consisting of students who have scored 10 marks or marks less than 4
def l2 = marks.findAll {it == 10 || it < 4}
println l2

// build a new List object consisting of all the elements from the marks list but where each element is deducted by 1
// mapping operation
def l3 = marks.collect {it - 1}
println l3

// build a new List object consisting of students who have scored odd marks in the marks list, squared up
// filtering + mapping
def l4 = marks
        .findAll {it % 2}
        .collect {it ** 2}
println l4

// find whether every student in the class has got more than 2 marks
println marks.every {it > 2}

// find whether there is any student who has scored less than 3 marks
println marks.any {it < 3}