package Online;

public class OrderItem {
    private Product sanpham;
    private int quantity;

    public OrderItem(Product sanpham, int quantity){
        this.quantity=quantity;
        this.sanpham=sanpham;
        
    }

    public double caculateTotal(){
        return (sanpham.getPrice()*quantity);
    }
    public int getQuantity() {
        return quantity;
    }
}
