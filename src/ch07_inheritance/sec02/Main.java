package ch07_inheritance.sec02;

/**
 * 부모의 생성자 호출
 */
public class Main {
	public static void main(String[] args) {
		Parent parent =new Parent();
		Child child =new Child(300);
		
		//parent.parenInt=1000;
		parent.parentMethod();
		
		child.chilMethod();
		
		// child가 상속받은 parent의 속성/메소드 이용
		child.parentMethod();
		
	}
}
