package Bai2;

public class Product {
    protected String id;
    protected String name;
    protected double price;

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public double getDiscountedPrice() {
        return this.price; // Giá mặc định không giảm
    }

    public void showInfo() {
        System.out.println("ID: " + id + " | Tên: " + name + " | Giá gốc: " + price + " | Giá sau giảm/phụ thu: " + getDiscountedPrice());
    }

    @Override
    public String toString() {
        return "Product{id='" + id + "', name='" + name + "', price=" + price + "}";
    }

    public double getPrice() {
        return price;
    }
}
