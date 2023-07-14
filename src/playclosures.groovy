// defining code inside another code (defining a function inside a function)
def abc() {
    // i -> Integer -> abc
    def i = 10

    // c -> Closure -> abc
    def c = {a, b ->
        (a + i) ** b
    }

    println c(4, 3)
}

abc()


// a function that returns another function
def pqr(j) { //j -> Integer -> pqr
    // i -> Integer -> pqr
    def i = 5

    // mno -> Closure -> pqr
    // Closure will always have access to the enclosing function variables even after the enclosing function has returned!!!
    def mno = {k -> (k + i) * j}
    mno
}

def d = pqr(6)
println d(2)