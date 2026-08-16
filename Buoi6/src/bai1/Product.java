package bai1;

public class Product {
    private String id;
    private String name;
    private double price;
    private double quantity;


    public Product(String id, String name, double price, double quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getQuantity() {
        return quantity;
    }
}
