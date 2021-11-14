package ProblemSolving.CodeChef;

import java.util.Scanner;

//problem code: FIBXOR01
public class FIBXOR01 {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner scan = new Scanner(System.in);

        int testCases = scan.nextInt();
        for (int i = 0; i < testCases; i++) {
            int f = scan.nextInt();
            int s = scan.nextInt();
            int n = scan.nextInt();

            System.out.println(findFib(f, s, n));
        }
    }

    public static int findFib(int f, int s, int n) {
        if(n==0){
            return f;
        }

        if(n==1){
            return s;
        }

        if(n==2){
            return f^s;
        }

        return findFib(f, s, n%3);
    }
}
