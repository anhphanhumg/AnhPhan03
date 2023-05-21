package SinhVien;

public class SinhVien extends Truong{
	String lop,nganh;
	
	

	public SinhVien(String ten, String diaChi, String hieuTruong, String lop, String nganh) {
		super(ten, diaChi, hieuTruong);
		this.lop = lop;
		this.nganh = nganh;
	}
	
	



	public String getLop() {
		return lop;
	}





	public void setLop(String lop) {
		this.lop = lop;
	}





	public String getNganh() {
		return nganh;
	}





	public void setNganh(String nganh) {
		this.nganh = nganh;
	}
	
	public void tenLop() {
		System.out.println("DCCTCT66L2");
	}
	public void tenNganh() {
		System.out.println("CNTT");
	}
	public void tenTruong() {
		System.out.println("MỎ ĐỊA CHẤT");
	}





	public SinhVien() {
		// TODO Auto-generated constructor stub
	}

}
