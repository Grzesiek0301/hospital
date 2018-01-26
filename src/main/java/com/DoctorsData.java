package com;

import com.defined.Doctor;

import java.util.HashMap;
import java.util.Map;

public class DoctorsData {
    private final Map<Integer, Doctor> mapDoctors = new HashMap<>();

    public void addDoctor(int id, Doctor doctor) {
        mapDoctors.put(id, doctor);
    }

    public void removeDoctor(int id) {
        mapDoctors.remove(id);
    }

    public void getList() {
        for (Map.Entry<Integer, Doctor> mapa : mapDoctors.entrySet()) {
            System.out.println(mapa.getValue().getName() + "  " + mapa.getValue().getSurname() + " " + mapa.getValue().getMedicalSpecializiation());
        }
    }
}


