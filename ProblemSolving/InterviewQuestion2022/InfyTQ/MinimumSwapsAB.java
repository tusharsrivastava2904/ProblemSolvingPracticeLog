package ProblemSolving.InterviewQuestion2022.InfyTQ;

import java.util.Objects;
import java.util.Scanner;

/*
* (Ritika)
* Problem Stmt: Consider a csv string which consists of only A and B (at least 1 of each)
*               Print outnum based on the following logic:
*   1. Find min swaps required to place all A adjacent to each other
*   2. outnum = min no. of swaps
*   3. Print -1 if no swaps are required
*
* Test Cases:
*   A,B,A,B,A
*   ---------
*   1
*
* Explanation:
*   - swap B at ind 1 with A at ind 0 res: B,A,A,B,A
*       and then swap B at ind 3 with A at ind 4 res: B,A,A,A,B (minSwap: 2)
*
*   or
*
*   - swap B at ind 3 with A at ind 0 res: B,B,A,A,A (minSwap: 1) -> outnum = 1
* */

public class MinimumSwapsAB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        String[] inarr = in.split(",");
        int outnum = minswaps(inarr, inarr.length);
        if(outnum==0){
            outnum = -1;
        }
        System.out.println(outnum);
    }

    private static int minswaps(String[] arr, int n) {
        int numA = 0;
        for (int i = 0; i < n; i++) {
            if (Objects.equals(arr[i], "A"))
                numA++;
        }
        int x = numA;
        int maxA = Integer.MIN_VALUE;
        int preCompute[] = new int[n];

        if (Objects.equals(arr[0], "A"))
            preCompute[0] = 1;
        for (int i = 1; i < n; i++) {
            if (Objects.equals(arr[i], "A")) {
                preCompute[i] = preCompute[i - 1] + 1;
            } else
                preCompute[i] = preCompute[i - 1];
        }

        for (int i = x - 1; i < n; i++) {
            if (i == (x - 1))
                numA = preCompute[i];
            else
                numA = preCompute[i] - preCompute[i - x];

            if (maxA < numA)
                maxA = numA;
        }
        int numB = x - maxA;
        return numB;
    }
}
