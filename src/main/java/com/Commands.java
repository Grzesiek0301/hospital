package com;

import com.models.Doctor;

import java.util.Scanner;

import static com.MedicalSpecialization.getMedicialSpecialization;

class Commands {
    static Doctor getDoctorFromUser() {
        String name = getStringParameter("Doctor's name :");
        String surname = getStringParameter("Doctor's surname :");
        int id = getIdFromUser();
        getListOfSpecialization();
        MedicalSpecialization medicalSpecialization = getMedicialSpecialization(getStringParameter("Your choise: "));
        return new Doctor.DoctorBuilder()
                .personalNumber(id)
                .name(name)
                .surname(surname)
                .medicalSpecialization(medicalSpecialization)
                .patients()
                .build();
    }

    static void printMessage(String textOfMessage) {
        System.out.println(textOfMessage);
    }

    static int getIdToRemove() {
        return getIdFromUser();
    }

    private static int getIdFromUser() {
        System.out.print("Doctor ID: ");
        Scanner readId = new Scanner(System.in);
        return readId.nextInt();
    }

    private static String getStringParameter(String parameter) {
        System.out.println(parameter);
        Scanner reader = new Scanner(System.in);
        return reader.nextLine();
    }

    private static void getListOfSpecialization() {
        System.out.print("Enter Doctor's medical specialization :(");
        for (MedicalSpecialization specialization : MedicalSpecialization.values()) {
            System.out.print(specialization + ", ");
        }
        System.out.println(")");
    }

    public static int getNumberFromUser() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

}
