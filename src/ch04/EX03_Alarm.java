package ch04;

import java.util.Scanner;

public class EX03_Alarm {

	public static void main(String[] args) {
	
		System.out.print("시간 입력>");
		System.out.print("분 입력>");
		Scanner scan =new Scanner(System.in);
		int h =Integer.parseInt(scan.nextLine());
		int m =Integer.parseInt(scan.nextLine());
		
		if (m <45 && h == 1) {
			System.out.println("12:"+(m+15));
		}else if (m < 45) {
			System.out.println((h-1)+":"+(m+15));
		}else
			System.out.println(h+":"+(m-45));
		
		

	}

}
