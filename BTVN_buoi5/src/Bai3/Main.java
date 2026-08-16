package Bai3;

import Bai1.Smartphone;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Tạo cửa hàng
        Store store = new Store();

        // Nạp 4-5 sản phẩm vào kho (Ví dụ về dữ liệu Smartphone)
        store.addPhoneToStore(new Smartphone("iPhone 15", 20000000, 10));
        store.addPhoneToStore(new Smartphone("Samsung Galaxy S24", 18000000, 15));
        store.addPhoneToStore(new Smartphone("Xiaomi 14", 15000000, 8));
        store.addPhoneToStore(new Smartphone("iPhone 13", 12000000, 5));
        // --- TEST 1: Tìm theo ID ---
        System.out.println("=== TEST 1: TÌM THEO ID (P02) ===");
        Smartphone foundPhone = store.search("P02");
        if (foundPhone != null) {
            System.out.println("Tìm thấy: " + foundPhone.getName() + " - " + foundPhone.getPrice());
        } else {
            System.out.println("Không tìm thấy!");
        }

        // --- TEST 2: Tìm theo Khoảng Giá (10 triệu -> 16 triệu) ---
        System.out.println("\n=== TEST 2: TÌM THEO KHOẢNG GIÁ (10M - 16M) ===");
        ArrayList<Smartphone> listByPrice = store.search(10000000, 16000000);
        for (Smartphone p : listByPrice) {
            System.out.println("- " + p.getName() + ": " + p.getPrice());
        }

        // --- TEST 3: Tìm theo Tên (Từ khóa "iPhone") ---
        System.out.println("\n=== TEST 3: TÌM THEO TÊN (iPhone) ===");
        ArrayList<Smartphone> listByName = store.search("iPhone", true);
        for (Smartphone p : listByName) {
            System.out.println("- " + p.getName() + ": " + p.getPrice());
        }
    }
}
