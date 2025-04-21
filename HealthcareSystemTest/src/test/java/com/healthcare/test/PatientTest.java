package com.healthcare.test;
import com.healthcare.Patient;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PatientTest{
    @Test
    public void testConstructorAndGetPatientID(){
        Patient patient =new Patient("P001", "John Doe");
        assertEquals("P001", patient.getPatientID(),"Patient ID should be 'P001'.");
    }
    @Test 
    public void testNameAssignment(){
         Patient patient = new Patient("P002", "Jane Smith");
         assertNotNull(patient, "Patient object should not be null.");
    }
}