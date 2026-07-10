package collectionTopic_set_map;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Driver {

	public static void main(String[] args) {
		Map<String, String> cityAndState=new HashMap<String, String>();
		
		cityAndState.put("Bangalore", "Karnataka");
		
		cityAndState.put("Darbhanga ", "Bihar");
		
		cityAndState.put("Rajashtan", "Jaipur");
		
		System.out.println(("Bangalore".hashCode()));
		
		
		Set<Entry<String,String>> entrySet=cityAndState.entrySet();
		
		
		Iterator<Entry<String,String>> itr=entrySet.iterator();
		
		
		while(itr.hasNext()) {
			Entry element=itr.next();
			
			System.out.println(element.getKey()+" and "+ element.getValue());
		}
		

	}

}
