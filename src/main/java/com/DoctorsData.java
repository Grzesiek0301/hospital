package com;

import com.models.Doctor;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class DoctorsData {
    private final Map<Integer, Doctor> mapDoctors = new HashMap<>();

    public void addDoctor(int id, Doctor doctor) {
        validateIfDoctorExist(id);
        mapDoctors.put(id, doctor);
    }

    private void validateIfDoctorExist(int id) {
        if (mapDoctors.containsKey(id)) {
            throw new RuntimeException("Doctor exists already with ID : " + id);
        }
    }

    public void removeDoctor(int id) {
        validateIfDoctorNotExists(id);
        mapDoctors.remove(id);
    }

    public void getList() {
        for (Map.Entry<Integer, Doctor> mapa : mapDoctors.entrySet()) {
            System.out.println(mapa.getValue().getName() + "  " + mapa.getValue().getSurname() + " " + mapa.getValue().getMedicalSpecializiation());
        }
    }

    public String getDoctorNameAndSurname(int personalNumber) {

        return "Name: " + mapDoctors.get(personalNumber).getName() + "\nSurname: " + mapDoctors.get(personalNumber).getSurname();
    }

    private void validateIfDoctorNotExists(int id) {
        if (!mapDoctors.containsKey(id)) {
            throw new NoSuchElementException("Doctor doesn't exist with ID :" + id);
        }
    }
}


