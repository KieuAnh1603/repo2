package NganHang;

public abstract class BankAccount {
    private String accountNumber;
    private double balance;

    public void deposit(double amount){
        System.out.println("So tien ban muon gui: " + amount);
        System.out.println("So tien trong tai khoan cua ban hien gio la: "+(balance+=amount));
    }
    public BankAccount(String accountNumber, double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public void InThongTin(){
        System.out.println("Thong tin tai khoan cua ban la:");
        System.out.println("Account number : "+ accountNumber);
        System.out.println("Balance : "+ balance);
    }
    public abstract void withDraw(double amount);
    public double getBalance() {
        return balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
}
