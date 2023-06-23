package ch06_class;

public class EX01_Interaction {
	public static void main(String[] args) {
		int[] scores = {67,89,87,92,72};
		// 클래스 호출,객체 생성
		Myutil myutil =new Myutil(); //객체 생성
		int min =myutil.getMinimum(scores); // 인스턴스 메소드 호출
		int max =myutil.getMaximum(scores); // 인스턴스 메소드 호출
		// staticddms 객체 호출 없이 사용
		double average =Myutil.getAverage(scores);  //정적 메소드 호출
		System.out.printf("%d,%d,%.1f\n",min,max,average);
		
	}

}
