package Maps;

import java.util.HashMap;
import java.util.Map;

public class MapEx1 {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer, String>();
		map.put(500, "Navya");
		map.put(501, "Venu");
		map.put(502, "kalyan");
		map.put(505, "ganesh");
		map.put(508, "sai");
		System.out.println(map);
	}

}
