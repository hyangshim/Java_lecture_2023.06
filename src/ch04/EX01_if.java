package ch04;

import java.util.Scanner;

public class EX01_if {

	public static void main(String[] args) {
		int score =60 + (int)(40 * Math.random());
		if (score >=80)
			System.out.println(score + " 점은 평균 이상입니다.");
		else
			System.out.println(score + " 점은 평균 미만입니다.");
		
		char grade;
		if (score >=90)
			grade ='A';
		else if (score >=80)
			grade = 'B';
		else if  (score >=70)
			grade ='C';
		else
			grade ='D';
		System.out.println(score + "점은"+grade + "학점입니다.");
		
		
		switch (score / 10) {
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade ='C';
			break;
		default:
			grade ='D';
		}
		System.out.println(score + "점은"+grade + "학점입니다.");
		
		
		
		
//		int year = 1992;
//		if (year % 400 == 0) {
//			System.out.println(year+"윤년");
//		}else if (year % 100 ==0) {
//			System.out.println(year+"평년");
//		}else if (year % 4 == 0) {
//			System.out.println(year+"윤년");
//		}else
//			System.out.println(year+"평년");
		
		
		System.out.print("연도 입력>");
		Scanner scan =new Scanner(System.in);
		int year =Integer.parseInt(scan.nextLine());
		
		String result;
		if (year % 400 == 0) {
			result ="윤년";
		}else if (year % 100 ==0) {
			result ="평년";
		}else if (year % 4 == 0) {
			result ="윤년";
		}else
			result ="평년";
		System.out.println(year+"년은"+result+"입니다.");
		
		if (year % 400 == 0 || (year % 4 == 0&& year % 100 !=0))
			result ="윤년";
		else
			result = "평년";
		System.out.println(year+"년은"+result+"입니다.");
		
		System.out.println(year+"년은"+leapYear(year)+"입니다.");
			
		}
	private static String leapYear(int year) {
		if (year % 400 == 0 || (year % 4 == 0&& year % 100 !=0))
			return "윤년";
		return "평년";
	
		
		
		
	}

}
