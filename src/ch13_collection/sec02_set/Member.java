package ch13_collection.sec02_set;

import java.util.Objects;

public class Member {
	private int age;
	private String name;
	private String tel;
	
	public Member () {}
	public Member(int age, String name,String tel) {
		super();
		this.age = age;
		this.name = name;
		this.tel = tel;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
	
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	@Override
	public String toString() {
		return "Member [age=" + age + ", name=" + name + ", tel=" + tel + "]";
	}
	// hashCode 만들어주기  hashCode와 equals일반적으로 함께 사용
	//두 객체가 동일한지 여부를 빠르게 확인하기 위한 용도로 사용될 수 있음
	@Override
	public int hashCode() {
		return Objects.hash(age,name);
		// 이름이 같으면 중복 제거해줌
		//return Objects.hash(age);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Member))
		return false;
		Member mem =(Member) obj;
		return this.age == mem.getAge() && this.name.equals(mem.getName());
		// 이름이 같으면 중복 제거해줌 
		//return  this.age == mem.getAge();
	}
	

}
