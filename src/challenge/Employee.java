package challenge;

import java.time.LocalDate;
import java.util.Objects;

public class Employee implements Comparable{
	private int id;
	private String name;
	private Position position;
	private LocalDate joinDate;
	
	
	public Employee () {}
	public Employee(int id, String name, Position position, LocalDate joinDate) {
		super();
		this.id = id;
		this.name = name;
		this.position = position;
		this.joinDate = joinDate;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Position getPosition() {
		return position;
	}
	public LocalDate getJoinDate() {
		return joinDate;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee other = (Employee) obj;
//		return id == other.id && Objects.equals(name, other.name);
		
		// 쌤버전
		if (!(obj instanceof Employee))
			return false;
		Employee emp =(Employee) obj;
		return id == emp.getId() && name.equals(emp.getName());
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", position=" + position + ", joinDate=" + joinDate + "]";
	}
	
	// 오름or 내림차순 정렬 해주는 코드
	@Override
	public int compareTo(Object obj) {
		Employee emp =(Employee) obj;
		if (position.equals(emp.getPosition()))
			return joinDate.compareTo(emp.getJoinDate());
		return position.compareTo(emp.getPosition());
	}
	
	
}
