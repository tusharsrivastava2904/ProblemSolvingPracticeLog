package ProblemSolving.CodeChef;

import java.util.Scanner;

//problem code: PALL01
public class PALL01 {
    public static void main (String[] args) throws java.lang.Exception
    {
        int t;
        Scanner sc = new Scanner(System.in);
        // your code goes here
        t = sc.nextInt();
        int[] arr = new int[t];
        for (int i=0; i<t; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<t; i++){
            if(isPallindrome(arr[i])==true) {
                System.out.println("wins");
            } else {
                System.out.println("loses");
            }
        }
    }

    public static boolean isPallindrome(int n){
        int rev=0;
        int val=n;
        while(n>0){
            rev=rev*10 + n%10;
            n/=10;
        }
        if(rev==val){
            return true;
        }
        return false;
    }
}
