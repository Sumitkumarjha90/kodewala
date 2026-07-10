package collection_linkedlist;
import java.util.*;
public class Driver {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		
		list.add("Bangalore");
		list.add("Bhubaneswer");
		list.add("Delhi");
		list.add("Bihar");
		
		System.out.println(list);
		
		list.add(2,"Mumbai");
		list.remove("Bihar");
		System.out.println(list);

	}

}
