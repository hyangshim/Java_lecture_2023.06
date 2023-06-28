package ch11_api.sec07_date;

import java.time.DayOfWeek;
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
		
		System.out.println("------------------");
		int year =today.getYear();
		int month =today.getMonthValue();
		int day =today.getDayOfMonth();
		System.out.printf("%d-%02d-%02d\n",year,month,day);
		System.out.println("------------------");
		
		DayOfWeek   date = today.getDayOfWeek();
		System.out.println(date);                     //WEDNESDAY
		System.out.println(date.getValue());
		String[] dates ="일,월,화,수,목,금,토".split(",");
		System.out.println(dates[date.getValue()]+"요일");
		
		System.out.println("------------------");
		int hour =now.getHour();
		int minute =now.getMinute();
		int second=now.getSecond();
		System.out.printf("%d-%02d-%02d\n",hour,minute,second);
	}

}
