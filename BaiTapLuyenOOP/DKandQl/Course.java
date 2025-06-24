package DKandQl;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseCode;
    private String courseName;
    private int maxStudents;
    private List<Student> enrolledStudents;

    public Course(String courseCode, String courseName,int maxStudents){
        this.courseCode=courseCode;
        this.courseName=courseName;
        this.maxStudents=maxStudents;
        this.enrolledStudents = new ArrayList<>(maxStudents);
    }
    public boolean enroll(Student s){
        if(this.enrolledStudents.size() >= maxStudents){
            return false;
        }
        this.enrolledStudents.add(s);
        return true;
    }
    public void showCourseInfo(){
        System.out.println("Khoa hoc: "+ courseName + " ,ma khoa hoc: "+ courseCode + " ,tong so sinh vien "+ enrolledStudents.size()+"/" + maxStudents);
    }
    public String getCourseName() {
        return courseName;
    }
    public void Display(){
        for (Student sinhvien : enrolledStudents) {
            System.out.print(sinhvien.getName()+ ',');
            
        }
        System.out.println();
    }
}
