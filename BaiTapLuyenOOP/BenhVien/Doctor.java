package BenhVien;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
    private String name;
    private String id;
    private List<Appointment> schedule;

    public Doctor(String name, String id){
        this.name=name;
        this.id=id;
        this.schedule = new ArrayList<>();

    }
    public void AddSchedule(Appointment CuocHen){
        schedule.add(CuocHen);
    }
    public void DisplaySchedule(){
        if(this.schedule.isEmpty()){
            System.out.println("Ban chx co cuoc hen nao");
        } else{
            System.out.println("Cac cuoc hen cua bac si "+ name+" la:");
            for(int i=0 ; i < schedule.size(); i++){
                System.out.println((i+1)+". "+ schedule.get(i).getDoctor().getNameDoctor() +" va benh nhan "+ schedule.get(i).getPatient().getNamePatient() );
            }
        }
    }
    public String getId() {
        return id;
    }
    public String getNameDoctor() {
        return name;
    }
    public List<Appointment> getSchedule() {
        return schedule;
    }
}
