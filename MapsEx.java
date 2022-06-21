package Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapsEx {
	public static void main(String args[]) {
		Map map = new HashMap();
		map.put(1, "Navya");
		map.put(8, "kalyan");
		map.put(4, "venu");
		map.put(5, "ganesh");
		map.put(8, "hello");
		Set set = map.entrySet();
		  Iterator itr=set.iterator();  
		    while(itr.hasNext()){  
		        Map.Entry entry=(Map.Entry)itr.next();  
		        System.out.println(entry.getKey()+" "+entry.getValue());  
		    }  
		
	}

}
