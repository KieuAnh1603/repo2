package Chamcongnv;

public class FreeLancer extends Employee {
    private int hour ;
    public FreeLancer(String name, String id, int hour) {
        super(name, id);
        this.hour=hour;
    }

    @Override
    public void CheckIn() {
        System.out.println("Da cham cong");
    }

    @Override
    public void CheckOut() {
        System.out.println("Ban lam: "+ hour +" gio");
    }

    @Override
    public double computeSalary(int HoursWorked) {
        return HoursWorked*100;
    }

    @Override
    public void Information() {
        System.out.println("ID: " + getId() + ", Name: " + getName()+ " Luong: " + computeSalary(hour));
    }
    
}
