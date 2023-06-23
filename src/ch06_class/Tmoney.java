package ch06_class;

public class Tmoney {
	private int age;
	private int cash;
	public static final int ChILD_FARE =730;
	public static final int YOUTH_FARE =1010;
	public static final int ADULT_RARE =1450;
	
	public Tmoney(int age, int cash) {
		this.age = age;
		this.cash = cash;
	}
	
	public Tmoney(int age) {
		this.age = age;
	}


	public void charge(int cash) {
		this.cash += cash;
	}

	
	public int getCash() {
		return this.cash;
	}
	public boolean ride() {
		if (age >=7 && age <=12) {
			if (this.cash >=this.ChILD_FARE) {
				this.cash -=this.ChILD_FARE; return true;
			} 
			return false;
		}else if (age >=13 && age<=18) {
			if (this.cash >=this.YOUTH_FARE) {
				this.cash -=this.YOUTH_FARE; return true;
			} 
			return false;
		}else if (age >=19) {
			if (this.cash >=this.ADULT_RARE) {
				this.cash -=this.ADULT_RARE; return true;
			} 
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Tmoney [age=" + age + ", cash=" + cash + "]";
	}
	
	
}
