package Shipper;

import java.util.ArrayList;
import java.util.List;

public class DelAgent {
    private String name;
    private List<DeliveryRequest> YeuCauGiaoHang;

    public DelAgent(String name){
        this.name=name;
        this.YeuCauGiaoHang = new ArrayList<>(); 
    }
    public void GiaoChoShiper(DeliveryRequest req) {
        // req.getDailydcchon() = this;
        YeuCauGiaoHang.add(req);
        System.out.println("Shipper " + name + " đã nhận đơn " + req.getMaYc() + " từ " + req.getSender());

    }

    public void DisplayCacYc(){
        if(YeuCauGiaoHang.isEmpty()){
            System.out.println("chua co yeu cau nao");

        }else{
            System.out.println("Cac yeu cau giao hang cua dai ly "+ name + " la:");
            for(int i = 0; i<= YeuCauGiaoHang.size(); i++){
                System.out.println( (i+1)+ ". "+"Ma yeu cau "+ YeuCauGiaoHang.get(i).getMaYc() + " ten ng gui "+ YeuCauGiaoHang.get(i).getSender() + " ten ng nhan "+ YeuCauGiaoHang.get(i).getReceiver());
            }
        }
    }

  
}
