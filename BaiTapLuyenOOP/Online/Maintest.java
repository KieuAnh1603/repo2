package Online;

public class Maintest {
    public static void main(String[] args) {
        // Tạo sản phẩm
        
        Product p1 = new Product("P-01", "Laptop", 1500, 10);
        Product p2 = new Product("P-02", "BanPhim", 1000, 20);
        NhaSanXuat nsx1 = new NhaSanXuat("co so 1");
        nsx1.AddSP(p1);
        nsx1.AddSP(p2);

        // Tạo khách hàng
        Customer c1 = new Customer("Kieu tuan anh", "C-01");

        //tao don hang moi

        Order donhang1 = new Order("0001");
        OrderItem dathang1= new OrderItem(p1, 1);
        OrderItem dathang2= new OrderItem(p2, 2);

        Order donhang2 = new Order("0002");
        OrderItem dathang3= new OrderItem(p1, 3);
        OrderItem dathang4= new OrderItem(p2, 5);

        // Order donhang1 = new Order("0001");
        // donhang1.addItem(new OrderItem(p1, 1));
        // donhang1.addItem(new OrderItem(p2, 2));


        // Order donhang2 = new Order("0002");
        // donhang2.addItem(new OrderItem(p1, 3));
        // donhang2.addItem(new OrderItem(p2, 2));

        donhang1.addItem(dathang1);
        donhang1.addItem(dathang2);
        
        donhang2.addItem(dathang3);
        donhang2.addItem(dathang4);

        nsx1.Hangconlaitrongkho(p1, dathang1);
        nsx1.Hangconlaitrongkho(p1, dathang3);
        nsx1.Hangconlaitrongkho(p2, dathang2);
        nsx1.Hangconlaitrongkho(p2, dathang4);
        
        
        c1.addDonHang(donhang1);
        c1.addDonHang(donhang2);

        System.out.println("cac don ma khach hang da mua: ");
        c1.InTT();

        // System.out.println("Khach hang "+ c1.getName() + " da mua " );
        // tinh tien
        System.out.println("Tong tien cua don hang " + donhang1.getOrderId() +" la: "+ donhang1.TinhTien());
        System.out.println("Tong tien cua don hang " + donhang2.getOrderId() +" la: "+ donhang2.TinhTien());




    }
}
