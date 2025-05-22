/*Q9. Write a Java Program for Creating a random string of a specified length using user defined
function generateRandomString()*/

package string;


import java.util.*;
public class generateRandomString {

		public static String generateRandomString(int length) {
	        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	        StringBuilder randomString = new StringBuilder();
	        Random random = new Random();    
	        for (int i = 0; i < length; i++) {
	            int index = random.nextInt(characters.length());
	            randomString.append(characters.charAt(index));
	        }
	        
	        return randomString.toString();
	    }

	    public static void main(String[] args) {
	        int length = 10; 
	        
	        System.out.println("Random String: " + generateRandomString(length));
	    }
	}
