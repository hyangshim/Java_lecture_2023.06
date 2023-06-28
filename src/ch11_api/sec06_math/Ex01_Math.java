package ch11_api.sec06_math;

public class Ex01_Math {
	public static void main(String[] args) {
		int v1 =Math.abs(-5);              // 절대값
		double v2 = Math.abs(-3.14); 
		System.out.printf("%d,%.2f\n",v1,v2);
		
		double v3 =Math.ceil(5.3);
		double v4 =Math.ceil(-5.3);
		System.out.printf("%.1f,%.1f\n",v3,v4);
		
		
		
		double v5 =Math.floor(5.3);
		double v6 =Math.floor(-5.3);
		System.out.printf("%.1f,%.1f\n",v3,v4);
		System.out.println("==============");
		System.out.println(Math.random());
		// 정수 1~ 6까지의 난수
		System.out.println((int)(Math.random()*6)+1);
		System.out.println("-------------------");
		System.out.println(Math.round(Math.PI));
		System.out.printf("%.10f",Math.PI);
		
		
	}
}
