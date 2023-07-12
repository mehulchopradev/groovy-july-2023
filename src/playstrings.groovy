def msg = 'good morning'


println msg[0] // g
println msg[3] // d
println msg[-1] // g
println msg[-3] // i

println msg[0..3] // good
println msg[-4..-1] // ning

for(def v in msg) {
    println v
}

println msg.toUpperCase() // GOOD MORNING
println msg.capitalize() // Good morning
println msg.startsWith('good') // true
println msg.endsWith('night') // false
println msg.contains('ood') // true
println msg.size() // 12
println msg.reverse() // gninrom doog

def roll = '35'
println roll.isNumber() // true
println msg.isNumber() // false

def greeting = 'hello to all. hello gentlemen'
println greeting.count('hello')


// two string values can be compared using the == in groovy

// multiline groovy string
def sql = '''
    select name, gender
    from users
    where gender = 'm'
'''
println sql
