package Bai3;

public class Account {
    protected String username;
    protected String email;
    protected Address address;

    public Account(String username, String email, Address address) {
        this.username = username;
        this.email = email;
        this.address = address;
    }

    // Mức giảm giá mặc định (0%)
    public double getDiscount() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "Account{username='" + username + "', email='" + email + "', address=" + address + "}";
    }
}
