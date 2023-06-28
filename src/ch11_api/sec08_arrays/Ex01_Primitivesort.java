package ch11_api.sec08_arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Ex01_Primitivesort {
	public static void main(String[] args) {
		int[] scores = {87,73,65,98,79};
		Arrays.sort(scores);                          // 오름차순 정렬,자기파기적(scores의 내용이 바뀜)
		System.out.println(Arrays.toString(scores));
		System.out.println("-------------------------");
		
		
		Arrays.stream(scores).forEach(x ->System.out.println(x));
		System.out.println("-------------------------");
		
		String[] fruits= {"참외","수박","토마토"};
		Arrays.sort(fruits);                          // 오름차순
		System.out.println(Arrays.toString(fruits));
		
		
		Arrays.sort(fruits,Comparator.reverseOrder());
		System.out.println(Arrays.toString(fruits));
		System.out.println("-------------------------");
		
		//내림 차순 정렬,int와 같은 primitive type은 Boxing을 해야함
		Integer[] descSore = Arrays.stream(scores).boxed().toArray(Integer[]::new);
		Arrays.sort(descSore,Comparator.reverseOrder());
		System.out.println(Arrays.toString(descSore));
	}

}
