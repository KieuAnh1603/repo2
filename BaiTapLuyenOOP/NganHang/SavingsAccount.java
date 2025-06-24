package NganHang;

public class SavingsAccount extends BankAccount{
    private double limit;

    public SavingsAccount(String accountNumber, double balance, double limit) {
        super(accountNumber, balance);
        this.limit=limit;
    }

    @Override
    public void withDraw(double amount) {
        System.out.println("So tien ban muon rut la: "+amount);
        limit -= amount;
        if(limit<0){
            System.out.println("Rut khong thanh cong, so tien vuot muc cho phep!");
            limit += amount;
        }
        this.setBalance(this.getBalance()-amount);
        System.out.println("Rut tien thanh cong,so tien con trong tai khoan tiet kiem cua ban bay gio la"+ limit);
    }
    
}
