package ProblemSolving;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfArrayLeaders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        int[] arr = new int[t];
        for(int i=0; i<t; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(SumOfLeader(arr, t));

    }

    private static int SumOfLeader(int[] arr, int n) {
        int res = 0;
        ArrayList<Integer> brr = new ArrayList<Integer>();
        for(int i=0; i<n; i++){
            boolean isLeader = true;
            for (int j=i; j<n; j++){
                if(arr[i]<arr[j]) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                brr.add(arr[i]);
            }
        }

        for (int i = 0; i<brr.size(); i++){
            res+=brr.get(i);
        }
        return res;
    }
}
