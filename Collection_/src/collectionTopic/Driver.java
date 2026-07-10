package collectionTopic;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		ArrayList<String> studentList = new ArrayList<>();

		studentList.add("Sumit");
		studentList.add("rahul");
		studentList.add("abhishek");
		studentList.add("piyush");
		studentList.add("Bhulu");
		studentList.add("Sumit");
		studentList.add("sumit");
		studentList.add("sumit");
		studentList.add("Bhulu");
		
		// studentList.clear();
		// studentList.remove(2);
		// System.out.println(studentList);
		for (int i = 0; i < studentList.size(); i++) 
		{
			String currentElement = studentList.get(i);
			
			if (currentElement.toUpperCase().startsWith("S")) 
			{
				System.out.println(currentElement);

			}
		}
		
		
		for (int i = 0; i < studentList.size(); i++)
		{
		    String currentElement = studentList.get(i);

		    if (currentElement.toUpperCase().startsWith("S"))
		    {
		        studentList.set(i, currentElement.toUpperCase());
		    }
		}

		System.out.println(studentList);

	}

}
