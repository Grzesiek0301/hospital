package com;

import com.models.Doctor;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DoctorListFileReader {

    static void loadDoctorsFromFile(DoctorsData doctorsData) {
        File file = new File("DoctorList.txt");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                Doctor doctor = readDoctorFromLine(line);
                addDoctorToMap(doctorsData, doctor);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static Doctor readDoctorFromLine(String line) {
        String[] doctorData = line.split(";");
        int id = Integer.parseInt(doctorData[0]);
        String name = doctorData[1];
        String surname = doctorData[2];
        String specialization = doctorData[3];
        return new Doctor(name, surname, id, MedicalSpecialization.getMedicialSpecialization(specialization));
    }

    private static void addDoctorToMap(DoctorsData doctorsData, Doctor doctor) {
        doctorsData.addDoctor(doctor.getPersonalNumber(), doctor);
    }
}