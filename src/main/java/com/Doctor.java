package com;

public class Doctor {
	private final int id;
	private final String name;
	private final String surname;

	public Doctor(String name, String surname, int id) {
		this.id = id;
		this.surname = surname;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public int getId() {
		return id;
	}
	public String toString() {
		return name + " " + surname;
	}


}
