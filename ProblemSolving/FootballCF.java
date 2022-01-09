package ProblemSolving;

import java.util.Scanner;

public class FootballCF {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();
        if(str.contains("1111111")||str.contains("0000000")){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
