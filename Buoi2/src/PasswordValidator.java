import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mật khẩu: ");
        String password = scanner.nextLine();
        //1. Cắt khoảng trắng thừa đầu
        String cleanedPassword = password.trim();
        int length = cleanedPassword.length();
        //2. Khai báo các biến cờ hiệu logic
        boolean hasDigit = false;
        boolean hasUpper = false;
        //3. Sử dụng vòng lặp duyệt qua từng ký tự
        for(int i=0;i<length;i++){
            char c = cleanedPassword.charAt(i);
            if(c>='0' && c<='9'){
               hasDigit = true;
            }
            if(c>='A' && c<='Z') {
                hasUpper = true;
            }
        }
        //4. Kiểm tra các điều kiện và in ra kết quả tương ứng
        System.out.println("\n---Kết quả kiểm tra---");
        // Tạo một biến để kiểm tra xem mật khẩu có hợp lệ hoàn toàn không
        boolean isValid = true;
        //Kiểm tra độ dài
        if(length < 8){
            System.out.println("Mật khẩu quá ngắn (phải từ 8 ký tự trở lên): ");
            isValid = false;
        }
        //Kiểm tra chữ số
        if(!hasDigit){ // tương đương với hasDigit == false
            System.out.println("Mật khẩu phải chứa ít nhất 1 chữ số");
            isValid = false;
        }
        //Kiểm tra chữ in hoa
        if(!hasUpper){
            System.out.println("Mật khẩu phải chứa ít nhất 1 chữ in hoa");
            isValid = false;
        }
        //Kết luận cuối cùng
        if(isValid){
            System.out.println("Mật khẩu hợp lệ!");
        }else{
            System.out.println("Vui lòng nhập lại mật khẩu thỏa mãn các điều kiện trên");
        }
    }
}
