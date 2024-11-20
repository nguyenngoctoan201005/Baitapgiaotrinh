package bai4;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
	HashMap<String, String> map = new HashMap<>();
	
	public void themPT() {
		map.put("apple","qua tao");
		map.put("ball","qua bong");
		map.put("cat","con meo");
		map.put("dog","con cho");
		map.put("elephant","con voi");
		map.put("fish","con ca");
		map.put("gift","mon qua");
		map.put("home","nha");
	}
	
	public String lookUp(String word) {
		
		word = word.trim();
		for(String x : map.keySet()) {
			if(word.equals(x))
				return "Nghia cua tu la : " + map.get(x);
		}
			return null ; 
	}
}	
