package bai1;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String order_id;
    private Customer customer;
    private List<Product> products;

    public Order(String order_id, Customer customer) {
        this.order_id = order_id;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void setProducts(List<Product> products){
        this.products = products;
    }
    public void addProduct(Product p){
        products.add(p);

    }

    public Double total(){
        double results = 0;
        for(Product p : products){
            results += p.getPrice() * p.getQuantity();
        }
        return results;
    }

    public void printInvoice(){
        System.out.println("Đơn hàng: "+order_id);
        System.out.println("Khách hàng: "+customer.getName()+"-"+customer.getPhone());
        System.out.println("Danh sách sản phẩm: ");
        for (Product p : products) {
            System.out.println("  - " + p.getName() + ": " + p.getPrice());
        }
        System.out.println("Tổng tiền: " + total());
    }
}
