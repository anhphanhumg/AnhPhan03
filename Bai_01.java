package Bai_01;

import java.util.Scanner;

public class Bai_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Nhap a = ");
		a = sc.nextInt();
		System.out.println("Nhap b = ");
		b = sc.nextInt();
		System.out.println("a + b = " +(a+b));
		System.out.println("a - b = " +(a-b));
		System.out.println("a * b = " +(a*b));
		System.out.println("a / b = " +(a/b));
		System.out.println("a % b = " +(a%b));
		
		System.out.println(a +" == " +b+":"+(a==b));
		System.out.println(a +" != " +b+":"+(a!=b));
		System.out.println(a +" < " +b+":"+(a<b));
		System.out.println(a +" <= " +b+":"+(a<=b));
		System.out.println(a +" > " +b+":"+(a>b));
		System.out.println(a +" >= " +b+":"+(a>=b));
	}

	public Bai_01() {
		// TODO Auto-generated constructor stub
	}

}
