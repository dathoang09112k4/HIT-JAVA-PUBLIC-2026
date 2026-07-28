import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập lần lượt A,B,C: ");
        int A = Integer.parseInt(scanner.nextLine());
        int B = Integer.parseInt(scanner.nextLine());
        int C = Integer.parseInt(scanner.nextLine());
        int median;
        if ((A > B && A < C) || (A > C && A < B)) {
            median = A;
        } else {
            if ((B > A && B < C) || (B > C && B < A)) {
                median = B;
            } else {
                median = C;
            }
        }
        System.out.println(median);

    }
}
