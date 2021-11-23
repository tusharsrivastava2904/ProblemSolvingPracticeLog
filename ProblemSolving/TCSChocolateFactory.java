package ProblemSolving;

import java.util.Arrays;
import java.util.Scanner;

//TCS problem: A chocolate factory is packing chocolates into the packets. The task is to move the empty packets at the end of the conveyor
//for eg: [6,0,1,8,0,2] has two empty packets so after moving them to the end of the conveyor belt we get -> [6,1,8,2,0,0]
public class TCSChocolateFactory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int j=0;
        for (int i=0; i<n; i++){
            int t = sc.nextInt();
            if(t!=0) {
                arr[j] = t;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
