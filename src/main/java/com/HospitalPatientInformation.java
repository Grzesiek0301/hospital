package com;

public class HospitalPatientInformation {
	private final String patientName;
	private final String patientSurname;
	private final int personalPatientId;

	public HospitalPatientInformation(String patientName, String patientSurname, int personalPatientId) {
		this.patientName = patientName;
		this.patientSurname = patientSurname;
		this.personalPatientId = personalPatientId;
	}
}
