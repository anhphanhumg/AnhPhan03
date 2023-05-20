package Java_60;

public class benhNhan extends BenhVien{
	private String tienSu,chuanDoan;
	
	
	

	public benhNhan(String tienSu, String chuanDoan) {
		super();
		this.tienSu = tienSu;
		this.chuanDoan = chuanDoan;
	}




	public String getTienSu() {
		return tienSu;
	}




	public void setTienSu(String tienSu) {
		this.tienSu = tienSu;
	}




	public String getChuanDoan() {
		return chuanDoan;
	}




	public void setChuanDoan(String chuanDoan) {
		this.chuanDoan = chuanDoan;
	}
	public void loaiTienSu() {
		System.out.println("đau dạ dày");
	}
	public void loaiChuanDoan() {
		System.out.println("đau đại tràng");
	}
	
	




	public benhNhan() {
		// TODO Auto-generated constructor stub
	}

}
