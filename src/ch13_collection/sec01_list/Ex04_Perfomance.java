package ch13_collection.sec01_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex04_Perfomance {
	public static void main(String[] args) {
		List<String> list1 =new ArrayList<String>();
		List<String> list2 =new LinkedList<String>();


		long startTime;
		long endTime;

		//// ArrayList 앞에 10000회 추가하는 경우 - 13.7 ms
		startTime =System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add(0,String.valueOf(i));
		}
		endTime =System.nanoTime();
		System.out.println("ArrayList 걸린시간: " + (endTime -startTime)+" ns");


		// LinkedList 앞에 10000회 추가하는 경우 - 2.8 ms
		startTime =System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(0,String.valueOf(i));
		}
		endTime =System.nanoTime();
		System.out.println("endTime 걸린시간: " + (endTime -startTime)+" ns");


		System.out.println("------------------------뒤-------------------------");
		/// ArrayList 뒤에 10000회 추가하는 경우 - 
		startTime =System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add(String.valueOf(i));
		}
		endTime =System.nanoTime();
		System.out.println("ArrayList 걸린시간: " + (endTime -startTime)+" ns");
		
		// LinkedList 뒤에 10000회 추가하는 경우 - 2.8 
		startTime =System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(String.valueOf(i));
		}
		endTime =System.nanoTime();
		System.out.println("endTime 걸린시간: " + (endTime -startTime)+" ns");

	}
}
