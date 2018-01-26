package com.defined;

public class Patient {
    private final String name;
    private final String surname;
    private final int personalNumber;

    public Patient (String name, String surname, int personalNumber) {
        this.name = name;
        this.surname = surname;
        this.personalNumber = personalNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPersonalNumber() {
        return personalNumber;
    }
}
