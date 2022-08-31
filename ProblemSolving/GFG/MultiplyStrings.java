package ProblemSolving.GFG;

import java.util.Scanner;

public class MultiplyStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(MultStrings(s1, s2));
    }

    private static String MultStrings(String s1, String s2) {
        //handling zero number
        if (s1.equals("0") || s2.equals("0")) return "0";

        //handling negative numbers
        boolean minus = false;
        if(s1.charAt(0) == '-' && s2.charAt(0) == '-'){
            s1 = s1.substring(1);
            s2 = s2.substring(1);
        } else if(s1.charAt(0) == '-'){
            s1 = s1.substring(1);
            minus = true;
        } else if(s2.charAt(0) == '-'){
            s2 = s2.substring(1);
            minus = true;
        }

        //code to find the product
        int l1 = s1.length();
        int l2 = s2.length();

        int[] res = new int[l1+l2+1];
        int pf = 0; //power factor: used to adjust the iteration of 'k' pointer
        int i = l2-1;
        while(i>=0){
            int ival = s2.charAt(i) - '0';
            i--;

            int j = l1-1;
            int k = res.length - 1 - pf;

            int carry = 0;
            while(j>=0 || carry!=0){
                int jval = (j>=0) ? s1.charAt(j) - '0' : 0;
                j--;

                int prod = ival * jval + carry + res[k];
                res[k] = prod%10;
                carry = prod/10;
                k--;
            }
            pf++;
        }

        String ans = "";
        //handling leading zeroes
        boolean flag = false;
        //handling -ve numbers
        if(minus==true) ans+="-";
        for(int val: res){
            if(val==0 && flag==false){
                continue;
            } else {
                flag = true;
                ans+=val;
            }
        }

        return ans;
    }
}
