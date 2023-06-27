package ch11_api.sec01_object;

import java.util.HashMap;
import java.util.Map;

public class Ex02_HashCode {
	public static void main(String[] args) {
		Key key1 = new Key(3);
		Key key2 = new Key(3);
		System.out.println(key1.equals(key2));
		System.out.println(key1.hashCode()+","+key2.hashCode());
		
		
		// hashCode() 메소드를 재정의 하기 이전
		Map<Key, String> hashMap =new HashMap<Key, String>();
		hashMap.put(key1, "james");
		hashMap.put(key2, "Maria");
		System.out.println(hashMap.get(key1));
		System.out.println(hashMap.get(key2));
		System.out.println("========================================");
		
		// hashCode()를 재정의한 후
		Map<Key2, String> hashMap2 =new HashMap<Key2, String>();
		Key2 key21 =new Key2(3);
		Key2 key22 =new Key2(4);
		System.out.println(key21.hashCode() + ", " + key22.hashCode());   
		
		System.out.println("========================================");
		hashMap2.put(key21, "james");
		hashMap2.put(key22, "Maria");
		System.out.println(hashMap2.get(key21));
		System.out.println(hashMap2.get(key22));
		
	}

}
