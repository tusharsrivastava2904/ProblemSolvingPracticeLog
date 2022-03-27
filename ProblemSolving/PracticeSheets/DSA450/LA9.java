package ProblemSolving.PracticeSheets.DSA450;

import java.util.Scanner;

public class LA9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(largefactorial(n));
    }

    private static long largefactorial(int n) {
        if(n==0) return 1;
        return n * largefactorial(n-1);
    }
}
