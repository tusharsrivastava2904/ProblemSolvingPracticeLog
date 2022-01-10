package ProblemSolving.GFG;

import java.util.Scanner;

//Deloitte: A math equation is represented as: num = (x1^p1) + (x2^p2) + ...    (25^2) + (2^1) + ...
// p1, p2, ... are single digit exponents
// by mistake the equation is written as: num = x1p1 + x2p2 + ...   (252) + (21) + ...
// find the real ans for the equation from the mistaken equation

public class DeloitteEquationSolver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        findEquation(arr, n);
    }

    private static void findEquation(int[] arr, int n) {
        int ans=0;

        for(int i=0; i<n; i++){
            int lastDigit = arr[i]%10;
            int remDigit = arr[i]/10;
            int pow = (int) Math.pow(remDigit, lastDigit);
            ans+=pow;
        }
        System.out.println(ans);
    }
}
