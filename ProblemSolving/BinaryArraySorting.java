package ProblemSolving;

import java.util.Arrays;
import java.util.Scanner;

//url: https://practice.geeksforgeeks.org/problems/binary-array-sorting-1587115620/1
// Sort the array in O(n)
public class BinaryArraySorting {
    //applying Dutch National Flag Algorithm for 2 elements
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt(); //size of arr
        int[] arr = new int[n];
        inputArr(arr, n);
        System.out.println(Arrays.toString(arr));
        binaryArrSort(arr, n);
        sc.close();
        System.out.println(Arrays.toString(arr));
    }

    private static void binaryArrSort(int[] arr, int n) {
        int low = 0; //denotes region of 0s
        int high = n-1; //denotes region of 1s

        //out objective is to minimise the region ogf UNKNOWN i.e. region between low and high
        //we swap the high with low if we find a 0
        while(low<=high){
            if (arr[low]==0){
                low++;
            } else {
                swap(arr, low, high);
                high--;
            }
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    private static void inputArr(int[] arr, int n) {
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
    }
}
