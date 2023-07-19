package com.globalpayex.college.domain

// Groovy bean
class Student {
    // instance variables
    String name
    Integer roll
    Character gender // 'm' / 'f'
    List<String> contactNos

    // static variables
    static Integer count = 0

    // constructors
    // default constructor
    /* Student(Map map) {
        this.name = map['name']
        this.roll = map['roll']
        this.gender = map['gender']
        this.contactNos = map['contactNos']
    } */
    Student() {
        Student.count += 1
    }

    // methods
    String getDetails() {
        // this --> current object
        "Name: ${this.name}\nRoll: ${this.roll}\nGender: ${this.gender}"
    }

    void printContactNos() {
        // this --> current object
        // Null safe operator (?.)
        // println "Contact nos size ${this.contactNos?.size()}"
        for (def i = 0; i < this.contactNos?.size(); i++) {
            println this.contactNos[i]
        }
    }

    static Student createInstance(Map map) {
        // println this // this works in groovy and gives reference to the Class object of Student
        new Student(map)
    }

    // Encapsulation
    void setGender(Character gender) {
        if (gender == 'm' || gender == 'f') {
            this.gender = gender
        } else {
            throw new Exception('Gender needs to be either m or f')
        }
    }

    String getName() {
        this.name?.toUpperCase()
    }

    @Override
    String toString() {
        "Name: ${this.name}\nGender: ${this.gender}"
    }
}



