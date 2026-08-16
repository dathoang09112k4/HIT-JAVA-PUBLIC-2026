package Bai3;

public class VipAccount extends Account{
    private int points;

    public VipAccount(String username, String email, Address address, int points) {
        super(username, email, address);
        this.points = points;
    }

    // Giảm giá dựa trên điểm tích lũy:
    // Nếu points >= 1000: giảm 10% (0.10)
    // Nếu points < 1000: giảm 5% (0.05)
    @Override
    public double getDiscount() {
        if (points >= 1000) {
            return 0.10;
        }
        return 0.05;
    }

    // Yêu cầu nâng cao: Thêm điểm tích lũy và kiểm tra nâng hạng
    public void addPoints(int point) {
        boolean wasBelow1000 = this.points < 1000;
        this.points += point;
        System.out.println(username + " vừa tích thêm " + point + " điểm. Tổng điểm hiện tại: " + this.points);

        if (wasBelow1000 && this.points >= 1000) {
            System.out.println("🎉 Chúc mừng " + username + " đã được NÂNG HẠNG VIP CAO CẤP (Điểm >= 1000)!");
        }
    }

    public int getPoints() {
        return points;
    }

    @Override
    public String toString() {
        return "VipAccount{" + super.toString() + ", points=" + points + "}";
    }
}
