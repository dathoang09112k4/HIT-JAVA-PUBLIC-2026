
public class SinhVien {
    private String maSV;
    private String ten;
    private double diemToan;
    private double diemLy;
    private double diemHoa;

    public SinhVien() {
    }

    public SinhVien(String maSV, String ten, double diemToan, double diemLy, double diemHoa) {
        this.maSV = maSV;
        this.ten = ten;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public String getMaSV() {
        return maSV;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public double getDiemLy() {
        return diemLy;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public String getTen() {
        return ten;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public void setDiemLy(double diemLy) {
        this.diemLy = diemLy;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }

    public void print(){

   }
}
