import java.util.ArrayList;
import java.util.List;

public class Doctor {
    private String doctorID;
    private String name;
    private String specialty;
    private List<Appointment> appointments;

    public Doctor(String doctorID, String name, String specialty) {
        this.doctorID = doctorID;
        this.name = name;
        this.specialty = specialty;
        this.appointments = new ArrayList<>();
    }

    public String getDoctorDetails() {
        return "Doctor ID: " + doctorID + ", Name: " + name + ", Specialty: " + specialty;
    }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }
    public void setSpecialty(String s){
        this.specialty=s;
    }
   public String getSpecialty(){
        return this.specialty;
    }
    public List<Appointment> getAppointments() {
        return appointments;
    }
}
