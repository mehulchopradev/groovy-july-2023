def perimeterRectangle(length, breadth) {
    2 * (length + breadth)
}

def areaRectangle(length, breadth) {
    length * breadth
}

def statsRectangle(length, breadth) {
    def p = perimeterRectangle(length, breadth)
    def a = areaRectangle(length, breadth)

    Tuple.tuple(p, a)
}

def l1 = 8
def b1 = 3

def p = perimeterRectangle l1, b1
def a = areaRectangle l1, b1

println "Perimeter is $p"
println "Area is $a"

def t = statsRectangle(l1, b1)
println t.v1
println t.v2