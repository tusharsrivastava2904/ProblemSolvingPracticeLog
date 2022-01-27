package ProblemSolving.LeetCode;

import java.util.Scanner;

//URL: https://leetcode.com/problems/richest-customer-wealth/
//find the wealthiest person from [[1, 2, 3], [3, 2, 1]] (1st person has 1+2+3=6 2nd person has 3=2+1=6)
public class RichestCustomerWealthArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] accounts = new int[m][n];
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                accounts[i][j]=sc.nextInt();
            }
        }
        int maxWealth = maximumWealth(accounts);
        System.out.println(maxWealth);
    }

    public static int maximumWealth(int[][] accounts) {
        int maxWealth = accounts[0][0];
        for(int i=0; i<accounts.length; i++){
            int sum=0;
            for(int j=0; j<accounts[i].length; j++){
                sum+=accounts[i][j];
            }
            if(sum>maxWealth){
                maxWealth=sum;
            }
        }
        return maxWealth;
    }
}
