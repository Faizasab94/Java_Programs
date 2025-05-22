/*. Write a Java program to iterate a linked list in reverse order (using
objlist.descendingIterator())*/
package list;


import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_descendingIterator {

		public static void main(String args[])
		 {
			LinkedList<String> List=new LinkedList<>();
			List.add("Red");
			 List.add("Green");
			 List.add("Yellow");
			 List.add("Blue");
			
			
			Iterator<String> it = List.descendingIterator();
			while(it.hasNext())
				System.out.println(it.next());
		 }
	}
