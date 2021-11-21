package ProblemSolving;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//WAP a fun() that accepts a +ve array of the size 'n'
//and returns the sum of all its leaders.
//leader: a num which is greater than all the elements to its right
//eg: 33 7 21 14 -> leaders = 33 21 14 -> SumLeader = 68
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
        Set<Integer> leaders = new HashSet<>();
        for(int i=0; i<n; i++){
            boolean isLeader = true;
            for (int j=i; j<n; j++){
                if(arr[i]<arr[j]) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                leaders.add(arr[i]);
            }
        }

        return res;
    }
}
