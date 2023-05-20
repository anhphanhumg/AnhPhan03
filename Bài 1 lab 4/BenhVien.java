package Java_60;

public class BenhVien{
	private String ten,diaChi,giamDoc;

	public BenhVien(String ten, String diaChi, String giamDoc) {
		super();
		this.ten = ten;
		this.diaChi = diaChi;
		this.giamDoc = giamDoc;
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



	public String getGiamDoc() {
		return giamDoc;
	}



	public void setGiamDoc(String giamDoc) {
		this.giamDoc = giamDoc;
	}
	public void tenBenhVien() {
		System.out.println("đa khoa phươnh đông");
	}
	public void tenDiaChi() {
		System.out.println("Bắc từ liêm");
	}
	public void tenGiamDoc() {
		System.out.println("P T A");
	}

	



	public BenhVien() {
		// TODO Auto-generated constructor stub
	}

}
