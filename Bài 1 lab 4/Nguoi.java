package Java_60;

public class Nguoi extends benhNhan{
	private String ten;
	private int tuoi;
	private char gioiTinh;
	
	


	public Nguoi(String tienSu, String chuanDoan, String ten, int tuoi, char gioiTinh) {
		super(tienSu, chuanDoan);
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
		System.out.println("tenNguoi : ");
	}
	public void doTuoi() {
		System.out.println("doTuoi : ");
	}
	public void gioiTinh() {
		System.out.println("gioiTinh nam : ");
	}
	
	



	public Nguoi() {
		// TODO Auto-generated constructor stub
	}

}
