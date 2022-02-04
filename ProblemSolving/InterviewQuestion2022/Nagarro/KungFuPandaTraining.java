package ProblemSolving.InterviewQuestion2022.Nagarro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
* Question: Po at a single move can eat a dumpling 'p' and all occurrences
*           of dumplings with value p+1 and p-1
*           For this step p points are awarded to Po
*           Find Max Point Po attains
*
* Test Case:
*          5
*          3 3 4 5 4
*          ---------
*          output -> 11
*
* Explanation:
*          eats 3 and all occurrence of 4 ->maxPoints = 3 -> remaining array = 3 5
*          eats 3 -> maxPoints = 6 -> remaining array = 5
*          eats 5 -> maxPoints = 11
* */

public class KungFuPandaTraining {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> dumplings = new ArrayList<>();
        for (int i=0; i<n; i++){
            dumplings.add(sc.nextInt());
        }
        int maxPoints = findMaxPoints(dumplings);
        System.out.println(maxPoints);
    }

    private static int findMaxPoints(ArrayList<Integer> dumplings) {
        int maxPoints = 0;
        for (int p=0; p<dumplings.size(); p++){
            maxPoints += dumplings.get(p);
            dumplings.remove(p);
            if (dumplings.contains(p+1)){
                dumplings.removeAll(Collections.singleton(p+1));
            }
            if (dumplings.contains(p-1)){
                dumplings.removeAll(Collections.singleton(p-1));
            }
        }
        return maxPoints;
    }
}
