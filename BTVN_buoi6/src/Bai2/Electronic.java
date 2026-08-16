package Bai2;

public class Electronic extends Product{
    private int warrantyMonths;

    public Electronic(String id, String name, double price, int warrantyMonths) {
        super(id, name, price);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public double getDiscountedPrice() {
        return this.price * 1.05; // Cộng 5% (phụ thu bảo hành)
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("   -> Bảo hành: " + warrantyMonths + " tháng");
    }

    @Override
    public String toString() {
        return "Electronic{" + super.toString() + ", warrantyMonths=" + warrantyMonths + "}";
    }
}
