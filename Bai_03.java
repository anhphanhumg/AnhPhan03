package Bai_01;
import java.util.Scanner;


public class Bai_03 {
	public static void main(String[] args) {
		String yourname;
		int namsinh, namnay=2023;
		Scanner sc= new Scanner (System.in);
		System.out.println("nhập vào họ và tên của bạn:");
		yourname = sc.nextLine();
		System.out.println("nhập vào năm sinh của bạn:");
		namsinh = sc.nextInt();
		if ((namnay - namsinh) < 16)
		System.out.println("bạn " + yourname +" ở độ tuổi vị thành niên");
		else if ( (namnay - namsinh)>=16 || (namnay - namsinh)< 18)
			System.out.println ("bạn " + yourname + " ở độ tuổi trưởng thành");
		else
			System.out.println("bạn " + yourname +" đã già");

	}
    
    
	

	public Bai_03() {
		// TODO Auto-generated constructor stub
	}

}
