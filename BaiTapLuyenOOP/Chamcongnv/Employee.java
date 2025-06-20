package Chamcongnv;

public abstract class Employee implements ITimeTrackable{
    private String name;
    private String id;
    public abstract double computeSalary(int HoursWorked);
    public Employee(String name, String id){
        this.id=id;
        this.name=name;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public abstract void Information();
}
