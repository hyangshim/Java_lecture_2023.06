package ch04;



public class EX13_NestedFor {
	public static void main(String[] args) {
		// Diamond 1사분면 그리기
		
		for (int i = 0; i <5; i++) {
			for (int j = 0; j <i +1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//Diamond 2사분면 그리기
		System.out.println("------------2사분면------------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5-i-1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 4사 분면
		System.out.println("-----------4사분면-----------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 3사 분면
		System.out.println("-------------3사분면------------------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}for (int j = 0; j < 5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-------------다이아몬드------------------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5-i-1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			for (int j = 0; j <i +1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}for (int j = 0; j < 5-i; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < 5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 다이아 몬드 해보기
		for (int i = 0; i <5; i++) {
			for (int j = 0; j <5-i-1 ; j++) {
				System.out.print(" ");
			}for (int j = 0; j < i; j++) {
				System.out.print("8");
			}for (int j = 0; j < i+1; j++) {
				System.out.print("a");
			}
			System.out.println();
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("8");
			}for (int j = 0; j < 5-i; j++) {
				
			}
		}

		
		
	}

}
