package Bai2;


import Bai1.Smartphone;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Tạo 1 khách hàng
        Customer customer = new Customer("Nguyễn Văn A");

        // Tạo 2 sản phẩm Smartphone (dùng class Smartphone từ Bài 1)
        Smartphone p1 = new Smartphone("iPhone 15", 20000000, 5);
        Smartphone p2 = new Smartphone("Samsung S24", 18000000, 3);

        // Thêm 2 sản phẩm vào giỏ hàng
        customer.addPhone(p1);
        customer.addPhone(p2);

        System.out.println("Số lượng trong giỏ hàng ban đầu: " + customer.getCart().size());

        // THỬ NGHIỆM BẢO MẬT: Lấy giỏ hàng ra và gọi .clear() từ bên ngoài
        ArrayList<Smartphone> externalCart = customer.getCart();
        externalCart.clear();

        // Kiểm tra lại số lượng sản phẩm thực tế trong giỏ của Customer
        System.out.println("Số lượng sau khi bên ngoài gọi .clear(): " + customer.getCart().size());

        if (customer.getCart().size() == 2) {
            System.out.println("=> THÀNH CÔNG: Đã đóng gói và bảo vệ ArrayList thành công!");
        } else {
            System.out.println("=> THẤT BẠI: Giỏ hàng gốc đã bị can thiệp!");
        }
    }
}
