package ch13_collection.sec01_list;

import java.util.Comparator;

/*
 * 나이의 내림차순으로 1차 정렬
 * 나이가 같으면 이름의 오름차순으로 정렬
 */
public class MemberCompartor implements Comparator<Member> {

	@Override
	public int compare(Member m1, Member m2) {
		if (m1.getAge() == m2.getAge())
			return m1.getName().compareTo(m2.getName());
		return -(m1.getAge()- m2.getAge());
		
	}
}

/*
 * 나이만 비교 오름차순
 */
class MemberAgeCompartor implements Comparator<Member>{
	@Override
	public int compare(Member m1, Member m2) {
		return m1.getAge()- m2.getAge();
	}
}
/*
 * 이름만 비교 오름차순
 */
class MemberNameCompartor implements Comparator<Member>{

	@Override
	public int compare(Member m1, Member m2) {
		return -m1.getName().compareTo(m2.getName());
	}
	
}
