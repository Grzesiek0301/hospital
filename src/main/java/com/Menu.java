package com;

import com.models.Doctor;

import java.util.NoSuchElementException;
import java.util.Scanner;

import static com.Commands.getDoctorFromUser;
import static com.Commands.getIdToRemove;

public class Menu {
    private final DoctorsData doctorsData;

    Menu(DoctorsData doctorsData) {
        this.doctorsData = doctorsData;
    }

    public void choice() {
        while (true) {
            StringBuilder mainMessage = new StringBuilder();
            mainMessage
                    .append("What do you want to do?\n")
                    .append("1.Add the doctor. \n")
                    .append("2.Remove the doctor.\n")
                    .append("3.Show list of doctors.\n")
                    .append("4.Exit\n")
                    .append(" \n")
                    .append("Choose number from 1 to 4: \n");
            System.out.println(mainMessage);

            Scanner input = new Scanner(System.in);

            triggerMenu(input.nextInt());
        }
    }

    private void triggerMenu(int read) {
        switch (read) {
            case 1:
                addDoctor();
                break;
            case 2:
                removeDoctor();
                break;
            case 3:
                printListOfDoctors();
                break;
            case 4:
                printInfo("Finished");
                break;
        }
    }

    private void addDoctor() {
        try {
            Doctor doctor = getDoctorFromUser();
            doctorsData.addDoctor(doctor.getPersonalNumber(), doctor);
            DoctorFileWriter.writeDoctorDataToFile(doctor);
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void printListOfDoctors() {
        printInfo("List of doctors:");
        doctorsData.getList();
        System.out.println("--------------------------");
    }

    private void removeDoctor() {
        try {
            doctorsData.removeDoctor(getIdToRemove());
            printInfo("Doctor remove");
        } catch (NoSuchElementException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void printInfo(String info) {
        System.out.println(info);
        System.out.println("--------------------");
    }
}
