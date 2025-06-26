package Online;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderId;
    private double totalAmount;
    private List<OrderItem> DonDatHang;


    public Order(String orderId){
        this.orderId=orderId;
        this.DonDatHang = new ArrayList<>();
    }

    public void addItem(OrderItem DatHang){
        DonDatHang.add(DatHang);
    }
    public String getOrderId() {
        return orderId;
    }

    public double TinhTien(){
        double total = 0;
        for(OrderItem sp : DonDatHang){
            total += sp.caculateTotal();
        }
        return total;
    }

    public List<OrderItem> getDonDatHang() {
        return DonDatHang;
    }
}
