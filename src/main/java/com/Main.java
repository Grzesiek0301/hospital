package com;

public class Main {
	public static void main(String[] args) {
		DoctorsData doctorsData = new DoctorsData();
		Menu menu = new Menu(doctorsData);
		menu.choice();
	}
}
