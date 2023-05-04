package Bai3_2;

import java.util.Scanner;
public class Diem {
	private int x,y;
	Diem(int x, int y)
	{
	this.x=x; this.y=y; 
	}
	Diem()
	{
	Scanner s= new Scanner(System.in);
	System.out.println("Nhap toa do diem: ");
	x=s.nextInt();
	y=s.nextInt();
	}
	public void InDiem()
	{
	System.out.println("(" + this.x + ", " + this.y+")");
	}
	public static void main(String[] args)
	{
	Diem A=new Diem();
	A.InDiem();
	}
	public void Diem1() {
		// TODO Auto-generated constructor stub
	}

}
