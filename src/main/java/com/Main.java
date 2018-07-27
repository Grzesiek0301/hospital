package com;

public class Main {
    public static void main(String[] args) {
        DoctorsData doctorsData = new DoctorsData();
        DoctorListFileReader.loadDoctorsFromFile(doctorsData);
        Menu menu = new Menu(doctorsData);
        menu.choice();

String a = "hey";
  
    }
}
