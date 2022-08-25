package ClaassicalQuestions.Arrays.CommonUtilities;

import java.util.Scanner;

public class ArrayInput {
    public static int[] takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arr: ");
        int m = sc.nextInt();
        int[] arr = new int[m];
        System.out.println("Enter the arr elements: ");
        for (int i=0; i<m; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }
}
