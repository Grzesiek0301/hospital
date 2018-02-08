package com.models;

import java.util.Objects;

public class Patient extends Person{
    private final String name;
    private final String surname;
    private final int personalNumber;

    private Patient(final PatientBuilder patientBuilder) {
        this.name = patientBuilder.name;
        this.surname = patientBuilder.surname;
        this.personalNumber = patientBuilder.personalNumber;
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

    public static class PatientBuilder {

        private String name;
        private String surname;
        private int personalNumber;

        public PatientBuilder name(final String name) {
            this.name = name;
            return this;
        }

        public PatientBuilder surname(final String surname) {
            this.surname = surname;
            return this;
        }

        public PatientBuilder personalNumber(final int personalNumber) {
            this.personalNumber = personalNumber;
            return this;
        }

        public Patient build() {
            return new Patient(this);
        }

    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", personalNumber=" + personalNumber +
                '}';
    }
}
