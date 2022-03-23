package ProblemSolving.PracticeSheets.DSA450;

import java.util.Arrays;
import java.util.Scanner;

public class LA4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] a= new int[n];
        for (int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        sc.close();

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(dnfSort(a)));
    }

    private static int[] dnfSort(int[] a) {
        int n = a.length;
        int low = 0;
        int mid = 0;
        int high = n-1;

        while(mid<=high){
            if(a[mid]==1){
                mid++;
            } else if(a[mid]==0){
                swap(a, mid, low);
                low++;
                mid++;
            } else if(a[mid]==2){
                swap(a, mid, high);
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
