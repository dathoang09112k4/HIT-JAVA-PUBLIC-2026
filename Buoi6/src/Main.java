import bai1.Customer;
import bai1.Order;
import bai1.Product;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Customer c = new Customer("Nguyễn Văn A", "0987654321", "Nhổn, Hà Nội");

        Order order = new Order("DH001", c);
        order.addProduct(new Product("T01", "Bàn Phím",120000,5));
        order.addProduct(new Product("T02", "Máy tính",130000,6));
        order.addProduct(new Product("T03", "Đện thoại",140000,7));

        order.printInvoice();


    }
}