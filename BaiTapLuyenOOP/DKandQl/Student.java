package DKandQl;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentId;
    private String name;
    List<Course> registerdCourses;

    public Student(String studentId, String name){
        this.studentId=studentId;
        this.name=name;
        this.registerdCourses = new ArrayList<>();
    }
    public void DangKi(Course khoahoc){
        if(khoahoc.enroll(this)){
            System.out.println("Dang ki thanh cong");
            registerdCourses.add(khoahoc);
            return;
        }
        System.out.println("Dang ki khong thanh cong");
    }
    public void Information(){
        System.out.println(this.name);
        System.out.println(this.studentId);
    }
    public String getName() {
        return name;
    }
    public void Display(){
        System.out.println("Cac khoa hoc da dang ki: " );
        for (Course Khoc : registerdCourses) {
            System.out.print(Khoc.getCourseName()+",");
        }
    }
}

