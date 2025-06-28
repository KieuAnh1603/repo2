package Shipper;

public class DeliveryRequest {
    private String MaYc;
    private Customer sender;
    private Customer receiver;
    private Package goihang;
    private DelAgent Dailydcchon;

    public DeliveryRequest(String MaYc, Customer sender, Customer receiver, Package goihang){
        this.MaYc=MaYc;
        this.sender=sender;
        this.receiver=receiver;
        this.goihang=goihang;
       
    }
    public String getMaYc() {
        return MaYc;
    }
    public Customer getSender() {
        return sender;
    }
    public Customer getReceiver() {
        return receiver;
    }
    public Package getGoihang() {
        return goihang;
    }
    public DelAgent getDailydcchon() {
        return Dailydcchon;
    }


}
