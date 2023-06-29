package ch13_collection.sec02_set;

import java.util.HashSet;
import java.util.Set;

public class Ex02_MemberHashSet {
	public static void main(String[] args) {
		Member m1 =new Member(24,"James","010-5522-6544");
		Member m2 =new Member(45,"James","010-5522-6545");
		Member m3 =new Member(24,"Maria","010-5522-6591");
		// hashCode 값 확인
		System.out.printf("%d,%d,%d\n",m1.hashCode(),m2.hashCode(),m3.hashCode());
		
		
		Set<Member> set =new HashSet<Member>();
		set.add(m1);set.add(m2);set.add(m3);
		// 중복된 객체는 저장안됨
		set.add(new Member(24,"James","010-5522-6592"));
		System.out.println(set.size());
		// set은 순서가 보장이 안됨 // 입력한 순서랑 출력이 순서가다름
		for (Member m :set)
			System.out.println(m);
	}

}
