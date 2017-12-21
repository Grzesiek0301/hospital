package com;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DoctorList {

	private final Map<Integer, Doctor> map = new TreeMap<>();

	private boolean loopCondition = true;

	public void choice() {
		while (loopCondition == true) {
			StringBuilder printMainMessage = new StringBuilder();
			printMainMessage
					.append("What do you want to do?\n\n")
					.append("1.Add the doctor.\n")
					.append("2.Remove the doctor.\n")
					.append("3.Show list of doctors.\n")
					.append("4.Exit \n");
			System.out.println(printMainMessage);

			Scanner write1 = new Scanner(System.in);
			int read = write1.nextInt();

			triggerMenu(read);
		}
	}

	private void triggerMenu(int read) {
		switch (read) {
			case 1:
				addDoctors();
				printInfo("Doctor added");
				break;
			case 2:
				removeDoctor();
				printInfo("Doctor remove");
				break;
			case 3:
				printInfo("List of doctors:");
				seeDoctor();
				System.out.println("--------------------------");
				break;
			case 4:
				printInfo("Finished");
				loopCondition = false;
		}
	}

	public void addDoctors() {
		String nameFromUser = getStringParameter("Doctor's name:");
		String surnameFromUser = getStringParameter("Doctor's surname:");
		int idFromUser = getIdFromUser();
		String medicalSpecializationDoctor = getStringParameter("Doctor specialization: ");
		Doctor doctor = new Doctor(nameFromUser, surnameFromUser, idFromUser, medicalSpecializationDoctor);

		map.put(doctor.getPersonalDoctorId(), doctor);
	}

	public void removeDoctor() {
		System.out.println("Enter ID of doctor which you want to remove: ");
		Scanner removeDoctor = new Scanner(System.in);
		int id = removeDoctor.nextInt();
		map.remove(id);
	}

	public void seeDoctor() {
		System.out.println(map);
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
