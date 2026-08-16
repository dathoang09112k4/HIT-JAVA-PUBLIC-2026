package Bai2;

public class Food extends Product{
    private String expiryDate;

    public Food(String id, String name, double price, String expiryDate) {
        super(id, name, price);
        this.expiryDate = expiryDate;
    }

    @Override
    public double getDiscountedPrice() {
        return this.price; // Giữ nguyên giá gốc
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("   -> Hạn sử dụng: " + expiryDate);
    }

    @Override
    public String toString() {
        return "Food{" + super.toString() + ", expiryDate='" + expiryDate + "'}";
    }
}
