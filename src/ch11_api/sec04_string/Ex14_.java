package ch11_api.sec04_string;


public class Ex14_ {
	public static void main(String[] args) {
		// 1에서 1000까지 숫자를 썻을 때 , 0에서 9까지 숫자는 각각 몇번씩 사용되는가?
		String numbers ="";
		for (int i = 1; i < 1001; i++) {
			numbers += i;
		}
		int[] count = new int[10];
		for (int j = 0; j < numbers.length(); j++) {
			//숫자 추출: numbers.charAt(j)를 사용하여 현재 인덱스 j에 해당하는 문자를 가져옵
			//숫자 변환: Character.getNumericValue()를 사용하여 숫자 문자를 실제 숫자로 변환합니다. 이렇게 변환
		    int digit = Character.getNumericValue(numbers.charAt(j));
		    count[digit]++;
		}
		for (int k = 0; k < 10; k++) {
		    System.out.println(k + "의 등장 횟수: " + count[k]);
		}
		
		
		
		
		
		
		
		
	}

}
