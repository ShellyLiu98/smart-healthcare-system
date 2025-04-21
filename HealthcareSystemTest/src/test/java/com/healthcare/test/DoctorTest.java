package com.healthcare.test;
import com.healthcare.Doctor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DoctorTest {

    @Test
    public void testGetDoctorDetails() {
        Doctor doctor = new Doctor("D001", "Dr. Smith", "Cardiology");
        String details = doctor.getDoctorDetails();
        assertEquals("Doctor ID: D001, Name: Dr. Smith, Specialty: Cardiology", details);
    }

    @Test
    public void testDoctorSpecialtyUpdate() {
        Doctor doctor = new Doctor("D002", "Dr. Brown", "Neurology");
        doctor.setSpecialty("Orthopedics");
        assertEquals("Orthopedics", doctor.getSpecialty());
    }
}

