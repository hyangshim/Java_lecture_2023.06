package ch13_collection.sec01_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 2개의 정수를 입력 받아서 두수의 공약수를 찾으세요
 * 단, 두수의 공약수를 리스트로 반환하는 메소드 getCommonDivisors()를 만들어 해결하세요. 
 */
public class Q1_commonDivisors {
	public static void main(String[] args) {
		
		
		Scanner scan =new Scanner(System.in);
		System.out.print("양의 정수 2개 입력");
		String[] nums =scan.nextLine().split(" ");
		int a = Integer.parseInt(nums[0]);
		int b = Integer.parseInt(nums[1]);
		List<Integer> list =getCommonDivisors(a,b);
		for (int i : list)
			System.out.println(i);
		
	}
	
	// getCommonDivisors 메소드만들기
	private static List<Integer> getCommonDivisors(int a,int b){
		List<Integer> list =new ArrayList<Integer>();
		for (int i = 1; i < Math.min(a, b); i++) {
			if(a % i == 0 && b % i ==0){
				list.add(i);
			}
		}
		return list;
	}

}
