package com.models;

import com.MedicalSpecialization;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Doctor {
    private final int personalNumber;
    private final String name;
    private final String surname;
    private final MedicalSpecialization medicalSpecializiation;
    private final Set<Patient> patients;

    public Doctor(String name, String surname, int personalNumber, MedicalSpecialization medicalSpecializiation) {
        this.personalNumber = personalNumber;
        this.surname = surname;
        this.name = name;
        this.medicalSpecializiation = medicalSpecializiation;
        this.patients = new HashSet<>();
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

    public MedicalSpecialization getMedicalSpecializiation() {
        return medicalSpecializiation;
    }

    public String toString() {
        return name + " " + surname;
    }

    public void addPatient(Patient patient) {
        patients.add(new Patient(patient.getName(), patient.getSurname(), personalNumber));
    }

    public Set<Patient> getPatients() {
        return new HashSet<>(patients);
    }
}
