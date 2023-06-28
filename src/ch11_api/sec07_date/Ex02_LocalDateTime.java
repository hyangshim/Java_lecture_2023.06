package ch11_api.sec07_date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex02_LocalDateTime {
	public static void main(String[] args) {
		// 날짜 출력
		LocalDate today =LocalDate.now();
		System.out.println(today);
		
		
		// 날짜+시간뒤에 나노초까지 출력됨
		LocalDateTime now =LocalDateTime.now();
		// 원하는 시간만큼 잘라서 출력하기
		System.out.println(now.toString().substring(0,19).replace("T"," "));
		
		// 시간출력
		LocalTime currTime =LocalTime.now();
		System.out.println(currTime.toString().substring(0,8));
	}

}
