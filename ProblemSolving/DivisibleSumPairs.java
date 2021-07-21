/*
 * Tushar Srivastava
 * #100DaysOfCode
 * tusharsrivastava2904@gmail.com 
*/

//given an array of int, find number of (i,j) pairs :
//	i<j
//	array[i] + array[j] %k == 0, for a given integer k


package ProblemSolving;

import java.util.Scanner;

public class DivisibleSumPairs {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n,k;
        
        n = scanner.nextInt();
        k = scanner.nextInt();
        
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++) {
        	arr[i] = scanner.nextInt();
        }
 
        Result result = new Result();
        int res = result.divisibleSumPairs(n, k, arr);
        System.out.println(res);
        scanner.close();
    }
	
}


class Result {

public int divisibleSumPairs(int n, int k, int[] arr) {
        int count=0, sum=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1; j<n; j++){
                sum=0;
                if(i<j) {
                   sum = arr[i] + arr[j] ; 
                   if(sum%k==0){
                	//for debug
                	//System.out.println(i+" "+j+"\n");
                    count++;
                   }
                }
            }
        }

        return count;
    }

}