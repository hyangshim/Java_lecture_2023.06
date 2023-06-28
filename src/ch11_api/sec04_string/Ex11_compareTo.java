package ch11_api.sec04_string;



/**
 * compareTo(): 사전순으로 나열했을때 두 객체의 비교(음수,0,양수)
 * 숫자값을 보지 말고, 부호만 봐라!
 */


public class Ex11_compareTo {
	public static void main(String[] args) {
		String s1 = "Apple",s2 ="Bananaaaa";
		String s3 = new String("Apple");
		
		
		System.out.println(s1.compareTo(s2));  // -1  A와 B차이가 1
		System.out.println(s2.compareTo(s1));  // 1   (B-A)
		System.out.println(s1.compareTo(s3));  // 0    (A -A)
		
		System.out.println("---------------------------");
		Student st1 = new Student(1, "James");
		Student st2 = new Student(2, "Maria");
		Student st3 = new Student(3, "Brian");
		System.out.println(st1.compareTo(st2));   // -3 (j - m)
		System.out.println(st1.compareTo(st3));   //  8 ( j - b)
	}

}
