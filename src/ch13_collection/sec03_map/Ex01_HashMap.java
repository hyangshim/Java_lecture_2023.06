package ch13_collection.sec03_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Ex01_HashMap {
	public static void main(String[] args) {
		//Map<String,Integer> map =new TreeMap<>();  // TreeMap은 순서 보장됨
		Map<String,Integer> map =new HashMap<>();   //HashMap은 순서 보장 안됨
		
		map.put("사과",1000);map.put("배",2000);map.put("감",800);
		System.out.println(map.size());
		
		// key로 값 얻기
		int val =map.get("배"); // 객체 찾기
		System.out.println("배: "+val);
		System.out.println("==================");
		
		// Key의 Set collection - 이방법을 사용하길 권장함
		// 키랑 값 가져오기
		Set<String> keySet =map.keySet();
		for(String key :keySet)
			System.out.println(key+": "+map.get(key));
		System.out.println("==================");
		
		// Entry의 Set collection
		Set<Entry<String,Integer>> entrySet =map.entrySet();
		for (Entry<String,Integer> entry:entrySet)
			System.out.println(entry.getKey()+" : "+entry.getValue());
		System.out.println("==================");
		
		// Stream으로 처리
		map.forEach((k,v)->System.out.println(k+":"+v));
		
		// 검색
		System.out.println(map.containsKey("Aple"));
		System.out.println(map.containsValue(2000));
		
		//값 변경
		System.out.println("==================");
		map.put("사과", 1500);
		map.forEach((k,v)->System.out.println(k+":"+v));
		
		// entry 삭제
		map.remove("배");
	}
}
