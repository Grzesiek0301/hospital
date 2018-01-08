package com;

import java.util.Scanner;

import static com.DoctorList.printInfo;

public class Menu {

    public void choice() {
        while (true) {
            System.out.println("What do you want to do?");
            System.out.println("1.Add the doctor.");
            System.out.println("2.Remove the doctor.");
            System.out.println("3.Show list of doctors.");
            System.out.println("4.Exit ");
            System.out.println("");
            System.out.println("Choose number from 1 to 4: ");

            int read;
            Scanner write1 = new Scanner(System.in);
            read = write1.nextInt();

            triggerMenu(read);
        }
    }

    DoctorsData doctorsData;
    Commands commands;

    private void triggerMenu(int read) {
        switch (read) {
            case 1:
                doctorsData.addDoctor(commands.getDoctorFromUser().getId(), commands.getDoctorFromUser());
                printInfo("Doctor added");
                break;
            case 2:
                doctorsData.removeDoctor(commands.getIdToremove());
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

}
