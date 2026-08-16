package Bai3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Address addr = new Address("123 Đường Cầu Giấy", "Hà Nội", "100000");

        // Đầu vào: 3 tài khoản
        Account acc1 = new NormalAccount("user_normal", "normal@gmail.com", addr);
        Account acc2 = new VipAccount("vip_silver", "vipsilver@gmail.com", addr, 500);  // points < 1000
        Account acc3 = new VipAccount("vip_gold", "vipgold@gmail.com", addr, 1200);   // points >= 1000

        List<Account> accounts = new ArrayList<>();
        accounts.add(acc1);
        accounts.add(acc2);
        accounts.add(acc3);

        double orderAmount = 2000000.0; // Đơn hàng 2.000.000 VNĐ

        System.out.println("================ TÍNH TIỀN ĐƠN HÀNG 2.000.000 VNĐ ================");
        for (Account acc : accounts) {
            double discountRate = acc.getDiscount();
            double finalAmount = orderAmount * (1 - discountRate);

            System.out.println("\n" + acc.toString());
            System.out.println("- Mức giảm giá: " + (discountRate * 100) + "%");
            System.out.println("- Số tiền thanh toán: " + finalAmount + " VNĐ");
        }

        // --- TEST YÊU CẦU NÂNG CAO: THÊM ĐIỂM VÀ NÂNG HẠNG ---
        System.out.println("\n================ TEST NÂNG HẠNG (addPoints) ================");
        VipAccount vip2 = (VipAccount) acc2; // Cast về VipAccount để gọi addPoints
        vip2.addPoints(600); // Đang từ 500 điểm + 600 điểm = 1100 điểm (vượt 1000)
    }

}
