package Online;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String name;
    private String id;
    private double price;
    private int stockQuantity;
    // private List<Product> dscacsanpham;

    public Product(String name, String id, double price, int stockQuantity){
        this.name=name;
        this.id=id;
        this.price=price;
        this.stockQuantity=stockQuantity;
        // this.dscacsanpham = new ArrayList<>();
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getStockQuantity() {
        return stockQuantity;
    }
    // public void AddSP(Product pr){
    //     dscacsanpham.add(pr);

    // }
    //ham tru stock - quantity
    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

}
