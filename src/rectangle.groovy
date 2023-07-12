def perimeterRectangle(length, breadth) {
    2 * (length + breadth)
}

def areaRectangle(length, breadth) {
    length * breadth
}

def l1 = 8
def b1 = 3

def p = perimeterRectangle l1, b1
def a = areaRectangle l1, b1

println "Perimeter is $p"
println "Area is $a"