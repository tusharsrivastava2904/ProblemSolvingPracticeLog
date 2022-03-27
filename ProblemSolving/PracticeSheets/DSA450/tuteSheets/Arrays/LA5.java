package ProblemSolving.PracticeSheets.DSA450.tuteSheets.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LA5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        sc.close();

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(groupNegative(a)));
    }

    private static int[] groupNegative(int[] a) {
        int n = a.length;
        int low = 0;
        int high = n-1;
        while (low<=high){
            if (a[low]<0){
                low++;
            } else {
                swap(a, low, high);
                high--;
            }
        }
        return a;
    }

    private static void swap(int[] a, int b, int c) {
        int temp = a[b];
        a[b] = a[c];
        a[c] = temp;
    }
}
