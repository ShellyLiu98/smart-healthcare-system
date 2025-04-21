package com.healthcare;
import java.util.Date;
import com.healthcare.Patient;
import com.healthcare.Doctor;
public class Appointment {
    private String appointmentID;
    private Date appointmentTime;
    private String status;
    private Patient patient;
    private Doctor doctor;

    public Appointment(String appointmentID, Date appointmentTime, Patient patient, Doctor doctor) {
        this.appointmentID = appointmentID;
        this.appointmentTime = appointmentTime;
        this.patient = patient;
        this.doctor = doctor;
        this.status = "Scheduled";
    }

    public void cancelAppointment() {
        this.status = "Cancelled";
    }

    public String getAppointmentDetails() {
        return "Appointment ID: " + appointmentID + ", Time: " + appointmentTime + ", Status: " + status;
    }
}