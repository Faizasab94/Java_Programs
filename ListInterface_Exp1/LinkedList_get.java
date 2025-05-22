/*4. Write a Java program to display elements and their positions in a linked list ( using
l_listobj.get(p) )*/

package list;

import java.util.LinkedList;
public class LinkedList_get {

		public static void main(String args[])
		 {
				LinkedList<String> List=new LinkedList<>();
				List.add("Red");
				 List.add("Green");
				 List.add("Yellow");

				 
				for(int i=0;i<List.size();i++)
				{
		System.out.println("Position "+(i+1)+": "+List.get(i));
				}
	}
	}
