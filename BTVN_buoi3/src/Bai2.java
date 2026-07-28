import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập chuỗi: ");
        String chuoi = scanner.nextLine();
        boolean doiXung = true;
        for(int i=0; i< chuoi.length()/2; i++){
            if(chuoi.charAt(i) != chuoi.charAt(chuoi.length()-1-i)){
                doiXung= false;
                break;
            }
        }
        if(doiXung){
            System.out.print(chuoi.toUpperCase() + " chuỗi đối xứng");
        }else{
            System.out.print(chuoi.toLowerCase() + " chuỗi không đối xứng");
        }
    }
}
