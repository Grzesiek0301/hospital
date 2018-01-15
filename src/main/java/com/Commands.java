package com;

import java.util.Scanner;

public class Commands {
    public static Doctor getDoctorFromUser() {
        String name = getStringParameter("Doctor's name :");
        String surname = getStringParameter("Doctor's surname :");
        int id = getIdFromUser();
        MedicalSpecializiation medicalSpecializiation = getMedicialSpecializiation();
        Doctor doctor = new Doctor(name, surname, id, medicalSpecializiation);
        return doctor;
    }

    public static int getIdToRemove() {
        return getIdFromUser();
    }

    public static int getIdFromUser() {
        System.out.print("Doctor ID: ");
        Scanner readId = new Scanner(System.in);
        return readId.nextInt();
    }

    private static String getStringParameter(String parameter) {
        System.out.println(parameter);
        Scanner reader = new Scanner(System.in);
        return reader.nextLine();
    }

    public static MedicalSpecializiation getMedicialSpecializiation() {
        System.out.println("Enter Doctor's medicial specializiation (PATHOLOGY, CARDIOLOGY, UROLOGSY, NEUROLOGY):");
        String selectedMedicialSpecializiation = getStringParameter("Your choise:");
        if (selectedMedicialSpecializiation.equals("PATHOLOGY")) {
            return MedicalSpecializiation.PATHOLOGY;
        } else if (selectedMedicialSpecializiation.equals("CARDIOLOGY")) {
            return MedicalSpecializiation.CARDIOLOGY;
        } else if (selectedMedicialSpecializiation.equals("UROLOGSY")) {
            return MedicalSpecializiation.UROLOGY;
        } else if (selectedMedicialSpecializiation.equals("NEUROLOGY")) {
            return MedicalSpecializiation.NEUROLOGY;
        } else return MedicalSpecializiation.NEUROLOGY;
    }
}
