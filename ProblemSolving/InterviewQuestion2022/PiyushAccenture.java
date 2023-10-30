package ProblemSolving.InterviewQuestion2022;

import java.util.Scanner;

public class PiyushAccenture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        sc.close();

        int s = s1.length()+s2.length();
        char[] charr = new char[s];
        String sm, bg;
        if(s1.length()<=s2.length()){
            sm=s1;
            bg=s2;
        } else {
            sm=s2;
            bg=s1;
        }

        int i=0;
        while(i<sm.length()){
            int asm = sm.charAt(i);
            int abg = bg.charAt(i);
            if(asm<abg){
                charr[i]=sm.charAt(i);
                charr[s-i-1]=bg.charAt(i);
            } else {
                charr[i]=bg.charAt(i);
                charr[s-i-1]=sm.charAt(i);
            }
            i++;
        }

        while(i<bg.length()){
            charr[i]=bg.charAt(i);
            i++;
        }

        StringBuilder sb = new StringBuilder();
        for(char c: charr){
            sb.append(c);
        }

        System.out.println(sb);
    }
}
