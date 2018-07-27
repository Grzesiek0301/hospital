package com;

import com.models.Doctor;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class DoctorsData {
    private final Map<Integer, Doctor> mapDoctors = new HashMap<Integer, Doctor>();

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

    public Doctor getDoctor(int personalNumber) {

        return mapDoctors.get(personalNumber);
    }

    private void validateIfDoctorNotExists(int id) {
        if (!mapDoctors.containsKey(id)) {
            throw new NoSuchElementException("Doctor doesn't exist with ID :" + id);
        }
    }
}


