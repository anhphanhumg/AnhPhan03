package SinhVien;

public class Nguoi extends Truong{
	String ten;
	int tuoi;
	char gioiTinh;
	
	

	public Nguoi(String ten, int tuoi, char gioiTinh) {
		super();
		this.ten = ten;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
	}
	
	



	public String getTen() {
		return ten;
	}





	public void setTen(String ten) {
		this.ten = ten;
	}





	public int getTuoi() {
		return tuoi;
	}





	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}





	public char getGioiTinh() {
		return gioiTinh;
	}





	public void setGioiTinh(char gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	
	public void tenNguoi() {
		System.out.println(" Tên ");
	}
	public void tuoiNguoi() {
		System.out.println(" Tuổi ");
	}
	public void gioiTinhNguoi() {
		System.out.println(" Giới Tính ");
	}





	public Nguoi() {
		// TODO Auto-generated constructor stub
	}

}
