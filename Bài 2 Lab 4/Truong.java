package SinhVien;

public class Truong {
	String ten , diaChi,hieuTruong;
	
	
	

	public Truong(String ten, String diaChi, String hieuTruong) {
		super();
		this.ten = ten;
		this.diaChi = diaChi;
		this.hieuTruong = hieuTruong;
	}
	




	public String getTen() {
		return ten;
	}





	public void setTen(String ten) {
		this.ten = ten;
	}





	public String getDiaChi() {
		return diaChi;
	}





	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}





	public String getHieuTruong() {
		return hieuTruong;
	}





	public void setHieuTruong(String hieuTruong) {
		this.hieuTruong = hieuTruong;
	}
	public void tenTruong() {
	System.out.println("Mỏ địa chất");
	}
	public void tenDiaChi() {
		System.out.println("Bắc Từ Liêm");
	}
	public void tenHieuTruong() {
		System.out.println("P T A");
	}





	public Truong() {
		// TODO Auto-generated constructor stub
	}

}
