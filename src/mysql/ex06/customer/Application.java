package mysql.ex06.customer;

import java.util.Scanner;

public class Application {
	private static Scanner scan =new Scanner(System.in);
	public static void main(String[] args) {
		Boolean run =true;
		while (run) {
			CustomerService cs =new CustomerService();
			System.out.println("+---------+-----------+---------+--------+-------+");
			System.out.println("|1.고객목록 | 2. 고객등록 | 3.정보수정|4.고객탈퇴| 5.종료 |");
			System.out.println("+---------+-----------+---------+--------+-----+");
			System.out.println("선택 > ");
			
			int selectNo =Integer.parseInt(scan.nextLine());
			switch (selectNo) {
			case 1:
				cs.listCustomer();break;
			case 2:
				cs.registerCustomer();break;
			case 3:
				cs.updateCustomer();break;
			case 4:
				cs.deleteCustomer();break;
			case 5:
				run =false;break;
			default:
				System.out.println("Warning :1에서 5까지의 숫자만 입력하세요");
			}
			
		}
	}

}
