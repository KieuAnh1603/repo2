package NganHang;

public class Maintest {
    public static void main(String[] args) {
        BankAccount TK1 = new CheckingAccount("123456", 10000);
        BankAccount TK2 = new SavingsAccount("1234", 20000, 1000);
        // TK1.deposit(1000);
        // TK1.InThongTin();
        TK2.InThongTin();
        TK2.withDraw(900);
        TK2.InThongTin();
    }
}
