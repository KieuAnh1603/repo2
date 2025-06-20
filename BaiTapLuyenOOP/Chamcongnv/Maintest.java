package Chamcongnv;

import java.util.ArrayList;
import java.util.List;

public class Maintest {
    public static void main(String[] args) {
        List<Employee> dsnhanvien = new ArrayList<>();
        dsnhanvien.add(new FullTimeEmployee("Kieu tuan Anh", "0023132", 10));
        for (Employee nv : dsnhanvien) {
            nv.CheckIn();
            nv.CheckOut();
            nv.computeSalary(0);
            nv.Information();
        }
    }
}
