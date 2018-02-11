package com.models;

public class Person {
    private int personalNumber;
    private String name;
    private String surname;


    public Person(int personalNumber, String name, String surname) {
        this.personalNumber = personalNumber;
        this.name = name;
        this.surname = surname;
    }

    public int getPersonalNumber() {
        return personalNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
