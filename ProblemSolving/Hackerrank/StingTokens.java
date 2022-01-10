package ProblemSolving.Hackerrank;/*
 * Tushar Srivastava
 * #100DaysOfCode
 * tusharsrivastava2904@gmail.com 
*/

// split user input string into tokens for delimiters [!,?._'@\\s]+  -> ! , ? . _ ' @ space
import java.util.*;

public class StingTokens {

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine().trim();
	        
	        if (s.length() > 0) {
		        String[] tokens = s.split("[!,?._'@\\s]+");
		        System.out.println(tokens.length);
		        for(String token : tokens) {
		            System.out.println(token);
	        }
	        } else {
	        	System.out.println("0");
	        }
	        
	        scan.close();
	    }
}
