package ProblemSolving.PracticeSheets.DSA450.tuteSheets.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LA7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        sc.close();

        System.out.println(Arrays.toString(a));

        for (int i=0; i<d; i++){
            leftRotate(a, d);
        }

        System.out.println(Arrays.toString(a));
    }

    private static void leftRotate(int[] a, int d) {
        int temp = a[0];
        for (int i=0; i<a.length-1; i++){
            a[i] = a[i+1];
        }
        a[a.length-1]=temp;
    }
}
