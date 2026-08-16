package Bai1;

public class Smartphone {
    private static int totalPhone = 0;
    private String id;
    private String name;
    private double price;
    private int stock;

    public Smartphone(String name, double price, int stock) {
        totalPhone++;
        this.name = name;
        setPrice(price);
        setStock(stock);
        this.id = "SP" + totalPhone;
    }

    public static int getTotalPhone() {
        return totalPhone;
    }

    public static void setTotalPhone(int totalPhone) {
        Smartphone.totalPhone = totalPhone;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 0){
            System.out.println("Giá bán không được nhỏ hơn 0");
            this.price=0;
        }
        else this.price=price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if(stock < 0){
            System.out.println("Số lượng tồn kho không được nhỏ hơn 0");
            this.stock=0;
        }else this.stock = stock;
    }

}

