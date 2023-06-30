package ch14_io;

import java.io.Serializable;
/*
 * Serializable을 구현해야 직렬화가 가능하고, 파일에 읽고 쓰고 할 수 있다.
 */
public class product implements Serializable {
	// Add qenerated serial version 클릭하면됨 아래 고유 UID만들어줌
	private static final long serialVersionUID = -5816616466226083239L;
	private String name;
	private int price;

	public product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}


	@Override
	public String toString() {
		return "product [name=" + name + ", price=" + price + "]";
	}




}

