/*Q8. Write a Java Program for Verifying if a string contains
only numeric characters using user defined
function isNumeric()*/

package string;

public class string_isNumeric {
	
		 public static boolean isNumeric(String str) {
		        return str.matches("\\d+"); 
		        }

		    public static void main(String[] args) {
		        String input1 = "123456";
		        String input2 = "12a34";
		        
		        System.out.println("Input: " + input1 + " -> Is Numeric? " + isNumeric(input1));
		        System.out.println("Input: " + input2 + " -> Is Numeric? " + isNumeric(input2));
		    }
	}

