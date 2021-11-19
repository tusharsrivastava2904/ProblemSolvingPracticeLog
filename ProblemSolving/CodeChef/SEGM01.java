package ProblemSolving.CodeChef;

import java.util.Scanner;
//problem code: SEGM01
public class SEGM01 {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String[] test = new String[t];
        sc.nextLine();
        for(int i=0; i<test.length; i++){
            test[i] = sc.nextLine();
        }

        for(int i=0; i<test.length; i++){
            calculateConsecutive1(test[i]);
        }
    }

    public static void calculateConsecutive1(String str){
        int n = str.length();
        int ind = 0;
        int count = 0;
        while(ind<n){
            if(str.charAt(ind)=='1'){
                while(ind<n && str.charAt(ind)=='1' ){
                    ind++;
                }
                count++;
            } else {
                ind++;
            }
        }
        if(count==1){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
