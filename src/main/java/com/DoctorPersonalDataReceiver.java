package com;

import com.models.Person;

public class DoctorPersonalDataReceiver {

    public static Person getPerson(DoctorsData doctorsData, int idOfPerson) {
        return doctorsData.getDoctor(idOfPerson);
    }
}
