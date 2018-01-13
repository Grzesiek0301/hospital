package com;

public class Doctor {
    private final int personalNumber;
    private final String name;
    private final String surname;
    private final String medicalSpecializiation;

    public Doctor(String name, String surname, int personalNumber, String medicalSpecializiation) {
        this.personalNumber = personalNumber;
        this.surname = surname;
        this.name = name;
        this.medicalSpecializiation = medicalSpecializiation;
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

    public String toString() {
        return name + " " + surname;
    }
}
