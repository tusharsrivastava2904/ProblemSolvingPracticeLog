package ProblemSolving.GFG;

import java.util.Scanner;

/*find smallest number whose factorial has n number of trailing zeroes*/
public class SmallestFactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(findNumber(n));
    }

    private static int findNumber(int n) {
        if (n==1) return 5;
        int low=0;
        int high=5*n;
        while(low<high){
            int mid = (low+high)/2;
            if(checkZero(mid, n)){
                high = mid;
            } else {
                low = mid+1;
            }
        }
        return low;
    }

    private static boolean checkZero(int mid, int n) {
        int count=0;

        int f=5;
        while(mid>=f){
            count+=mid/f;
            f*=5;
        }
        return (count>=n);
    }
}
