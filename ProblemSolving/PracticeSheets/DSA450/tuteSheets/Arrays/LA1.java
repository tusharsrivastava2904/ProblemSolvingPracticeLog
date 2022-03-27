package ProblemSolving.PracticeSheets.DSA450.tuteSheets.Arrays;

import java.util.Scanner;

public class LA1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        System.out.println("Reverse String: "+reverseString(str));
    }

    private static String reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i=str.length()-1; i>=0; i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
