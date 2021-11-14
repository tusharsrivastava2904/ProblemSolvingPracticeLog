package ProblemSolving.CodeChef;

import java.util.*;
import java.lang.*;
import java.io.*;

//problem code: CIELRCPT
class CIELRCPT {
    public static void main (String[] args) throws java.lang.Exception {
        // your code goes here
        //input
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        int[] prices = new int[12];
        for(int i=0; i<12; i++){
            prices[i] = (int) Math.pow(2,i);
        }

        int[] target = new int[testCase];

        for(int i=0; i<testCase; i++){
            target[i]=sc.nextInt();
        }

        //driver code
        for(int i=0; i<target.length; i++){
            findMin(prices, target[i]);
        }
    }

    //logic
    public static void findMin(int[] prices, int target){
        int remP=target, count=0;
        for(int i=prices.length-1; i>=0; i--){
            while(remP>=0){
                if(remP>=prices[i]){
                    remP-=prices[i];
                    count++;
                } else {
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
