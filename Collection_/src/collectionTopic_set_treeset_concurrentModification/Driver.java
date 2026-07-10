package collectionTopic_set_treeset_concurrentModification;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		
		
		List<String> l=new ArrayList<String>();
		l.add("Blr");
		l.add("Bbr");
		l.add("Ch");
		l.add("Mh");
		l.add("Dbg");
		
		Iterator<String>itr=l.iterator();
		
		while(itr.hasNext()) {
			String element=(String) itr.next();
			
			
			if(element.startsWith("B")) {
				itr.remove();
				System.out.println("remove from the Arraylist ");
				
			}
			System.out.println(l);
		}
		
		
//		for(String element : l) {
//			l.remove(0);
//			l.get(1);
//			//System.out.println(" "+l);
//		}
	}

}
