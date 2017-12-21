package com;

public class Doctor {
	private final int personalDoctorId;
	private final String name;
	private final String surname;
	private final String medicalSpecializiation;

	public Doctor(String name, String surname, int personalDoctorId, String medicalSpecializiation) {
		this.personalDoctorId = personalDoctorId;
		this.surname = surname;
		this.name = name;
		this.medicalSpecializiation = medicalSpecializiation;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public int getPersonalDoctorId() {
		return personalDoctorId;
	}

	public String toString() {
		return name + " " + surname + " " + medicalSpecializiation;
	}


}
