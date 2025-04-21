import java.util.ArrayList;
import java.util.List;

public class Patient {
    private String patientID;
    private String name;
    private List<Appointment> appointments;

    public Patient(String patientID, String name) {
        this.patientID = patientID;
        this.name = name;
        this.appointments = new ArrayList<>();
    }

    public String getPatientDetails() {
        return "Patient ID: " + patientID + ", Name: " + name;
    }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }
}
