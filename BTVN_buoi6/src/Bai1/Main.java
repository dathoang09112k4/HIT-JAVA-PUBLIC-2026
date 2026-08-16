package Bai1;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Nguyễn Văn A", "0987654321", "123 Lê Lợi, TPHCM");

        // 2. Tạo 1 đơn hàng cho khách hàng đó
        Order order = new Order("ORD001", customer);

        // 3. Tạo 3 sản phẩm (id, name, price, quantity)
        Product p1 = new Product("P01", "Áo thun", 150000, 2);
        Product p2 = new Product("P02", "Quần Jeans", 350000, 1);
        Product p3 = new Product("P03", "Giày Sneaker", 800000, 1);

        // 4. Thêm sản phẩm vào đơn hàng
        order.addProduct(p1);
        order.addProduct(p2);
        order.addProduct(p3);

        // 5. In hóa đơn ra màn hình
        order.printInvoice();
    }
}
