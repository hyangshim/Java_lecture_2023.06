package 연습문제;

public class _1등은누구 {
	public static int topIndex(int[] scores) {
		int topIndex =0;
//		{t65i,74,23,75,68,96,88,98,54};
		for (int i = 0; i < scores.length; i++) {
			if(scores[topIndex] < scores[i])    // 더 큰놈이 나타났다면,
				topIndex =i;  // 새롭게 가장 큰 놈의 위치를 설정 한다.
		}
		return topIndex;
	}
	public static void main(String[] args) {
		String[] names = {"Elena","Suzie","John","Emily","Neda","Kate","Alex,","Danile","Hanmilton"};
		
		int[] scores= {65,74,23,75,68,96,88,98,54};
		
		int i =topIndex(scores);
		System.out.printf("1등: %s(%d)\n",names[i],scores[i]);
	}

}
