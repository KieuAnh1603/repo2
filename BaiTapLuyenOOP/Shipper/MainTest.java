package Shipper;

public class MainTest {
    public static void main(String[] args) {
        Customer nggui = new Customer("Khach Anh");
        Customer ngnhan1 = new Customer("Khach Bao");
        Customer ngnhan2 = new Customer("Khach Kieu");
        Customer ngnhan3 = new Customer("Khach Tuan");


        Package pack1 = new Package(1.5, "Tap sach");
        Package pack2 = new Package(13, "Qua mit");
        Package pack3 = new Package(5, "Ghe");

        DeliveryRequest yeucau1 = new DeliveryRequest("RQ-001", nggui, ngnhan1, pack1);
        DeliveryRequest yeucau2 = new DeliveryRequest("RQ-002", nggui, ngnhan2, pack2);
        DeliveryRequest yeucau3 = new DeliveryRequest("RQ-003", nggui, ngnhan3, pack3);

        DelAgent shipercuadly = new DelAgent("Kieu Tuan Anh");
        shipercuadly.GiaoChoShiper(yeucau1);
        shipercuadly.GiaoChoShiper(yeucau2);
        shipercuadly.GiaoChoShiper(yeucau3);
        shipercuadly.DisplayCacYc();
    }
}
