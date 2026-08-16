package Bai2;

import java.util.*;
import Bai1.Smartphone;

public class Customer {
    private String customerName;
    private ArrayList<Smartphone> cart;

    public Customer(String customerName) {
        this.customerName = customerName;
        this.cart = new ArrayList<>();
    }

    public void removePhone(String id){
        for(int i=0;i<cart.size();i++){
            if(cart.get(i).getId().equalsIgnoreCase(id)){
                cart.remove(i);
                System.out.println("Đã xóa sản phẩm có ID: "+id);
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm id "+id);
    }

    public void removePhone(int index){
        if(index >= 0 && index < cart.size()){
            cart.remove(index);
            System.out.println("Đã xóa sản phẩm tại vị trí index: "+index);
        }else{
            System.out.println("Vị trí index "+index+" không hợp lệ");
        }
    }
    public ArrayList<Smartphone> getCart(){
        return new ArrayList<>(this.cart);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void addPhone(Smartphone phone) {
        this.cart.add(phone);
    }
}
