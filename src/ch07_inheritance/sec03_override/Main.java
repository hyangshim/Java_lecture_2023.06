package ch07_inheritance.sec03_override;

public class Main {
	public static void main(String[] args) {
		Parent parent =new Parent();
		parent.paretInt =1000;
		parent.parentMethod();
		
		Child child =new Child();
		child.childInt=300;
		child.paretInt=600;
		child.parentMethod(); // child가 재정의한 함수를 재정의한다
	}

}
