/*Write a Java program to insert the specified element at the end of a linked list.( using
l_listobj.offerLast("Pink"))*/

package list;

import java.util.Iterator;
import java.util.LinkedList;


public class LinkedList_offerLast {

		public static void main(String args[])
		 {
				LinkedList<String> List=new LinkedList<>();
				List.add("Red");
				 List.add("Green");
				 List.add("Yellow");
				
				
				List.offerLast("Pink");
					System.out.println(List);
			 }
	}
