package Bai_3;
import java.util.Scanner;
public class book {
	private String ma, ten, tg, loai, nxb;
	//private int sotrang, tap, gia;
	book(String ma, String ten,String tg,String loai,String nxb)
	{
	this.ma=ma; this.ten=ten; this.tg=tg; this.loai=loai; this.nxb=nxb;
	}
	public void INSACH()
	{
	System.out.println("Ten sach: " + this.ten + "; Ma sach: " + this.ma+ ";Tac gia: " + this.tg+ "; Loai sach: " + this.loai + "; NXB: " + this.nxb);
	}
	public static void main(String[] args)
	{
	String ma, ten, tg, loai, nxb;
	Scanner s= new Scanner(System.in);
	System.out.println("Nhap Ma sach, ten sach, tac gia, loai sach, NXB: ");
	ma = s.nextLine(); 
	ten = s.nextLine(); 
	tg = s.nextLine(); 
	loai = s.nextLine(); 
	nxb = s.nextLine(); 
	book sach=new book(ma, ten, tg, loai, nxb);
	sach.INSACH();
	}
	public book() {
		// TODO Auto-generated constructor stub
	}

}
