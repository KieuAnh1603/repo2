package BenhVien;

import java.util.ArrayList;
import java.util.List;

public class Patient {
    private String name;
    private String id;
    private List<Appointment> appointments;

    public Patient(String name, String id){
        this.name=name;
        this.id=id;
        this.appointments= new ArrayList<>();
    }
    public List<Appointment> getAppointments() {
        return appointments;
    }
    public String getId() {
        return id;
    }
    public String getNamePatient() {
        return name;
    }
    public void Addappointments(Appointment CuocHen){
        appointments.add(CuocHen);
    }
    public void DisplayAPPM(){
        if(this.appointments.isEmpty()){
            System.out.println("Ban chx co cuoc hen nao");
        } else{
            System.out.println("Cac cuoc hen cua khach hang "+ name+" la:");
            for(int i=0 ; i < appointments.size(); i++){
                System.out.println((i+1)+". Bac si"+ appointments.get(i).getDoctor().getNameDoctor() +" va "+ appointments.get(i).getPatient().getNamePatient() );
            }
        }
    }
}
