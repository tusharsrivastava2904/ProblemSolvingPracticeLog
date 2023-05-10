package ProblemSolving.GFG;

import java.util.Scanner;

//https://practice.geeksforgeeks.org/problems/cbd515a00f6537180d2e66f1ffe11093a128e560/1
public class TotalCuts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        System.out.println(twoCuts(n, k, a));
    }

    private static int twoCuts(int n, int k, int[] a) {
        int count=0;

        //arrays where each index contain the min, max element in the left and right subarray being formed
        int[] maxarr = new int[n];
        int[] minarr = new int[n];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            max=Math.max(max, a[i]);
            maxarr[i]=max;
        }

        for(int i=n-1; i>=0; i--){
            min=Math.min(min, a[i]);
            minarr[i]=min;
        }

        //updating count if sum of maxElement in left side and minElement in right side >= k
        for(int i=0; i<n-1; i++){
            if(maxarr[i]+minarr[i+1]>=k) count++;
        }
        return count;
    }
}
