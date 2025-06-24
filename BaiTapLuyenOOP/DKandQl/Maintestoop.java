package DKandQl;

public class Maintestoop {
    public static void main(String[] args) {
        Student s1 = new Student("011", "Kieu Tuan Anh");
        Student s2 = new Student("002", "Kieu thanh tung");
        Course khoahocmot = new Course("002", "Tieng anh", 10);
        Course khoahochai = new Course("003", "Tieng han", 15);
        Course khoahocba = new Course("004", "Tieng trung", 20);
        s1.DangKi(khoahocmot);
        s1.DangKi(khoahochai);
        s1.DangKi(khoahocba);
        s1.Display();
        // khoahocmot.Display();
        // s2.DangKi(khoahocmot);
        // khoahocmot.Display();
    }
}
