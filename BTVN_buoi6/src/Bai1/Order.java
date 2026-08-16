package Bai1;

import java.util.ArrayList;

public class Order {
    private String orderId;
    private Customer customer;
    private ArrayList<Product> items;

    public Order() {
    }

    public Order(String orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.items = new ArrayList<>();
    }

    public void addProduct(Product p){
        this.items.add(p);
    }
    public double getTotal(){
        double total = 0;
        for (Product p : items) {
            total += p.getSubtotal();
        }
        return total;
    }
    public void printInvoice(){
        System.out.println("================ HÓA ĐƠN ================");
        System.out.println("Mã đơn hàng: " + orderId);
        System.out.println("Khách hàng: " + customer.getName() + " - SĐT: " + customer.getPhone());
        System.out.println("Địa chỉ: " + customer.getAddress());
        System.out.println("----------------------------------------");
        System.out.println("Danh sách sản phẩm:");

        for (Product p : items) {
            System.out.println("- " + p.getName() + " - SL: " + p.getQuantity()
                    + " - Đơn giá: " + p.getPrice()
                    + " - Thành tiền: " + p.getSubtotal());
        }

        System.out.println("----------------------------------------");
        System.out.println("TỔNG TIỀN: " + getTotal() + " VNĐ");
        System.out.println("========================================");
    }

}


