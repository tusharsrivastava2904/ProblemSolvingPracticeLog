package ProblemSolving.PracticeSheets.DSA450.tuteSheets.Arrays;

import java.util.Scanner;

public class LA8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        for (int i=0; i<n; i++){
            max_ending_here += arr[i];
            if (max_ending_here > max_so_far) {
                max_so_far = max_ending_here;
            }
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
        }
        System.out.println(max_so_far);
    }
}
