// Metaprogramming
String.metaClass.csvify = {sep = ',' ->
    // current object --> delegate (like `this`)
    delegate.replaceAll ' ', sep
}



def d = 'mehul m 10 90'
println d.csvify()

def e = 'jane f 11 89'
println e.csvify('|')
