package ThuVien;

public class Maintest {
    public static void main(String[] args) {
        Book b1 = new Book("001", "lap trinh code", "A");
        Book b2 = new Book("002", "cau truc du lieu", "B");
        Book b3 = new Book("003", "Giai thuat", "C");
        Book b4 = new Book("004", "con tro", "D");

        Member m1 = new Member("M001", "Tuan Anh ");
        Member m2 = new Member("M002", "Sushi ");
        m1.borrowBook(b2);
        m1.borrowBook(b1);
        m1.borrowBook(b2);

        m1.showBorrowedBook();

        m1.returnBook(b1);
        m1.showBorrowedBook();


        m2.borrowBook(b4);
        m2.borrowBook(b3);
        m2.borrowBook(b2);
        m2.borrowBook(b1);
        m2.showBorrowedBook();
    }
}
