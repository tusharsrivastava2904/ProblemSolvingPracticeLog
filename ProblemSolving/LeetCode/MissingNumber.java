package ProblemSolving.LeetCode;

import java.util.Arrays;
import java.util.Scanner;

// find missing number in the range [0, arr.length] for a given array having all distinct values in the range except a single missing number

//challenge: time: O(n) space: O(1)

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(findMissingNumber(arr));
    }

    private static int findMissingNumber(int[] arr) {
        Arrays.sort(arr);
        for (int i=0; i<arr.length; i++) {
            if(arr[i]!=i) return i;
        }

        return arr.length;
    }
}
