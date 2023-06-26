package ch07_inheritance.sec04_polymorphism;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Cat cat =new Cat();
		cat.sound();
		
		Dog dog =new Dog();
		dog.sound();
		
		
		// 다형성, 자식은 부모 타입으로 자동 타입 변환이 이루어짐
		Animal animal =new Cat();
		animal.sound();
		animal=dog;
		animal.sound();
		
		// 자식은 부모 타입으로 자동적으로는 사용할 수 없음
		
//		cat = (Cat) new Animal();    //강제 타입 변환
//		cat.sound();   예외발생
		
		
		System.out.println("--------------------------");
		// 부모 타입을 자식 타입으로 태입할수 있는지 확인한 후 강제 타입 변환할것
		// animal이 어떤 타입인지 확인한 후 강제타입 변환할 것
		animal =cat;
		if (animal instanceof Cat) {
			cat =(Cat) animal;
			cat.sound();
		}else if (animal instanceof Dog) {
			dog =(Dog) animal;
			dog.sound();
		}else {
			System.out.println("cat.sound()를 사용할수 없음");
		}
		
		Object obj =new Animal();
		//obj.sound();
		// 기억하기
		if (obj instanceof Animal) {
			animal =(Animal) obj;
			animal.sound();
		}
		System.out.println("-----------------------");
		Random random =new Random();
		System.out.println(random.nextInt(45)+1);
	}

}
