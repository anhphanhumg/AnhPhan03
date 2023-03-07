package Bai_01;
import java.util.Scanner;
public class Bai_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.println("Nhập các số nguyên: ");
		do {
		System.out.println("Số a: ");
		a = sc.nextInt();
		System.out.println("Số b: ");
		b = sc.nextInt();
		System.out.println("Số c: ");
		c = sc.nextInt();
		System.out.println("Tổng 3 số a+b+c là : "+(a+b+c));
		}while((a+b+c)<=100);
	}

	public Bai_05() {
		// TODO Auto-generated constructor stub
	}

}
