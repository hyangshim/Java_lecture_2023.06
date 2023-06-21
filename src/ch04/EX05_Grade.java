package ch04;

public class EX05_Grade {
	public static void main(String[] args) {
		// 50 < = score < = 99
		
		/*
		 90점 이상 A
		 80 
		 70
		 60    D
		 그외는 F
		 97점이상 +
		 93점이상 0
		 90점이상 - A+,A-,A0
		 
		 */
		int score = 94;
		char grade;
		
		
		if (score >=90)
			grade ='A';
		else if (score >=80)
			grade = 'B';
		else if  (score >=70)
			grade ='C';
		else if  (score >=60)
			grade ='D';
		else
			grade ='F';
		
		char Rating;
		if (score % 10 >=7) {
			Rating = '+';
		}else if (score % 10 >=3) {
			Rating = 'o';
		}else {
			Rating ='-';
		}
		
		String result = score + "점은 " + grade + Rating + "학점입니다.";
		System.out.println(result);
		
		
		
	}

}
