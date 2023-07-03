package challenge;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class MyComparator  implements Comparator<Map.Entry<String, Integer>>{

	@Override
	public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
		// 숫자가 같으면 알파벳 순으로
		if (o1.getValue()==o2.getValue())
			return o1.getKey().compareTo(o2.getKey()); 
		// 내림차순해주세요
		return o2.getValue()-o1.getValue();
	}

}
