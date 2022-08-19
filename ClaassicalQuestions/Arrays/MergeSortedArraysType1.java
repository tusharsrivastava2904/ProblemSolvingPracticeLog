package ClaassicalQuestions.Arrays;

import java.util.Scanner;

public class MergeSortedArraysType1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] a1 = new int[m];
        int[] a2 = new int[n];
        for (int i=0; i<m; i++){
            a1[i] = sc.nextInt();
        }
        for (int i=0; i<n; i++){
            a2[i] = sc.nextInt();
        }
        sc.close();

        printArray(mergeSorted(m, n, a1, a2));
    }

    // Time Complexity: O(n)
    // Space Complexity: O(m+n)
    private static int[] mergeSorted(int m, int n, int[] a1, int[] a2) {
        int[] res = new int[m+n];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i<m && j<n){
            if(a1[i]<a2[j]){
                res[k] = a1[i];
                i++;
                k++;
            } else {
                res[k] = a2[j];
                j++;
                k++;
            }
        }

        while(i<m){
            res[k] = a1[i];
            i++;
            k++;
        }

        while(j<n){
            res[k] = a2[j];
            j++;
            k++;
        }

        return res;
    }

    private static void printArray(int[] b){
        for (int i: b){
            System.out.print(i+" ");
        }
    }
}
