package Bai3_2;
import java.util.Scanner;
public class TamGiac {
	private Diem A,B,C;
	TamGiac()
	{
	A= new Diem();
	B= new Diem();
	C= new Diem();
	}
	public void InTamGiac()
	{
	System.out.println("Toa do 3 dinh cua tam gia la: ");
	System.out.print("A"); A.InDiem(); 
	System.out.print("B"); B.InDiem();
	System.out.print("C"); C.InDiem();
	}
	// Các em tự viết Hàm tính độ dài cạnh khi biết tọa độ 1 đỉnh
	// Các em tự viết Hàm kiểm tra tam giác
	//Các em tự viết Hàm tính chu vi
	//Các em tự viết Hàm tính diện tích
	public static void main(String[] args)
	{
	System.out.println("Nhap 3 dinh cua tam giac: ");
	TamGiac T=new TamGiac();
	T.InTamGiac();
	}

	public void TamGiac1() {
		// TODO Auto-generated constructor stub
	}

}
