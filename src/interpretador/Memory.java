package interpretador;

import java.util.HashMap;
import java.util.Map;

public class Memory {
	private Map<String, Integer> memoria = new HashMap<String, Integer>();
	
	public void update(String s, int i){
		memoria.put(s,i);
	}
	public int lookup(String s){
		return memoria.get(s);
	}
}
