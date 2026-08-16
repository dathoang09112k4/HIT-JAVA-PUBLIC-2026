package Bai3;

public class NormalAccount extends Account{
    public NormalAccount(String username, String email, Address address) {
        super(username, email, address);
    }

    // Tài khoản thường không được giảm giá (0%)
    @Override
    public double getDiscount() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "NormalAccount{" + super.toString() + "}";
    }
}
