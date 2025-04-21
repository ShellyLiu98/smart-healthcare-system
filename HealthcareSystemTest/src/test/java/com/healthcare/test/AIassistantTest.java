package com.healthcare.test;
import com.healthcare.Doctor;
import com.healthcare.Patient;
import java.util.Date;

import com.healthcare.AIassistant;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AIassistantTest {

    @Test
    public void testGenerateRecommendations() {
        AIassistant aiAssistant = new AIassistant("AI001", "v1.0");
        Patient patient = new Patient("P001", "John Doe");
        Doctor doctor = new Doctor("D001", "Dr. Smith", "Cardiology");

        List<Date> recommendations = aiAssistant.generateRecommendations(patient, doctor);
        assertNotNull(recommendations);
        assertTrue(recommendations.size() > 0);
    }
}

