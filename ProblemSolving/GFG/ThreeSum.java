package ProblemSolving.GFG;

import java.util.HashSet;
import java.util.Scanner;

public class ThreeSum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(hasTriplet(arr, n, sum));
    }

    private static boolean hasTriplet(int[] arr, int n, int sum) {
        for (int i=0; i<n-2; i++){
            HashSet<Integer> hs = new HashSet<>();
            int curr_sum = sum-arr[i];
            for (int j=i+1; j<n; j++){
                if (hs.contains(curr_sum-arr[j])) return true;
                hs.add(arr[j]);
            }
        }
        return false;
    }
}
