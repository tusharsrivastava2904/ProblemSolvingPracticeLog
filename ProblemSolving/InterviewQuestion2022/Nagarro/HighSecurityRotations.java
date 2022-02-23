package ProblemSolving.InterviewQuestion2022.Nagarro;

import java.util.Scanner;

public class HighSecurityRotations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in1 = sc.nextInt();
        int in2 = sc.nextInt();
        int[] origSeq = new int[in1];
        int[] changedSeq = new int[in1];
        int numFatalities = 0;
        for (int i=0; i<in1; i++){
            origSeq[i] = sc.nextInt();
        }
        for (int i=0; i<in2; i++){
            changedSeq[i] = sc.nextInt();
        }

        
    }
}
