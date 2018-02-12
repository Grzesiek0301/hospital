package com;

import com.models.Person;

public class PersonalDataReceiverFactory {

    private DoctorsData doctorsData;

    public PersonalDataReceiverFactory(DoctorsData doctorsData) {
        this.doctorsData = doctorsData;
    }

    public Person getPersonalData(int idOfPerson, String indicator) {
        if (indicator.equals("Doctor")) {
            return DoctorPersonalDataReceiver.getPerson(doctorsData, idOfPerson);
        } else if (indicator.equals("Patient")) {
            System.out.println("Patient's data");
        }
        return null;
    }
}
