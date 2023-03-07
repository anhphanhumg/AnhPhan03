package Bai_01;

import java.util.Scanner;

public class Bai_08 {
	public static void main(String[] args) {
		int n, sum = 0, number;
        float TBC;
        Scanner scanner = new Scanner(System.in);
           
         
        System.out.println("Có mấy số nguyên có trong dãy: ");
        n = scanner.nextInt();
         
        for (int count = 1; count <=n; count++) {
            System.out.println("Nhập số thứ " + count + ": ");
            number = scanner.nextInt();
            sum += number;
        }
         
        TBC = (float) sum / n;
        System.out.println("Trung bình cộng = "+(TBC) );
    }
 
	

	public Bai_08() {
		// TODO Auto-generated constructor stub
	}

}
