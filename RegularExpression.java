

import java.util.regex.Pattern;

public class RegularExpression {
	public static void main(String args[]){       
		  
		System.out.println(" 1. ");     
		System.out.println(  
		     Pattern.matches("srinath", "Goud")); // This statement returns False because the string starts with the Upper-case letter which does not match with the regex.  
		  
		System.out.println(" 2. ");       
		System.out.println(  
		     Pattern.matches("sai", "kumar")); // This statement returns False because the string starts with 'T', which does not match with any character R, P, or Q of Regex.  
		  
		System.out.println(" 3. "); 
		System.out.println(  
			     Pattern.matches("prakash|kumar", "kumar")); // This statement returns True because the string starts with 'T' which matches with a character T from Regex.  
			  
			System.out.println(" 4. ");         
			System.out.println(  
			     Pattern.matches("Cat|Rat", "Rat")); // This statement returns True because the string matches with the Second part from the Regular Expression.  
			  
			System.out.println(" 5. ");   
			System.out.println(  
			     Pattern.matches("[CM]at|[Bb]ad", "Bad")); // This statement returns True because the string matches with the Second part from the Regular Expression.  
			      
			System.out.println(" 6. ");      
			System.out.println(  
			     Pattern.matches(".*srikanth.*", "ram")); // This statement returns True because the string contains the bit which match to the Regular Expression.  
			  
			System.out.println(" 7. ");       
			System.out.println(  
			     Pattern.matches("^[\\d].*", "abc")); // This statement returns True because the string starts with the letter not a digit, which does not match with the regular expression.    
			  
			System.out.println(" 8. ");   
			System.out.println(  
			     Pattern.matches("^[^\\d].*", "abc123")); // This statement returns True because the string starts with the letter, which matches with the regular expression due to the negation of digit.  
			  
			System.out.println(" 9. ");       
			   System.out.println(  
			     Pattern.matches("[a-zA-Z][a-zA-Z][0-9A-Z]", "aPz")); // This statement returns False because the last character 'z' in string does not match with the  with the '0-9A-Z' in regular expression.    
			  
			System.out.println(" 10. ");   
			   System.out.println(  
			     Pattern.matches("[a-zA-Z][a-zA-Z][a-zA-Z]", "aAA")); // This statement returns True because the all the characters in string matches with the  with the regular expression.  
			  
			System.out.println(" 11. ");   
			System.out.println(  
			     Pattern.matches("java[is]awe[some]$", "javaisawesome")); // This statement returns True because the string ends with the 't' character which matches with the regular expression.  
			  
			System.out.println(" 12. ");        
			System.out.println(  
			     Pattern.matches("\\D*", "abcde")); // This statement returns True because the string does not contain any digit, so it follows the regular expression.  
			  
			System.out.println(" 13. ");   
			System.out.println(  
			     Pattern.matches("\\D*", "abcde123")); // This statement returns False because the string contains the digits, so it does not follow the regular expression.  
			}  


}
