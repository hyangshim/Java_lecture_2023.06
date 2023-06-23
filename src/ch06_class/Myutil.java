package ch06_class;



public class Myutil {
	public Myutil() {}   //java가 알아서 만들어줌, 생략 가능
	
	// 최소값
	public int getMinimum(int[] array) {
		int min = Integer.MAX_VALUE; // 제일 큰숫자
		for (int element : array) {
			if (min >element)
				min =element;
		}
		return min;
	}
	// 최대값
	public int getMaximum(int[] array) {
		int max =Integer.MIN_VALUE;
		for (int element:array) {
			if (max < element)
				max =element;
		}
		return max;
			
	}
	
	// 객체 생성없이 쓸수 있음
	// staticd은 클래스명.메소드 이렇게 호출하기
	public static double getAverage(int[] array) {
		int sum =0;
		for (int element:array)
			sum += element;
		return (double)sum /array.length;
	}
	
	
}
