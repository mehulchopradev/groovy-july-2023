package com.globalpayex.college.domain

class Author {
    String name
    Integer ratings
    Contact contact


    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", ratings=" + ratings +
                ", contact=" + contact +
                '}';
    }
}
