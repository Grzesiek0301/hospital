package com;


public enum MedicalSpecialization {

    PATHOLOGY,
    CARDIOLOGY,
    NEUROLOGY,
    UROLOGY,
    NOT_DEFINED;


    public static MedicalSpecialization getMedicialSpecialization(String medicialSpecialization) {
        for (MedicalSpecialization specialization : MedicalSpecialization.values()) {
            if (specialization.name().equals(medicialSpecialization)) {
                return specialization;
            }
        }
        return NOT_DEFINED;
    }
}
