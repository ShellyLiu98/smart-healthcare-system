package com.healthcare;

public class Patient {
    private String patientID;
    private String name;

    // constructor
    public Patient(String patientID, String name) {
        this.patientID = patientID;
        this.name = name;
    }

    // Getter 
    public String getPatientID() {
        return patientID;
    }

    public String getName() {
        return name;
    }
}
