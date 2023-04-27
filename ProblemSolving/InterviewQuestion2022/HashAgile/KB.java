package ProblemSolving.InterviewQuestion2022.HashAgile;

import java.util.ArrayList;
import java.util.Scanner;
/*
* Print the pattern for given integer
* n=6
* 1
* 2 2
* 3 3 3
* 5 5 5 5 5
* 8 8 8 8 8 8 8 8
* 13 13 13 13 13 13 13 13 13 13 13 13 13
* */

public class KB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

//        sequence formation (1, 2, 3, 5, 8,...)
        ArrayList<Integer> lst = new ArrayList<>();
        int sum=0;
        for(int i=1; i<=n; i++){
            if (i==1 || i==2){
                sum+=1;
                lst.add(sum);
            } else {
                int sum2 = lst.get(i-2) + lst.get(i-3);
                lst.add(sum2);
            }
        }
        System.out.println(lst);

//        pattern printing
        for(int i=0; i<n; i++){
            for (int j=0; j<lst.get(i); j++){
                if(j!=lst.get(i)-1){
                    System.out.print(lst.get(i)+" ");
                } else {
                    System.out.print(lst.get(i));
                }
            }
            System.out.println();
        }
    }
}
