package ch13_collection.sec01_list;

import java.util.ArrayList;
import java.util.List;

public class Ex01_ArrayList {
	public static void main(String[] args) {
		
		// list <타입 적기>
		List<String> list =new ArrayList<String>();
		list.add("Java");
		list.add("JSP");
		list.add("Servlet");
		
		// 리스트의 첫번째
		System.out.println(list.get(0));
		System.out.println(list.get(2));
		// list의 총개수 3이 출력됨
		System.out.println(list.size());
		
		System.out.println("-------------------------");
		for (String str : list) {
			System.out.println(str);
		}
		
		System.out.println("------------------------");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		
		System.out.println("------------------------");
		for (String ele :list) {
			System.out.print(ele + " ");
		}
		System.out.println();
		
		System.out.println("------------------------");
		list.forEach(x ->System.out.println(x));
		
		System.out.println("------------------------");
		list.remove(1);
		list.add("JDBC");
		list.add("Spring");
		
		list.forEach(x ->System.out.println(x));
		
		System.out.println("------------------------");
		// isEmpty=빈리스트 인지 확인
		System.out.println(list.isEmpty());
		//contains=Spring을 포함 하고 있는지 
		System.out.println(list.contains("Spring"));
		
		System.out.println("------------------------");
		// 모든 리스트 내용 지움
		list.clear();
		System.out.println(list.isEmpty());
	}
}

