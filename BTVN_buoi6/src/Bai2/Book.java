package Bai2;

public class Book extends Product{
    private String author;
    private int pages;

    public Book(String id, String name, double price, String author, int pages) {
        super(id, name, price);
        this.author = author;
        this.pages = pages;
    }

    @Override
    public double getDiscountedPrice() {
        return this.price * 0.90; // Giảm 10%
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("   -> Tác giả: " + author + " | Số trang: " + pages);
    }

    @Override
    public String toString() {
        return "Book{" + super.toString() + ", author='" + author + "', pages=" + pages + "}";
    }
}
