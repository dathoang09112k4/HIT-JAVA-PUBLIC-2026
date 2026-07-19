import java.util.Scanner;

public class ScoreManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng học sinh: ");
        int n = Integer.parseInt(scanner.nextLine());
        double[] scores = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập điểm học sinh thứ " + (i + 1) + ": ");
            scores[i] = Double.parseDouble(scanner.nextLine());
        }
        System.out.println("\n---KẾT QUẢ QUẢN LÝ ĐIỂM---");
        //Gọi hàm và in ra màn hình
        System.out.println("Điểm cao nhất: " + findMax(scores));
        System.out.printf("Điểm trung bình lớp: %.2f%n ", calculateAverage(scores));
        System.out.println("Số học sinh dưới trung bình: " + countFailedStudents(scores));

    }
    //Hàm tìm giá trị điểm lớn nhất
    public static double findMax(double[] arr) {
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    //Hàm tính điểm trung bình của lớp
    public static double calculateAverage (double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum/arr.length;
    }
    //Hàm đếm số học sinh dưới trung bình (<5.0) bằng vòng lặp for-each
    public static int countFailedStudents(double[] arr) {
        int count = 0;
        for (double score : arr) {
            if (score < 5.0) {
                count++;
            }
        }
        return count;
    }
}
