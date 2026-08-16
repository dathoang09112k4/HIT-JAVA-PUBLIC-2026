package Bai1;

public class Main {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("Redmi Note 15",4990000,100);
        Smartphone s2 = new Smartphone("Samsung A35",6230000,200);
        Smartphone s3 = new Smartphone("Iphone 17 pro max",33000000,150);

        //In ra ID của từng chiếc để thấy ID tự động tăng
        System.out.println("ID= "+s1.getId()+" - "+" Tên: "+s1.getName()+" - "+"Giá: "+s1.getPrice());
        System.out.println("ID= "+s2.getId()+" - "+" Tên: "+s2.getName()+" - "+"Giá: "+s2.getPrice());
        System.out.println("ID= "+s3.getId()+" - "+" Tên: "+s3.getName()+" - "+"Giá: "+s3.getPrice());

        System.out.println("-------------------------------------------------");

        System.out.println("Tổng số lượng điện thoại đã tạo: "+ Smartphone.getTotalPhone());

    }
}
