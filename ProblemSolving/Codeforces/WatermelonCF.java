package ProblemSolving.Codeforces;

import java.util.Scanner;

public class WatermelonCF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        scanner.close();
        if(n==2){
            System.out.println("NO");
        }
        else if(n!=2 && n%2==0){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
