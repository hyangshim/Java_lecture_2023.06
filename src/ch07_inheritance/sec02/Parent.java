package ch07_inheritance.sec02;

public class Parent {
	//속성
	int parenInt;
	Parent (){}
	Parent(int parenInt){
		this.parenInt =parenInt;
	}
	
	void parentMethod() {
		System.out.println(this.parenInt);
	}
	

}
