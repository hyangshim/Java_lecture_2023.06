package ch13_collection.sec01_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * List Sort
 * 1) 대소관계가 명확한 클래스(Integer,String 등)
 * 2) 일반적인 클래스 
 */

public class Ex05_sort {
	public static void main(String[] args) {
		List<Integer>scoreList =Arrays.asList(78,98,64,85,91);
		
		// 오름차순 정렬
		scoreList.sort(Comparator.naturalOrder());
		scoreList.forEach(x ->System.out.print(x+" "));
		System.out.println();
		
		System.out.println("내림차순");
		scoreList.sort(Comparator.reverseOrder());
		scoreList.forEach(x ->System.out.print(x+" "));
		System.out.println();
		// 과일 정렬
		List<String> fruitList =Arrays.asList("감","참외","수박","복숭아");
		//오름차순 정렬
		fruitList.sort(Comparator.naturalOrder());
		fruitList.forEach(x ->System.out.print(x+" "));
		System.out.println();
		
		//내림차순 정렬
		fruitList.sort(Comparator.reverseOrder());
		fruitList.forEach(x ->System.out.print(x+" "));
		System.out.println();
		
		List<Member> list =new ArrayList<Member>();
		list.add(new Member(23,"James"));
		list.add(new Member(28,"Maria"));
		list.add(new Member(28,"Brian"));
		list.add(new Member(23,"Emma"));
		// 미리 정의된 순서 : 나이 내림차순,이름 오름차순
		list.sort(Comparator.naturalOrder());
		list.forEach(x -> System.out.println(x));
		
		System.out.println("---------------역순-------------------");
		// 미리 정의된 순서의 역순 
		list.sort(Comparator.reverseOrder());
		list.forEach(x -> System.out.println(x));
		
		System.out.println("-----------------Comparator class 비교-----------------");
		//Comparator class 비교
		list.sort(new MemberCompartor());
		list.forEach(x -> System.out.println(x));
		
		System.out.println("----------------나이만 오름차순------------------");
		list.sort(new MemberAgeCompartor());
		list.forEach(x -> System.out.println(x));
		
		System.out.println("----------------이름만 오름차순------------------");
		list.sort(new MemberNameCompartor());
		list.forEach(x -> System.out.println(x));
	}
}
