package BenhVien;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
// import java.time.Duration;
// import java.time.LocalDate;
// import java.time.LocalTime;

public class Appointment {
    private Doctor doctor;
    private Patient patient;
    private LocalDateTime timeSlot;
    private String note;
    private DateTimeFormatter formatter;

    public Appointment(Doctor doctor, Patient patient, LocalDateTime timeSlot, String note){
        this.doctor=doctor;
        this.patient=patient;
        this.formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    }
    public Doctor getDoctor() {
        return doctor;
    }
    public String getNote() {
        return note;
    }
    public Patient getPatient() {
        return patient;
    }

    public LocalDateTime getTimeSlot() {
        return timeSlot;
    }

}
