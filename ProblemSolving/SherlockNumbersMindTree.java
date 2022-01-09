package ProblemSolving;

import java.util.Scanner;

// Sherlock number: A number whose sum of digits is even
public class SherlockNumbersMindTree {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        for (int i=0; i<=n; i++){
            boolean res = isSherlockNumber(i);
            if (res){
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean isSherlockNumber(int i) {
        int sum=0;
        while(i>0){
            sum+=(i%10);
            i/=10;
        }
        if (sum%2==0){
            return true;
        }
        return false;
    }
}