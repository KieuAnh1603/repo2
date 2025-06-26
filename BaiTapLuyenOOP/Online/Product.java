package Online;

public class Product {
    private String name;
    private String id;
    private double price;
    private int stockQuantity;

    public Product(String name, String id, double price, int stockQuantity){
        this.name=name;
        this.id=id;
        this.price=price;
        this.stockQuantity=stockQuantity;
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
    //ham tru stock - quantity
    public void SoLuongConLai(){
        this.stockQuantity -= 1;
    }

}
