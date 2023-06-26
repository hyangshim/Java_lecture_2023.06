package ch07_inheritance.sec02;

public class Child extends Parent {
	int childInt;
	Child (){}
	Child (int childInt){
		super(childInt * 2);// 부모 생성자 호출
		this.childInt=childInt;
	}
	void chilMethod() {
		System.out.println(this.childInt);
	}

}
