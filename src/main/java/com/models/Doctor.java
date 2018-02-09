package com.models;

import com.MedicalSpecialization;

import java.util.HashSet;
import java.util.Set;

public class Doctor extends Person {
    private final int personalNumber;
    private final String name;
    private final String surname;
    private final MedicalSpecialization medicalSpecializiation;
    private final Set<Patient> patients;

    private Doctor(final DoctorBuilder doctorBuilder) {
        super(doctorBuilder.personalNumber, doctorBuilder.name, doctorBuilder.surname);
        this.personalNumber = doctorBuilder.personalNumber;
        this.name = doctorBuilder.name;
        this.surname = doctorBuilder.surname;
        this.medicalSpecializiation = doctorBuilder.medicalSpecialization;
        this.patients = doctorBuilder.patients;
    }

    public MedicalSpecialization getMedicalSpecializiation() {
        return medicalSpecializiation;
    }

    public String toString() {
        return name + " " + surname;
    }

    public void addPatient() {
        Patient patient = new Patient.PatientBuilder()
                .name("Grzeg")
                .surname("urb")
                .personalNumber(9001)
                .build();
        patients.add(patient);
    }

    public Set<Patient> getPatients() {
        return new HashSet<>(patients);
    }

    public static class DoctorBuilder {
        private int personalNumber;
        private String name;
        private String surname;
        private MedicalSpecialization medicalSpecialization;
        private Set<Patient> patients;

        public DoctorBuilder personalNumber(int personalNumber) {
            this.personalNumber = personalNumber;
            return this;
        }

        public DoctorBuilder name(String name) {
            this.name = name;
            return this;
        }

        public DoctorBuilder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public DoctorBuilder medicalSpecialization(MedicalSpecialization medicalSpecialization) {
            this.medicalSpecialization = medicalSpecialization;
            return this;
        }

        public DoctorBuilder patients() {
            this.patients = new HashSet<>();
            return this;
        }

        public Doctor build() {
            return new Doctor(this);
        }
    }
}
