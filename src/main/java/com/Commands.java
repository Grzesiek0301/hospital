package com;

import java.util.Scanner;

import static com.MedicalSpecializiation.getMedicialSpecializiation;

public class Commands {
    public static Doctor getDoctorFromUser() {
        String name = getStringParameter("Doctor's name :");
        String surname = getStringParameter("Doctor's surname :");
        int id = getIdFromUser();
        printMessage("Enter Doctor's medicial specializiation (PATHOLOGY, CARDIOLOGY, UROLOGY, NEUROLOGY):");
        MedicalSpecializiation medicalSpecializiation = getMedicialSpecializiation(getStringParameter("Your choise: "));
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

    public static void printMessage(String textOfMessage) {
        System.out.println(textOfMessage);
    }
}
