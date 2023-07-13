def marks = [5, 7, 8, 5, 4, 10, 10, 9, 1]

// to print all even marks more than 4
/* println "******** Even marks more than 4 *********"
for (def m in marks) {
    if (m % 2 == 0 && m > 4) {
        println m
    }
}

// to print all the odd marks less than 7
println "******** Odd marks less than 7 *********"
for (def m in marks) {
    if (m % 2 && m < 7) {
        println m
    }
} */

// higher level general function
// higher order function
// code -> lower order functions
/* def forEach(elements, code) {
    for (def e in elements) {
        // code -> something like a function
        code(e)
    }
} */
// forEach(marks, ?????) // In java/groovy one cannot pass a function as a parameter to another function
// Groovy -> Closures
/* def c = {m ->
    if (m % 2 == 0 && m > 4) {
        println m
    }
} */
// Functional programming
/* forEach(marks, {m ->
    if (m % 2 == 0 && m > 4) {
        println m
    }
}) */

/* forEach(marks, {
    // implicit parameter `it` -> item. Applicable only for closure that takes 1 parameter
    if (it % 2 == 0 && it > 4) {
        println it
    }
}) */

/* forEach(marks) {
    if (it % 2 == 0 && it > 4) {
        println it
    }

    def a = 89
    def c = {
        a = a + 100
    }

    println c()
    println "a is $a"
}

println "******** Odd marks less than 7 *********"
forEach(marks, {m ->
    if (m % 2 && m < 7) {
        println m
    }
}) */

println "******** Even marks more than 4 *********"
marks.each {
    if (it % 2 == 0 && it > 4) {
        println it
    }
}

println "******** Odd marks less than 7 *********"
marks.each {
    if (it % 2 && it < 7) {
        println it
    }
}

























