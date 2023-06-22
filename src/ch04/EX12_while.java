package ch04;

public class EX12_while {
	public static void main(String[] args) {
		
		int diceSum =0;
		while (diceSum <=21) {
			int dice = 1 + (int)(Math.random()*6);
			System.out.println(dice + " ");
			diceSum +=dice;
		}
		System.out.println();System.out.println(diceSum);
		
		// 의도적으로 무한루프를 만들고 탈출 조건을 루프안에서 만들어줌
		diceSum =0;
		while (true){
			int dice = 1 + (int)(Math.random()*6);
			System.out.println(dice+ " ");
			diceSum += dice;
			if(diceSum > 21)
				break;
		}
		System.out.println();System.out.println(diceSum);
		
		
		diceSum = 0;
		do {int dice = 1 + (int)(Math.random()*6);
		System.out.println(dice+ " ");
		diceSum += dice;
		}while (diceSum <=21);
		System.out.println();System.out.println(diceSum);
		
	}

}
