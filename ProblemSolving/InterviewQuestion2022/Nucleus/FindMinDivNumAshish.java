package ProblemSolving.InterviewQuestion2022.Nucleus;

import java.util.Scanner;

public class FindMinDivNumAshish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(findNum(n));
    }

    private static int findNum(int n) {
        int sum = findSum(n);
        for (int i=1; i<100; i++){
            if (i%n==0 && findSum(i)==sum && i!=n) return i;
        }
        return -1;
    }

    private static int findSum(int n) {
        int temp = n;
        int sum = 0;
        while(temp>0){
            sum+=(temp%10);
            temp/=10;
        }
        return sum;
    }
}
