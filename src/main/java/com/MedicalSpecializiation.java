package com;

import java.util.Scanner;

public enum MedicalSpecializiation {

    PATHOLOGY,
    CARDIOLOGY,
    NEUROLOGY,
    UROLOGY;

    public static MedicalSpecializiation getMedicialSpecializiation() {
        System.out.println("Enter Doctor's medicial specializiation (PATHOLOGY, CARDIOLOGY, UROLOGY, NEUROLOGY):");
        String selectedMedicialSpecializiation = getStringParameter("Your choise:");
        if (selectedMedicialSpecializiation.equals(PATHOLOGY.name())) {
            return MedicalSpecializiation.PATHOLOGY;
        } else if (selectedMedicialSpecializiation.equals(CARDIOLOGY.name())) {
            return MedicalSpecializiation.CARDIOLOGY;
        } else if (selectedMedicialSpecializiation.equals(UROLOGY.name())) {
            return MedicalSpecializiation.UROLOGY;
        } else return MedicalSpecializiation.NEUROLOGY;
    }

    private static String getStringParameter(String parameter) {
        System.out.println(parameter);
        Scanner reader = new Scanner(System.in);
        return reader.nextLine();
    }


}
