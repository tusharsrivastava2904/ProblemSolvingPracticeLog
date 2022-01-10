package ProblemSolving.GFG;

import java.util.Arrays;
import java.util.Scanner;

//url: https://practice.geeksforgeeks.org/problems/three-way-partitioning/
//partition an array into 3 parts around the given 2 values
public class ThreeWayPartitioning {
    static Scanner sc = new Scanner(System.in);
    int a=0, b=0;
    public static void main(String[] args) {
        int n = sc.nextInt(); //size of arr
        int[] arr = new int[n];
        inputArr(arr, n);
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the two partitioning values");
        int a= sc.nextInt();
        int b= sc.nextInt();
        threeWayPartition(arr, a, b, n);
        sc.close();
        System.out.println(Arrays.toString(arr));
    }

    private static void threeWayPartition(int[] arr, int a, int b, int n) {
        int low = 0, mid = 0, high = n-1;
        while(mid<=high){
            if (arr[mid]<a){
                swap(arr, mid, low);
                mid++;
                low++;
            } else if (arr[mid]>b){
                swap(arr, mid, high);
                high--;
            } else {
                mid++;
            }
        }
    }

    private static void swap(int[] arr, int c, int d) {
        int temp = arr[c];
        arr[c] = arr[d];
        arr[d] = temp;
    }

    private static void inputArr(int[] arr, int n) {
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
    }
}
