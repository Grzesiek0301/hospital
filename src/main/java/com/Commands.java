package com;

import java.util.Scanner;

public class Commands {
    public static Doctor getDoctorFromUser() {
        int id = getIdFromUser();
        String name = getStringParameter("Doctor's name :");
        String surname = getStringParameter("Doctor's surname :");
        Doctor doctor = new Doctor(name, surname, id);
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
}