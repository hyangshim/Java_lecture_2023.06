package ch11_api.sec04_string;



public class Q1_Number {
	public static void main(String[] args) {
		String numStr ="";
		for (int i = 1; i < 1001; i++) {
			numStr += i;
		}
		for (int i = 0; i <= 9; i++) {
			int count = Strings.count(numStr,""+i);
			System.out.println(i+ " : " + count);
		}
		
		System.out.println(Strings.isPalindrome("우영우"));
		int maxPal=0,x=0,y=0;
		for (int i = 100; i <=999; i++) {
			for (int j = i; j <=999; j++) {
				int mul =i * j;
				if(Strings.isPalindrome(String.valueOf(mul))) {
					if (mul > maxPal) {
						maxPal = mul;
						x =i;
						y=j;
					}
				}
			}
		}
		System.out.printf("%d x %d = %d\n",x,y,maxPal);
	}

}
