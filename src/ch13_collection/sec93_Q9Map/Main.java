package ch13_collection.sec93_Q9Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Map<String, Integer> map =new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name =null;
		int maxScore =0,totalScore =0;
		
		Set<String> keySet =map.keySet();
		for (String key :keySet) {
			totalScore += map.get(key);
			if (map.get(key)> maxScore) {
				maxScore = map.get(key);
				name=key;
				
			}
		}
		int avgScore =totalScore / map.size();
		System.out.println("평균점수: "+ avgScore);
		System.out.println("최고 점수 : "+ maxScore);
		System.out.println("최곶점수를 받은 아이디:"+name);
	}

}
