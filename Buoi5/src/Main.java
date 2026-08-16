import java.util.ArrayList;
import java.util.List;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         List<SinhVien> ds=new ArrayList<>();
         SinhVien s1=new SinhVien("1","Sang",1,2,3);
         SinhVien s2=new SinhVien("2","Dat",4,5,6);
          ds.add(s1);
          ds.add(s2);

         for(SinhVien sv:ds){
             sv.print();

         double tb1 = (s1.getDiemHoa() + s1.getDiemLy() + s1.getDiemToan()) /3;
         double tb2 = (s2.getDiemHoa() + s2.getDiemLy() + s2.getDiemToan()) /3;

         System.out.println(tb1);
         System.out.println(tb2);







         }

    }
}