import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // create Patient and Doctor
        Patient patient = new Patient("P12345", "John Doe");
        Doctor doctor = new Doctor("D67890", "Dr. Smith", "Cardiology");

        // create Appointment
        Appointment appointment = new Appointment("A0001", new Date(), patient, doctor);
        patient.addAppointment(appointment);
        doctor.addAppointment(appointment);

        // print the information of patient and doctor
        System.out.println(patient.getPatientDetails());
        System.out.println(doctor.getDoctorDetails());

        // AI assistant print the recommented schedule
        AIassistant aiAssistant = new AIassistant("AI001", "1.0");
        System.out.println("AI Recommendations: " + aiAssistant.generateRecommendations(patient, doctor));
    }
}
