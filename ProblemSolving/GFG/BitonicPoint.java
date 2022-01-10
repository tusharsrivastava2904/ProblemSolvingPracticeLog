package ProblemSolving.GFG;

import java.util.Scanner;

//problem url: https://practice.geeksforgeeks.org/problems/maximum-value-in-a-bitonic-array3001/1/?category[]=Arrays&category[]=Arrays&problemStatus=unsolved&difficulty[]=0&page=1&query=category[]ArraysproblemStatusunsolveddifficulty[]0page1category[]Arrays#
//stmt: find the max array element in O(logn)
//the array can be increasing or decreasing, if the array starts increasing at a point, the last element of the array will be the desired result
public class BitonicPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j=0; j<n; j++){
                arr[j] = sc.nextInt();
            }

            System.out.println(findBitonicPoint(arr, n));

        }
    }

    private static int findBitonicPoint(int[] arr, int n) {
        int max = arr[0];
        boolean isMax = false;
        for(int i=0; i<n-1; i++){
            if(arr[i+1]<arr[i]){
                max = arr[i];
                isMax = true;
                break;
            }
        }

        if(isMax==false) {
            return arr[n-1];
        } else
            return max;
    }
}
