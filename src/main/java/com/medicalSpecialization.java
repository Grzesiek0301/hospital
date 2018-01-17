package com;


public enum medicalSpecialization {

    PATHOLOGY,
    CARDIOLOGY,
    NEUROLOGY,
    UROLOGY,
    NOT_DEFINED;


    public static medicalSpecialization getMedicialSpecialization(String medicialSpecialization) {
        for (medicalSpecialization specialization : medicalSpecialization.values()) {
            if (specialization.name().equals(medicialSpecialization)) {
                return specialization;
            }
        }
        return NOT_DEFINED;
    }
}
