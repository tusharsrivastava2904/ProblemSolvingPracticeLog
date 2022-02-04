package ProblemSolving.GFG;

import java.util.Scanner;

//url: https://practice.geeksforgeeks.org/problems/equilibrium-index-of-an-array/1/?category[]=Arrays&category[]=Arrays&difficulty[]=0&page=1&query=category[]Arraysdifficulty[]0page1category[]Arrays
// Equilibrium index : sum of all lower index values == sum of all higher index values

public class EquilibriumIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findEquilibrium(arr));
    }
    private static int findEquilibrium(int[] arr) {
        int sumLow = 0;
        int sumHigh = 0;
        for (int i=0; i<arr.length; i++){
            sumLow+=arr[i];
        }
        for (int i=0; i<arr.length; i++){
            sumLow-=arr[i];
            if (sumLow==sumHigh){
                return i;
            }
            sumHigh+=arr[i];
        }
        return -1;
    }
}
