package com.healthcare.test;
import com.healthcare.Doctor;
import com.healthcare.Patient;
import com.healthcare.Appointment;

import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

public class AppointmentTest {

    @Test
    public void testCancelAppointment() {
        Patient patient = new Patient("P001", "John Doe");
        Doctor doctor = new Doctor("D001", "Dr. Smith", "Cardiology");
        Appointment appointment = new Appointment("A001", new Date(), patient, doctor);

        appointment.cancelAppointment();
        assertEquals("Cancelled", appointment.getAppointmentDetails().contains("Cancelled") ? "Cancelled" : "Scheduled");
    }

    @Test
    public void testAppointmentDetails() {
        Patient patient = new Patient("P001", "John Doe");
        Doctor doctor = new Doctor("D001", "Dr. Smith", "Cardiology");
        Appointment appointment = new Appointment("A002", new Date(), patient, doctor);

        String details = appointment.getAppointmentDetails();
        assertTrue(details.contains("Appointment ID: A002"));
        assertTrue(details.contains("Scheduled"));
    }
}


