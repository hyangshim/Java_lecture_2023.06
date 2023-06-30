package ch13_collection.sec03_map;

import java.util.HashMap;
import java.util.Map;

import ch13_collection.sec02_set.Member;

public class Ex02_MemberHashMap {
	public static void main(String[] args) {
		Member m1 =new Member(24,"James","010-5522-6544");
		Member m2 =new Member(45,"James","010-5522-6545");
		Member m3 =new Member(24,"Maria","010-5522-6591");
		
		Map<Integer, Member> map =new HashMap<Integer, Member>();
		map.put(101, m1);
		map.put(102, m2);
		map.put(103, m3);
		for (int key :map.keySet())
			System.out.println(key + " : "+ map.get(key));
		
		System.out.println("========================");
		// Member을 키값으로 쓸수있음 hashCode와 equals로 만들어줬기때문
		Map<Member, Integer> map2 =new HashMap<Member, Integer>();
		map2.put(m1,100);
		map2.put(m2,200);
		map2.put(m3,300);
		for (Member m:map2.keySet())
			System.out.println(m + " : "+ map2.get(m));
		System.out.println("========================");
		
		// 기존 key값과 다르므로 새로운 객체 추가 
		map.put(300,m1);
		map.forEach((k,v)->System.out.println(k+":"+v));
		System.out.println("========================");
		
		// m1이 key로 존재하므로 값만 바뀜
		map2.put(m1, 500);
		map2.forEach((k,v)->System.out.println(k+":"+v));
		
	}

}
