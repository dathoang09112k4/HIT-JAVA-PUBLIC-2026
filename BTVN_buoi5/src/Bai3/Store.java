package Bai3;

import Bai1.Smartphone;

import java.util.ArrayList;

public class Store {
    private ArrayList<Smartphone> inventory;

    // Constructor: Khởi tạo danh sách rỗng
    public Store() {
        this.inventory = new ArrayList<>();
    }

    // Hàm thêm điện thoại vào kho
    public void addPhoneToStore(Smartphone phone) {
        this.inventory.add(phone);
    }

    // 1. Tìm kiếm theo ID (Trả về 1 chiếc điện thoại duy nhất)
    public Smartphone search(String id) {
        for (Smartphone phone : inventory) {
            if (phone.getId().equalsIgnoreCase(id)) {
                return phone; // Tìm thấy thì return dừng hàm luôn
            }
        }
        return null; // Chạy hết vòng lặp không thấy thì trả về null
    }

    // 2. Tìm kiếm theo Khoảng Giá (Lọc danh sách)
    public ArrayList<Smartphone> search(double minPrice, double maxPrice) {
        ArrayList<Smartphone> result = new ArrayList<>();
        for (Smartphone phone : inventory) {
            if (phone.getPrice() >= minPrice && phone.getPrice() <= maxPrice) {
                result.add(phone);
            }
        }
        return result;
    }

    // 3. Tìm kiếm theo Tên (Thêm boolean isName để lách luật Overload)
    public ArrayList<Smartphone> search(String keyword, boolean isName) {
        ArrayList<Smartphone> result = new ArrayList<>();
        if (isName) {
            for (Smartphone phone : inventory) {
                // Kiểm tra tên điện thoại có chứa keyword (không phân biệt hoa/thường)
                if (phone.getName().toLowerCase().contains(keyword.toLowerCase())) {
                    result.add(phone);
                }
            }
        }
        return result;
    }
}

