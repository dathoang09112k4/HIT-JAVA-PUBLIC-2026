import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhập bán kính hình tròn: ");
        double r = Double.parseDouble(scanner.nextLine());
        double PI = Math.round((Math.PI*100)/100);
        double chuVi = 2* Math.PI *r;
        double dienTich = Math.PI * Math.pow(r,2);
        if (r<0 || r>1000){
            System.out.print("bị giới hạn");
        }else {
            System.out.printf("chu vi : %.3f %n", chuVi);
            System.out.printf("Diện tich : %.3f", dienTich);
        }
    }
}
