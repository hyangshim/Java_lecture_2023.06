package ch07_inheritance.sec05_abstract;


/*
 * Phone을 추상화한 클래스
 */
public abstract class Phone {
	// abstract 추상 클래스 선언
	public String owner;
	public String number;
	
	void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
	
	// 추상 클래스를 상속받은 클래스는 추상 메소드를 반드시 재정의해야 한다.
	public abstract void call(String number);
	
	
	
}
