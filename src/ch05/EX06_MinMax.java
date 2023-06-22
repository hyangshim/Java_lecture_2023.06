package ch05;

import java.util.Arrays;
import java.util.Random;

public class EX06_MinMax {
	public static void main(String[] args) {
		
		int[] scores =new int[30];
		Random random= new Random();
		for(int i=0;i<scores.length;i++)
			scores[i] =random.nextInt(100);
		System.out.println(Arrays.toString(scores));
		
		//최댓값
		int max =0;
		for(int score:scores) {
			if(score > max) {
				max =score;
			}
		}
		System.out.println("최대값 "+max);
		
		// 최소값
		int min =100;
		for (int score:scores)
			if (score < min)
				min =score;
		System.out.println("최소값 "+min);
	}

}
