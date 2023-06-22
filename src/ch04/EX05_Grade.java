package ch04;

public class EX05_Grade {
	public static void main(String[] args) {
	
		int score = 100;
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
			Rating = '0';
		}else {
			Rating ='-';
		}
		
		String result = score + "점은 " + grade + Rating + "학점입니다.";
		System.out.println(result);
	
		
	}

}
