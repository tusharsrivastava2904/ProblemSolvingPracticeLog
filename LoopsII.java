/*
 * Tushar Srivastava
 * #100DaysOfCode
 * tusharsrivastava2904@gmail.com 
*/

//LoopsII Hackerrannk: Java    a +2^0*b, a +2^0*b +2^1*b, ... , (a +2^0*b +2^1*b +...+2^n-1*b)

import java.util.ArrayList;
import java.util.Scanner;

public class LoopsII {
	public static void main(String[] args){
    	Scanner in = new Scanner(System.in);
    	    	
        int t=in.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>(); //give all inputs separated by a space, in a single line such as: 2 0 2 10 5 3 5
        for(int i=0;i<t;i++){							//repeating the process for no. of queries
            int a = in.nextInt();						//taking values of a, b and n
            int b = in.nextInt();
            int n = in.nextInt();
            
            int s = 0;									//initializing the sum variable by 0 
            s+=a;										//adding a once for each term
            for (int j=0; j<n; j++){					//gives sn
               s+= (Math.pow(2,j)*b);					//gives sn = (a) + (2^n)*b here we add this new value to the old value of sum so that we don't require to recalculate it
               arr.add(s);								//saving sn to access all in the end
            }
            
            for (int k = 0; k < arr.size(); k++) {		//accessing all the sn stored
                System.out.print(arr.get(k)+" ");
            }
            System.out.println();
            arr.clear();
        }
        in.close();
    }
}
