package com;

import com.defined.Doctor;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DoctorFileWriter {

    public static void writeDoctorDataToFile(Doctor doctor) {
        File file = new File("DoctorList.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
            bufferedWriter.write(doctor.getPersonalNumber() + ";" + doctor.getName() + ";" + doctor.getSurname() + ";" + doctor.getMedicalSpecializiation() + ";");
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}