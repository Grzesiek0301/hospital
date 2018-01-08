package com;

import java.util.Scanner;

public class Commands {

    public Doctor getDoctorFromUser() {
        String name = getStringParameter("Doctor's name :");
        String surname = getStringParameter("Doctor's surname :");
        int id = getIdFromUser();
        Doctor doctor = new Doctor(name, surname, id);
        return doctor;
    }

    public int getIdToremove() {
        System.out.println("Enter Id of doctor,who you want to remove :");
        Scanner removeDoctor = new Scanner(System.in);
        int idToRemove = removeDoctor.nextInt();
        return idToRemove;
    }

    public static void printInfo(String info) {
        System.out.println(info);
        System.out.println("--------------------");
    }

    public static String getStringParameter(String parameter) {
        System.out.println(parameter);
        Scanner reader = new Scanner(System.in);
        return reader.nextLine();
    }

    public static int getIdFromUser() {
        System.out.print("Doctor ID: ");
        Scanner readId = new Scanner(System.in);
        return readId.nextInt();
    }

}