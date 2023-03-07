package Bai_01;
import java.util.Scanner;
public class Bai_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Giai thừa của số : ");
		a = sc.nextInt();
		System.out.println("là :"
		+tinhGiaithua(a));
		
		
		}
	public static long tinhGiaithua(int a) {
        if (a > 0) {
            return a * tinhGiaithua(a - 1);
        } else {
            return 1;
        }
	}

		

	
	public Bai_06() {
		// TODO Auto-generated constructor stub
	}

	}
