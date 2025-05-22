/*4. Write a java program for getting different colors through ArrayList interface and extract the
elements 1st and 2nd from the ArrayList object by using SubList()*/

package arraylist;

import java.util.*;
import java.util.Collections;

public class ArrayList_SubList {

		public static void main(String args[])
		 {
			 ArrayList<String> List=new ArrayList<>();
			 List.add("Red");
			 List.add("Green");
			 List.add("Yellow");
			 List.add("Blue");
			  List<String> subList = List.subList(0,2);
			  System.out.println("Extracted element:"+subList);
			 
		 }
	}

