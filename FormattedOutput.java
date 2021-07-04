/*
 * Tushar Srivastava
 * #100DaysOfCode
 * tusharsrivastava2904@gmail.com 
*/


/*input format
java 100
cpp 65
python 50
*/
//
/*Formatted Output
================================
java           100 
cpp            065 
python         050 
================================
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FormattedOutput {
	public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int N = Integer.parseInt(br.readLine().trim());
			br.close();
			
			for (int i=1; i<=10; i++) {
				System.out.printf("%4d"+" x "+"%02d"+" = "+"%04d%n",N,i,N*i);
			}
	}
}
