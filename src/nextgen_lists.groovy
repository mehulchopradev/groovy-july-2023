List.metaClass.odds = {
    delegate.findAll { it % 2 }
}


def marks = [5, 7, 8, 5, 4, 10, 10, 9, 1]
def o = marks.odds()
println o
