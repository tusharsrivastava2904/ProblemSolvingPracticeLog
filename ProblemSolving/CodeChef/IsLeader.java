package ProblemSolving.CodeChef;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// leader: element in an array which has only smaller elements on its right
// find sol in O(n)
public class IsLeader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        findLeader(arr, n);
    }

    private static void findLeader(int[] arr, int n) {
        ArrayList<Integer> sol = new ArrayList<>();
        //starting from left you find any number bigger or equal to the current leader,
        // update the leader, and add to leaderList

        int leader = arr[n-1];
        sol.add(leader);
        for(int i=n-2; i>=0; i--){
            if(arr[i]>=leader){
                sol.add(arr[i]);
                leader=arr[i];
            }
        }
        Collections.reverse(sol);

        for (int i: sol){
            System.out.print(i+"\t");
        }
    }
}
