import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập lần lượt a,b,c: ");
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int tong = a + b;
        if(tong == c){
            System.out.print(a +" + " + b +" = "+ c);
            System.out.printf("%nBạn đã trả lời đúng");
            return;
        }else{
            System.out.printf("%nBạn đã trả lời sai");
        }

    }
}
