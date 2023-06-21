package ch04;

import java.time.LocalDate;
//만나이 계산
public class EX04_FullAge {
	public static void main(String[] args) {
		String[] birth =  "1996-01-01".split("-");
		int year = Integer.parseInt(birth[0]);
		int month =Integer.parseInt(birth[1]);
		int day = Integer.parseInt(birth[2]);
		System.out.printf("%d-%02d-%02d\n",year,month,day);




		// 오늘 날짜 구하는방법
		LocalDate today =LocalDate.now();
		System.out.printf("%d-%02d-%02d\n",today.getYear(),today.getMonthValue(),today.getDayOfMonth());
		
		int age = 0;
		if (today.getYear() > year)
			age = today.getYear() - year;
		else if (today.getMonthValue() < month)
			age = today.getYear() - year - 1;
		else {
			if (today.getDayOfMonth() >= day)
				age = today.getYear() - year;
			else
				age = today.getYear() - year - 1;
        }
		System.out.println("만나이는 "+age+" 입니다.");

	}

}
