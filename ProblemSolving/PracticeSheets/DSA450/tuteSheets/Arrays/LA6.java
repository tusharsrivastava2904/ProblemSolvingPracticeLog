package ProblemSolving.PracticeSheets.DSA450.tuteSheets.Arrays;

import java.util.HashSet;
import java.util.Scanner;

public class LA6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i=0; i<m; i++){
            b[i] = sc.nextInt();
        }

        HashSet<Integer> hs = new HashSet<>();
        for (int i:a){
            hs.add(i);
        }
        for (int i:b){
            hs.add(i);
        }
        System.out.println(hs);
        System.out.println(hs.size());

    }
}
