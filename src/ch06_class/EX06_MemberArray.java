package ch06_class;

public class EX06_MemberArray {
	public static void main(String[] args) {
		Member[] members =new Member[3];
		members[0] =new Member("Maria",21,"maria@naver.com");
		members[1]=new Member("Brian",30);
		members[2]=new Member("Tommy");
		
		for(Member member:members)
			System.out.println(member);
		
		System.out.println("=================== group================");
		Member[] group= {
				new Member("Maria",21,"maria@naver.com"),
				new Member("Brian",30),
				new Member("Tommy")
		};
		for (Member member :members)
			System.out.println(member);
	}

}
