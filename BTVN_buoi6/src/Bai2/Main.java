package Bai2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Tạo List chứa 5 sản phẩm khác loại
        List<Product> products = new ArrayList<>();

        // 2 Sách
        products.add(new Book("B01", "Lập trình Java", 120000, "Nguyễn Văn A", 350));
        products.add(new Book("B02", "Cấu trúc dữ liệu", 150000, "Trần Văn B", 400));

        // 2 Thiết bị điện tử
        products.add(new Electronic("E01", "Laptop Dell", 15000000, 24));
        products.add(new Electronic("E02", "Tai nghe Bluetooth", 800000, 12));

        // 1 Thực phẩm
        products.add(new Food("F01", "Bánh mì Pro", 20000, "20/08/2026"));

        // Duyệt danh sách và in thông tin
        System.out.println("================ DANH SÁCH SẢN PHẨM ================");
        for (Product p : products) {
            p.showInfo();
            System.out.println("toString(): " + p.toString());
            System.out.println("--------------------------------------------------");
        }

        // Yêu cầu nâng cao: Tính tổng giá trị kho hàng
        double totalOriginalPrice = 0;
        double totalDiscountedPrice = 0;

        for (Product p : products) {
            totalOriginalPrice += p.getPrice();
            totalDiscountedPrice += p.getDiscountedPrice();
        }

        System.out.println("\n================ THỐNG KÊ KHO HÀNG ================");
        System.out.println("Tổng giá trị kho hàng (Giá gốc)      : " + totalOriginalPrice + " VNĐ");
        System.out.println("Tổng giá trị nếu bán hết (Có áp dụng): " + totalDiscountedPrice + " VNĐ");
    }
}
