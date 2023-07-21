package com.globalpayex.college.domain

class Contact {
    String mobile
    String email
    String country


    @Override
    public String toString() {
        return "Contact{" +
                "mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
