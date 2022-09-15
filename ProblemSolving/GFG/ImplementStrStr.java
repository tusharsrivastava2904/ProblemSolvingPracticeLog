package ProblemSolving.GFG;

import java.util.Scanner;

public class ImplementStrStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String x = sc.next();
        sc.close();
        System.out.println(findString(s, x));
    }

    private static int findString(String s, String x) {
        int i=0, j=0;
        int count=0;
        while(i!=s.length() && j!=x.length()){
            if (s.charAt(i)==x.charAt(j)){
                if(count==0) count=i;
                j++;
            } else {
                i=count;
                j=0;
                count=0;
            }
            i++;
        }
        return (j==0)?-1:count;
    }
}
