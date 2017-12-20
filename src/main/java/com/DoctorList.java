package com;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DoctorList {

	private final Map<Integer, Doctor> map = new TreeMap<>();

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
				break;
		}
	}

	public void addDoctors() {
		String nameFromUser = getStringParameter("Doctor's name:");
		String surnameFromUser = getStringParameter("Doctor's surname:");
		int idFromUser = getIdFromUser();
		Doctor doctor = new Doctor(nameFromUser, surnameFromUser, idFromUser);

		map.put(doctor.getId(), doctor);
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
