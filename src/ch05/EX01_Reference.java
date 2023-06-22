package ch05;

import java.util.Scanner;



public class EX01_Reference {
	public static void main(String[] args) {
		// 참조형 변수
		int a =10,b=10;
		System.out.println(a == b);
		
		String ref1 = "자바";
		String ref2 ="자바";
		
		// String 의 내용이 같은지를 물어보는 것이 아니고,참조하는 기억장소가 같은지를 물어보는것
		System.out.println(ref1 == ref2); 
		String ref3 =new String("자바");// 새로운 객체를 만듬
		System.out.println(ref1 == ref3); //false
		System.out.println(ref1.equals(ref3)); // 글자의 수가 같으냐  true
		
		// 참조 타입 변수는 객체를 참조하지 않는다는 뜻으로 null 값 가질수 있음
		String s  =null;//  초기화
		String[] strArr =null;
		Scanner scan =null;
		System.out.println(s == null);
		String t ="";
		System.out.println(t.length());     //0
//		System.out.println(s.length());  null은 에러남요
		
		
	}

}
