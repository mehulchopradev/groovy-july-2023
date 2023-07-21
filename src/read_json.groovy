import groovy.json.JsonSlurper

def jsonReader = new JsonSlurper()
def obj = jsonReader.parse(new File('employee.json'))
println obj['employee']

