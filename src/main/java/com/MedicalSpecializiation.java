package com;

import java.util.Scanner;

public enum MedicalSpecializiation {

    PATHOLOGY,
    CARDIOLOGY,
    NEUROLOGY,
    UROLOGY;

    public static MedicalSpecializiation getMedicialSpecializiation(String selectedMedicialSpecializiation) {
        if (selectedMedicialSpecializiation.equals(PATHOLOGY.name())) {
            return MedicalSpecializiation.PATHOLOGY;
        } else if (selectedMedicialSpecializiation.equals(CARDIOLOGY.name())) {
            return MedicalSpecializiation.CARDIOLOGY;
        } else if (selectedMedicialSpecializiation.equals(UROLOGY.name())) {
            return MedicalSpecializiation.UROLOGY;
        } else return MedicalSpecializiation.NEUROLOGY;
    }

//    public static MedicalSpecializiation getMedicialSpecializiation(String selectedMedicialSpecializiation) {
//        for (MedicalSpecializiation medicalSpecializiation : MedicalSpecializiation.values()) {
//            if (medicalSpecializiation.name().equals(selectedMedicialSpecializiation)) {
//                return medicalSpecializiation;
//            }
//        }
//    }
}
