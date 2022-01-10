package ProblemSolving.InterviewQuestion2022;

import java.util.ArrayList;
import java.util.Scanner;

// Fibonacci Series follow a very interesting property which we use here to check iif a number is a fibonacci num or not

// A number 'n' is a fibonacci number if and only if at least one of: [(5*n*n)+4] or [(5*n*n)-4] is a perfect square

//count the number of fibonacci numbers in the array

//driver code
public class FibonacciSequenceMindTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            arr.add(sc.nextInt());
        }
        int count = 0;
        for(int i=0; i<n; i++){
            if(isFibonacci(arr.get(i))){
                count++;
            }
        }
        System.out.println(count);
    }

//fibonacci check
    private static boolean isFibonacci(Integer n) {
        return isPerfectSquare((5*n*n)+4) || isPerfectSquare((5*n*n)-4);
    }

//perfect square check
    private static boolean isPerfectSquare(int i) {
        int sqrt = (int) Math.sqrt(i);
        return sqrt * sqrt == i;
    }
}
