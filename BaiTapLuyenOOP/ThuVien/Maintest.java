package ThuVien;

public class Maintest {
    public static void main(String[] args) {
        Book b1 = new Book("001", "lap trinh code", "A");
        Book b2 = new Book("002", "cau truc du lieu", "B");

        Member m1 = new Member("M001", "Tuan Anh ");
        m1.borrowBook(b2);
        m1.borrowBook(b1);
        m1.borrowBook(b2);

        m1.showBorrowedBook();

        m1.returnBook(b1);
        m1.showBorrowedBook();
    }
}
