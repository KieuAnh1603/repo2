package ThuVien;

import java.util.ArrayList;
import java.util.List;

public class Member{
    private String memberId;
    private String name;
    private List<Book> borrowedBook;
    // neu sach con, muon va them vao danh sach
    public Member(String memberId, String name){
        this.memberId=memberId;
        this.name=name;
        this.borrowedBook = new ArrayList<>();
    }

    public boolean borrowBook(Book b){
        if(b.getisAvailable()){
            borrowedBook.add(b);
            b.borrow();
            System.out.println(name+"da muon cuon: "+ b.getTitle() +" cua tg " + b.getAuthor() );
            return true;
        }
        System.out.println("Sach da dc muon");
        return false;
    }

    //xoa khoi danh sach, cap nhat trang thai danh sach
    public void returnBook(Book b){
        if(borrowedBook.remove(b)){
            b.returnBook();
            System.out.println(name + "da tra cuon: "+ b.getTitle());
        }
    }
    public void showBorrowedBook() {
        System.out.println("Sach " + name + " dang muon:");
        for (Book b : borrowedBook) {
            
            System.out.println(" - " + b.getTitle()+ " ma " + b.getIsbn() + " cua " + b.getAuthor());
        }
    }
}
