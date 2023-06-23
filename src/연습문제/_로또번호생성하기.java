package 연습문제;

import java.util.Arrays;

public class _로또번호생성하기 {
	public static void main(String[] args) {
		// input
	    int[] numbers = generateRangeNumbers(1, 5);
	    int[] excepted = inputExceptedNumbers(args);
	    // generate
	    int[] picks = generateLottoPicks(numbers, excepted, 3);
	    System.out.println(Arrays.toString(picks));
	  }
	  private static int[] generateRangeNumbers(int start, int end) {
	    int size = end - start;
	    int[] numbers = new int[size];
	    for (int i = 0, n = start; i < size; i++) {
	      numbers[i] = n++;
	    }
	    return numbers;
	  }
	  private static int[] inputExceptedNumbers(String[] args) {
	    int size = args.length;
	    int[] exceptedNumbers = new int[size];
	    for (int i = 0; i < size; i++) {
	      exceptedNumbers[i] = Integer.parseInt(args[i]);
	    }
	    return exceptedNumbers;
	  }
	  private static int[] generateLottoPicks(int[] numbers, int[] excepted, int size) {
	    /* 해당 메소드를 완성하시오. */
	    return null;
	}

}
