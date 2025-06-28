package BenhVien;

import java.time.LocalDateTime;

public class Maintesat {
    public static void main(String[] args) {
        Doctor bacsi1 = new Doctor("Kieu Tuan anh", "BS001");
        Patient benhnhan1 = new Patient("Nguyen", "BN00001");

        Appointment cuochen1 = new Appointment(bacsi1, benhnhan1, LocalDateTime.of(2025, 6, 28, 16, 30, 0), "o benh vien");
        bacsi1.AddSchedule(cuochen1);
        benhnhan1.Addappointments(cuochen1);

        bacsi1.DisplaySchedule();
        benhnhan1.DisplayAPPM();


    }
}
