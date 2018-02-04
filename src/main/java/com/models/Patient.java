package com.models;

import java.util.Objects;

public class Patient {
    private final String name;
    private final String surname;
    private final int personalNumber;

    Patient(String name, String surname, int personalNumber) {
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

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return personalNumber == patient.personalNumber;
    }

    @Override
    public int hashCode() {

        return Objects.hash(personalNumber);
    }
}
