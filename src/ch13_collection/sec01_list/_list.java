package ch13_collection.sec01_list;

import java.util.ArrayList;
import java.util.List;

public class _list {
	public static void main(String[] args) {
		
		
		
		
		int num1 = 24;
        int num2 = 60;

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= ((num1 > num2) ? num2 : num1); i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                list.add(i);
            }
        }

        // Print the common factors
        for (int factor : list) {
            System.out.println(factor);
        }
	}

}
