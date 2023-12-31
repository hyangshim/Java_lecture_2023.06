package mysql.ex07_bbs.entity;

import java.time.LocalDate;

public class User {
	private String uid;
	private String password;
	private String uname;
	private String email;
	private LocalDate regDate;
	private int isDeleted;
	
	public User() {}
	public User(String uid, String password, String uname, String email, LocalDate regDate, int isDeleted) {
		this.uid = uid;
		this.password = password;
		this.uname = uname;
		this.email = email;
		this.regDate = regDate;
		this.isDeleted = isDeleted;
	}
	public User(String uid, String password, String uname, String email) {
		super();
		this.uid = uid;
		this.password = password;
		this.uname = uname;
		this.email = email;
	}
	
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getRegDate() {
		return regDate;
	}
	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}
	public int getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}
	@Override
	public String toString() {
		return "Users [uid=" + uid + ", password=" + password + ", uname=" + uname + ", email=" + email + ", regDate="
				+ regDate + ", isDeleted=" + isDeleted + "]";
	}
	
	

}
