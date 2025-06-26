package Online;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String customerId;
    private String name;
    private List<Order> orderHistory;

    public Customer(String name, String customerId){
        this.name=name;
        this.customerId=customerId;
        this.orderHistory = new ArrayList<>();
    }


    public void addDonHang(Order donhang){
        this.orderHistory.add(donhang);
    }

    
    public String getCustomerId() {
        return customerId;
    }
    public String getName() {
        return name;
    }
    public void InTT(){
        if(this.orderHistory.isEmpty()){
            System.out.println("Khach hang chx mua don nao");
        }else {
            for(int i=0 ; i< orderHistory.size(); i++){

                System.out.println( name + " la: " + orderHistory.get(i).getOrderId());
            }
        }
    }
    
}
