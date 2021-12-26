package Greedy.Basic;

import java.util.Arrays;
import java.util.Scanner;

//minimise the sum of products of two array elements
//re-shuffling allowed
//url: https://practice.geeksforgeeks.org/problems/minimize-the-sum-of-product1525/1/

public class MinSumProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        int brr[] = new int[n];
        for (int i=0; i<n; i++){
            brr[i]=sc.nextInt();
        }
        sc.close();
        MinimiseSumProduct(arr, brr, n);
    }

    private static void MinimiseSumProduct(int[] arr, int[] brr, int n) {
        Arrays.sort(arr);
        //sorting brr in descending order
        for (int i=0; i<n; i++){
            brr[i]*=-1;
        }
        Arrays.sort(brr);
        for (int i=0; i<n; i++){
            brr[i]*=-1;
        }

        int sum=0;
        for (int i=0; i<n; i++){
            sum+=arr[i]*brr[i];
        }

        System.out.println(sum);
    }
}
