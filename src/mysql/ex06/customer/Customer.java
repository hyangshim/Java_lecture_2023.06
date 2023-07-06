package mysql.ex06.customer;

import java.time.LocalDate;

/*
 * customer table
 * CREATE TABLE if NOT EXISTS customer (
	uid VARCHAR (12) PRIMARY KEY,
	uname VARCHAR(12) NOT NULL ,
	regDate DATE DEFAULT (CURRENT_DATE),
	isDeleted INT DEFAULT 0
	);
 */


public class Customer {
	private String uid;
	private String uname;
	private LocalDate regDate;
	private int inDeleted;                 //가입 - 0,탈퇴 -1
	
	public Customer() {}
	public Customer(String uid, String uname, LocalDate regDate, int inDeleted) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.regDate = regDate;
		this.inDeleted = inDeleted;
	}
	
	public Customer(String uid, String uname) {
		super();
		this.uid = uid;
		this.uname = uname;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public LocalDate getRegDate() {
		return regDate;
	}
	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}
	public int getInDeleted() {
		return inDeleted;
	}
	public void setInDeleted(int inDeleted) {
		this.inDeleted = inDeleted;
	}
	
	@Override
	public String toString() {
		return "Customer [uid=" + uid + ", uname=" + uname + ", inDeleted=" + inDeleted + "]";
	}
	
	

}
