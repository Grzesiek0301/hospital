package com;

public class Doctor {
    private final int personalNumber;
    private final String name;
    private final String surname;
    private final medicalSpecialization medicalSpecializiation;

    public Doctor(String name, String surname, int personalNumber, medicalSpecialization medicalSpecializiation) {
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

    public medicalSpecialization getMedicalSpecializiation() {
        return medicalSpecializiation;
    }

    public String toString() {
        return name + " " + surname;
    }
}
