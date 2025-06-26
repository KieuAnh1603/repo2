package Online;

public class Maintest {
    public static void main(String[] args) {
        // Tạo sản phẩm
        Product p1 = new Product("P-01", "Laptop", 1500, 10);
        Product p2 = new Product("P-02", "BanPhim", 1000, 20);

        // Tạo khách hàng
        Customer c1 = new Customer("C-01", "Kieu tuan anh");

        //tao don hang moi
        Order donhang1 = new Order("0001");
        donhang1.addItem(new OrderItem(p1, 1));
        donhang1.addItem(new OrderItem(p2, 2));


        Order donhang2 = new Order("0002");
        donhang2.addItem(new OrderItem(p1, 3));
        donhang2.addItem(new OrderItem(p2, 2));

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
