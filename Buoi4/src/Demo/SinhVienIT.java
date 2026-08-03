package Demo;

public class SinhVienIT extends Student {
	private String nganh;

	public SinhVienIT() {
		super();
	}

	public SinhVienIT(String name, String gPA, String nganh) {
		super(name, gPA);
		this.nganh = nganh;
	}

	public String getNganh() {
		return nganh;
	}

	public void setNganh(String nganh) {
		this.nganh = nganh;
	}

	@Override
	public String toString() {
		return "SinhVienIT [nganh=" + nganh + ", toString()=" + super.toString() + "]";
	}
	@Override
	public String an() {
		return "san";
	}
//	//Overload
//		public String an(String thucAn) {
//			return thucAn;
//		}
//		//Overload
//		public String an(String thucAn,int soLuong) {
//			return "Toi an "+thucAn+"soLuong: "+soLuong;
//	}


}
