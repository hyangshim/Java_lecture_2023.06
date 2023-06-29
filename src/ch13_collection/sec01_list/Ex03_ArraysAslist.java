package ch13_collection.sec01_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex03_ArraysAslist {
	public static void main(String[] args) {
		// fruits를 fruitList로 변경 하는 과정
		String[] fruits = {"Apple","Banana","Cherry"};
		List<String> fruitList =Arrays.asList(fruits);
		for (String fruit:fruitList)
			System.out.println(fruit);
		
		
		System.out.println("-----------------------------");
		//list를 쉽게 만드는 방법
		List<Integer> scoreList = Arrays.asList(80,90,94,76);
		for (int score:scoreList)
			System.out.println(score);
		
		System.out.println("-----------------------------");
		scoreList =generateScore(5);
		for (int score:scoreList)
			System.out.println(score);
	}
	private static List<Integer> generateScore(int count){
		List<Integer> list =new ArrayList<Integer>();
		for (int i =0; i <count;i++) {
			int score =(int)(Math.random()*40)+60;
			list.add(score);
		}
		return list;
	}
}
