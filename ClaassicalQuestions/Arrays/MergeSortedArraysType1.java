package ClaassicalQuestions.Arrays;

import java.util.Scanner;

import static ClaassicalQuestions.Arrays.CommonUtilities.ArrayInput.takeInput;
import static ClaassicalQuestions.Arrays.CommonUtilities.ArrayOutput.printArray;

public class MergeSortedArraysType1 {
    public static void main(String[] args) {
        int[] a1 = takeInput();
        int[] a2 = takeInput();

        int m = a1.length;
        int n = a2.length;

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
}
