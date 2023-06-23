package 연습문제;

public class _홀로 {
	public static void main(String[] args) {
		int a = 4;
		while (a> 0) {
			System.out.println(a);
			a--;
		}
		int b = 5;
		System.out.println("카운트 다운을 시작합니다..");
		while (b > 0) {
			System.out.println(b+"..");
			b--;
		}
		System.out.println("발사");
		System.out.println("==========for=============");
		for (int i = 1; i < 5; i++) {
			System.out.println(i);
		}
		
		int c = 7;
		System.out.println("출력을 시작합니다..");
		for (int i = 1; i <= c; i++) {
			System.out.print(i+" ");
		}
		System.out.println("\n끝");
		System.out.println("==========3 7=============");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("========== 로또 번호 알고리즘=============");
		for (int i = 1; i <= 45; i++) {
			
			
		}
		
		
		
	}
}
