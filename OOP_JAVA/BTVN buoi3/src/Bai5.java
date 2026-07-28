import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử: ");
        int n = Integer.parseInt(sc.nextLine());
        int[] dsach = new int[n];
        System.out.print("Nhập các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            dsach[i] = sc.nextInt();
        }
        int index = 0;
        int count = 0;
        for (int x : dsach) {
            if (index != 0 && index != dsach.length - 1) {
                if (x > dsach[index - 1] && x > dsach[index + 1]) {
                    count++;
                }
            }
            index++;
        }
        System.out.println("Số đỉnh núi: "+count);
    }
}
