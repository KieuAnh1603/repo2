package NganHang;

public class CheckingAccount extends BankAccount{
    private double Phithauchi = 0.01;
    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);

        //TODO Auto-generated constructor stub
    }

    @Override
    public void withDraw(double amount) {
        System.out.println("So tien ban muon rut la:"+amount);
        if(amount<=getBalance()){
            this.setBalance(this.getBalance() - (amount+Phithauchi*amount));
            System.out.println("Rut thanh cong, so tien hien tai trong tai khoan cua ban la:"+ getBalance());
        }
        System.out.println("So tien ban muon rut khong hop le!");
    }
    
    
}
