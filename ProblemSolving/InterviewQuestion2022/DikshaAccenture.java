package ProblemSolving.InterviewQuestion2022;

import java.util.Scanner;
// find the difference between the min and max element of arrA and arrB. Note: min, max should be chosen from different sets. Maximize difference.
public class DikshaAccenture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] a= new int[n];
        int[] b= new int[m];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        for (int i=0; i<m; i++){
            b[i]=sc.nextInt();
        }
        sc.close();

        System.out.println(findHighest(a, b));

    }

    private static int findHighest(int[] a, int[] b) {
        int minA = Integer.MAX_VALUE;
        int maxA = Integer.MIN_VALUE;

        int minB = Integer.MAX_VALUE;
        int maxB = Integer.MIN_VALUE;

        for(int i: a){
            if(i<minA) minA = i;
        }

        for(int i: b){
            if(i>maxA) maxA = i;
        }

        for(int i: a){
            if(i<minB) minB = i;
        }

        for(int i: b){
            if(i>maxB) maxB = i;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        if(minA==minB){
            if(maxA>maxB){
                max = maxA;
                min = minB;
            } else {
                max = maxB;
                min = minB;
            }
        }


        if(maxA==maxB){
            if(minA<minB){
                max = maxB;
                min = minA;
            } else {
                max = maxA;
                min = minB;
            }
        }

        if(minA<minB){
            min = minA;
            max = maxB;
        }

        return Math.abs(max-min);

    }
}
