package 연습문제;

import java.util.Scanner;

public class _01_4장_5장 {

	public static void main(String[] args) {
		// p 147 3번 4번
		/*
		 * Scanner scan =new Scanner(System.in); int score = scan.nextInt(); String
		 * Rating =" "; scan.close(); System.out.print("등급은"); if (score < 70) {
		 * Rating=("D"); }else if (score < 80) { Rating=("C"); }else if (score < 90){
		 * Rating=("B"); }else { Rating=("A"); } System.out.println(Rating+"입니다.");
		 */
		
		
		// 4번
		System.out.println("어떤 혜택을 원하세요?");
		char grade ='A';
		switch (grade) {
		case 'A':System.out.println("VVIP 혜택을 받으실 수있습니다.");
		case 'B':System.out.println("VIP 혜택을 받으실 수있습니다.");break;
		case 'C':System.out.println("우수 회원  혜택을 받으실 수있습니다.");
		case 'D':System.out.println("일반 회원 혜택을 받으실 수있습니다.");break;
		default: System.out.println("혜택이 없습니다.");
		}
		System.out.println("감사합니다");
		
		
		// P160 2번문제
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			if(i % 3 == 0);
			sum +=i;
		}
		System.out.println("3의 배수 총합은 "+sum);
		
		System.out.println("--------------3번문제------------------");
		
		while (true) {
		int num1 = 1 + (int)(Math.random()*6);
		//(int) (Math.random() * 6)는 0 이상 1 미만,1 +를 통해 1 이상 7 미만의 난수를 생성
		int num2 = 1 + (int)(Math.random()*6);
			System.out.println("("+num1 +","+num2+")");
			if((num1+num2)==5) {
				break;
			}
		}
		System.out.println("--------------4번문제------------------");
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= 10; j++) {
				if (4*i +5*j == 60) {
					System.out.println("("+i+","+j+")");
				}
			}
			
		}
		System.out.println("--------------5번문제------------------");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------------6번문제------------------");
		for (int i = 0; i <4; i++) {
			for (int j = 0; j <4-i; j++) {
				System.out.print(" ");
			}for (int j = 0; j < i+1; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		System.out.println("-------------------------------p200~201----------------");
		System.out.println("--------------4번문제------------------");
		int max =0;
		int [] array = {1,5,3,8,2};
		for (int i : array) {
			if( i > max)
			max = i;
		}
		System.out.println("max: "+max);
		
		System.out.println("--------------5번문제------------------");
		
		int[][] arrays = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		int sum5 =0;
		double avg =0.0;
		
		int count=0;
		for (int i = 0; i < arrays.length; i++) {
			for (int j = 0; j < arrays[i].length; j++) {
				sum5 +=arrays[i][j];
				count++;
			}
		}
		avg =(double)sum5/count;
		System.out.println(sum5);
		System.out.println(avg);
		
		System.out.println("--------------6번문제------------------");
		boolean run =true;
		int studentNum =0;
		int[] scores =null;
		Scanner scanner=new Scanner(System.in);
		while(run) {
			System.out.println("---------------------------------------");
			System.out.println("1.학생수 | 2. 점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------");
			System.out.println("선택>");
			int selectNo =Integer.parseInt(scanner.nextLine());
			if (selectNo == 1) {
				
			}else if (selectNo == 2) {
				
			}else if (selectNo == 3) {
				
			}else if (selectNo ==4) {
				
			}else if (selectNo == 5) {
				run=false;
			}
			
		}
		System.out.println("프로그램 종료");
	}

}
