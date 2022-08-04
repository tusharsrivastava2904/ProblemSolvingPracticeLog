package ProblemSolving.InterviewQuestion2022.Hanu;

import java.util.Arrays;
import java.util.Scanner;

/* for a given placement drive 'n' numbers of students are ought to appear, the problem-solving capability of all students
are listed in a given array. For each student you need to find the number of students before them who have a higher
problem-solving capability than them.*/

public class ProblemSolvingCapability {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] psc = new int[n];
        for(int i=0; i<n; i++){
            psc[i] = sc.nextInt();
        }
        sc.close();

        int[] res = placement(n, psc);
        System.out.println(Arrays.toString(res));
    }

    private static int[] placement(int n, int[] psc) {
        int[] res = new int[n];
        int count;
        for(int i=0; i<n; i++){
            count=0;
            for(int j=0; j<i; j++){
                if(psc[i]<psc[j]){
                    count++;
                }
            }
            res[i] = count;
        }
        return res;
    }
}
