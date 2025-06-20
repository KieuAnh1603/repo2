package Chamcongnv;

public class FullTimeEmployee extends Employee {
    private int thang;
    public FullTimeEmployee(String name, String id, int thang) {
        super(name, id);
        this.thang=thang;
    }

    @Override
    public void CheckIn() {
        System.out.println("Da cham cong");

    }

    @Override
    public void CheckOut() {
        System.out.println("Ban lam: "+ thang +" thang");

    }

    @Override
    public double computeSalary(int HoursWorked) {
        return HoursWorked*100;
    }
    @Override
    public void Information() {
        System.out.println("ID: " + getId() + ", Name: " + getName()+" luong: "+ computeSalary(thang));
    }
    
}
