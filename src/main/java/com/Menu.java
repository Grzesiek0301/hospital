package com;

import java.util.Scanner;

import static com.Commands.*;

public class Menu {
    private final DoctorsData doctorsData;

    public Menu(DoctorsData doctorsData) {
        this.doctorsData = doctorsData;
    }

    public void choice() {
        while (true) {
            System.out.println("What do you want to do?");
            System.out.println("1.Add the doctor.");
            System.out.println("2.Remove the doctor.");
            System.out.println("3.Show list of doctors.");
            System.out.println("4.Exit ");
            System.out.println("");
            System.out.println("Choose number from 1 to 4: ");

            Scanner input = new Scanner(System.in);

            triggerMenu(input.nextInt());
        }
    }

    private void triggerMenu(int read) {
        switch (read) {
            case 1:
                doctorsData.addDoctor(getIdFromUser(), getDoctorFromUser());
                break;
            case 2:
                doctorsData.removeDoctor(getIdToRemove());
                printInfo("Doctor remove");
                break;
            case 3:
                printInfo("List of doctors:");
                doctorsData.getList();
                System.out.println("--------------------------");
                break;
            case 4:
                printInfo("Finished");
                break;
        }
    }

    public static void printInfo(String info) {
        System.out.println(info);
        System.out.println("--------------------");
    }
}
