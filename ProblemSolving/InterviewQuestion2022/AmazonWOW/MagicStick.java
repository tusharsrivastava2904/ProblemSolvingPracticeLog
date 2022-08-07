package ProblemSolving.InterviewQuestion2022.AmazonWOW;

import java.util.Scanner;

/*
* you are given n number of magic sticks of different lengths. Your job is to increase or decrease the length of each
* stick to make their lengths equal. For increasing or decreasing each unit length the costs is given for each stick.
* calculate the minimum amount.
* */

public class MagicStick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] lengths = new int[n];
        int[] costs = new int[n];
        for(int i=0; i<n; i++){
            lengths[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            costs[i] = sc.nextInt();
        }

        int[] res_costs = new int[n];
        for (int i=0; i<n; i++){
            res_costs[i] = findCost(lengths[i], lengths, costs);
        }

        int ans = Integer.MAX_VALUE;
        for (int i=0; i<n; i++){
            if (res_costs[i]<ans){
                ans=res_costs[i];
            }
        }

        System.out.println(ans);
    }

    private static int findCost(int length, int[] lengths, int[] costs) {
        int cost = 0;
        for (int i=0; i<lengths.length; i++){
            cost += Math.abs(length-lengths[i]) * costs[i];
        }
        return  cost;
    }
}
