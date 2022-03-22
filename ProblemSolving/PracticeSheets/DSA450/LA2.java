package ProblemSolving.PracticeSheets.DSA450;

import java.util.Scanner;

public class LA2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        sc.close();

        int min = arr[0];
        int max = arr[0];
        for (int i: arr){
            if (i<min){
                min = i;
            }
            if (i>max){
                max = i;
            }
        }

        System.out.println("Min: "+min+" Max: "+max);
    }
}
