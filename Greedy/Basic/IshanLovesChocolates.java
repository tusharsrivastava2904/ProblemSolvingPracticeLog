package Greedy.Basic;

import java.util.Scanner;

//url: https://practice.geeksforgeeks.org/problems/ishaan-loves-chocolates2156/1/?category
//taste level of each chocolate square = [3,5,6,1,9]
//sister asks for a square
//ishan being greedy eats all the tasty pieces first and gives the last remaining
//find the piece ishan gives away

//Time Comp: O(n)   Space Comp: O(1)
public class IshanLovesChocolates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        findBar(arr, n);
    }

    private static void findBar(int[] arr, int n) {
        int ans = arr[0];
        for (int i=0; i<n; i++){
            if (arr[i]<ans){
                ans = arr[i];
            }
        }
        System.out.println(ans);
    }
}
