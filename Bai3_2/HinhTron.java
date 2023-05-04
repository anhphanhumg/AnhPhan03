package Bai3_2;
import java.util.Scanner;
public class HinhTron extends Diem{
	private int r;
	HinhTron() {
	// TODO Auto-generated constructor stub
	Scanner s= new Scanner(System.in);
	System.out.println("Nhap ban kinh hinh tron: ");
	this.r=s.nextInt();
	}
	HinhTron(int x,int y,int r) {
	// TODO Auto-generated constructor stub
	super(x,y);
	this.r=r;
	}
	public void InHinhTron()
	{
	System.out.print("Toa do tam cua hinh tron la: ");
	super.InDiem();
	System.out.println("Ban kinh cua hinh tron la: " + r);
	}
	//Tinh chu vi
	public double ChuVi()
	{
	return (float) 2*3.14*r;
	}
	//Tinh dien tich
	public double DienTich()
	{
	return (float) 3.14*r*r;
	}
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.println("Nhap toa do dinh và ban kinh hinh tron: ");
	HinhTron O=new HinhTron();
	O.InHinhTron();
	System.out.println("Chu vi hinh tron: " + O.ChuVi());
	System.out.println("Dien tich hinh tron: " + O.DienTich());
	System.out.println("================ ");
	System.out.println("Hinh tron thu 2: ");
	HinhTron O1=new HinhTron(0,0,5);
	O1.InHinhTron();
	System.out.println("Chu vi hinh tron: " + O1.ChuVi());
	System.out.println("Dien tich hinh tron: " + O1.DienTich());
	}
	public void HinhTron1() {
		// TODO Auto-generated constructor stub
	}

}
