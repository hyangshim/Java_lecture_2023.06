package ch07_inheritance.sec05_abstract;

public class Main {
	public static void main(String[] args) {
		//Phone phon =new Phone() ; // 추상 클래스는 객체화 할수 없음
		SmartPhone sp =new SmartPhone();  // 추상 클래스를 상속 받은 클래스만 객체화 가능
		sp.turnOn();
		sp.call("010-2345-6789");
		sp.turnOff();
		
	}
}
