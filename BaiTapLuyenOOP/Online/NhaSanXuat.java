package Online;

import java.util.ArrayList;
import java.util.List;

public class NhaSanXuat {
    private String name;
    private List<Product> dscacsanpham;

    public NhaSanXuat(String name){
        this.name=name;
        this.dscacsanpham = new ArrayList<>(); 
    }
    public String getName() {
        return name;
    }

    public void AddSP(Product pr){
        dscacsanpham.add(pr);
    }
    public void Hangconlaitrongkho(Product sp , OrderItem quan){
        int temp = sp.getStockQuantity();
        temp -= quan.getQuantity();
        sp.setStockQuantity(temp);
        // sp.getStockQuantity() = temp;
        System.out.println("So luong con lai cua san pham "+ sp + " la "+ temp);
        
    }

 
}
