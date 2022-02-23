package ProblemSolving.InterviewQuestion2022.InfyTQ;

import java.util.Scanner;

/*
* (Puja)
* Problem Stmt: Consider string instr which consists of only 0s and 1s, and an int innum.
*               Print int outnum based on the following logic:
*   1. Starting from index: 0 in instr, with each ind as the starting point,
*      create all possible substr such that substr contains exactly innum number of 1s
*   2. Assign the count of all such substr to outnum
*   3. if there exists no such substr, print -1.
*
* Test Cases:
*   1110
*   4
*   ----
*   -1
*
* Explanation:
*   there exists no substr in instr that has 4 1s
* */

public class SubStrings01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String instr = sc.nextLine();
        int innum = sc.nextInt();

        int outnum = 0;
        for (int i=0; i<instr.length(); i++){
            StringBuilder substring = new StringBuilder();
            for (int j=i; j<instr.length(); j++){
                substring.append(instr.charAt(j));
                if (count1(substring)==innum){
                    outnum+=1;
                }
            }
        }

        if (outnum==0){
            outnum=-1;
        }
        System.out.println(outnum);
    }

    private static int count1(StringBuilder substring) {
        int num1 = 0;
        for (int i=0; i<substring.length(); i++){
            if (substring.charAt(i)=='1'){
                num1+=1;
            }
        }
        return num1;
    }
}
