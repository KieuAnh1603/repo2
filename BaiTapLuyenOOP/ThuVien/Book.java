package ThuVien;

public class Book {
    private String isbn;// ma sach, moi quyen mot so
    private String title;// ten sach
    private String author;//ten tac gia
    private boolean isAvailable;// sach con muon dc k
    
    public Book(String isbn, String title, String author){
        this.isbn=isbn;
        this.title=title;
        this.author=author;
        isAvailable = true; // sach luon dc muon
    }
    // danh dau sach da muon
    public void borrow(){
        isAvailable = false;
    }
    //danh dau sach da dc tra
    public void returnBook(){
        isAvailable = true;
    }
    public boolean getisAvailable(){
        return isAvailable;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getIsbn() {
        return isbn;
    }
}
