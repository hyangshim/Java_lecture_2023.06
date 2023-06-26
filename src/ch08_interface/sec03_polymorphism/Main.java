package ch08_interface.sec03_polymorphism;

public class Main {
	public static void main(String[] args) {
		Car car =new Car();
		car.run();
		
		car.frontLeftTire =new KumghoTire();
		car.backRightTire =new HankookTire();
		car.run();
		
		System.out.println("-----------------------");
		car.changeFrontTire(new HankookTire());
		car.run();
	}

}
