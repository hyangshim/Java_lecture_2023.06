package 연습문제;

public class Member {
	String name;
	String id;
	String password;
	int age;
	
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", id=" + id + ", password=" + password + ", age=" + age + "]";
	}
	
	
	Member(String name, String id) {
		this.name =name;
		this.id =id;
	}

	


	
	
}
