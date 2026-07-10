package collectionTopic_set_treeset_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Driver {

	public static void main(String[] args) {
		Map<String,String> map=new ConcurrentHashMap<String, String>();
		
		
		map.put("Sumit", "Sumitkumarjha770@gmail");
		map.put("Rahul", "Rahul770@gmail");
		map.put("Abhi", "Abhi770@gmail");
		map.put("Raj", "Raj770@gmail");
		
		
		System.out.println(map);
		
		Set<Entry<String,String>> elem=map.entrySet();
		Iterator<Entry<String,String>>itr=elem.iterator();
		while(itr.hasNext()) {
			Entry s=itr.next();
			System.out.println(s.getKey());
			//System.out.println(s.getValue());
			
			System.out.println(map.remove("Sumit"));
			
		}

	}

}
