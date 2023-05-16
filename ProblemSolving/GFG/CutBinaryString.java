package ProblemSolving.GFG;

import java.util.Scanner;

// (POTD) https://practice.geeksforgeeks.org/problems/cutting-binary-string1342/1
// can be further optimized using DP table to store subsequent results of sub-string so that when required again,
// we can look up at them again, instead of recalculating for the same string

public class CutBinaryString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();

        System.out.println(cut(str));
    }

    private static int cut(String str) {
        int n = str.length();
        return findCut(str, 0, n-1);
    }

    private static int findCut(String str, int start, int end) {
        //when partition reaches the end of element so that the start of the
        // nxt string partition would cross the string length bound
        if (end<start) return 0;

        //in case of leading zero we don't need to check the part since it does not qualify
        else if (str.charAt(start)=='0') return -1;

        //if the whole string itself a power of 5 we don't need to cut it
        else if(isPowerOf5(str, start, end)) return 1;

        //computing the minimum desired-cut length for each index
        int ans  = Integer.MAX_VALUE;
        for (int i=start; i<=end; i++){
            //check if string start to the current index (left cut) is a power of 5
            if(isPowerOf5(str, start, i)){
                int secondPart = findCut(str, i+1, end);
                if (secondPart!=-1){
                    ans = Math.min(ans, 1+secondPart);
                }
            }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }

    //to check if the given string is a power of 5
    private static boolean isPowerOf5(String str, int start, int end) {
        long num=0, j=1;
        for (int i=end; i>=start; i--){
            if (str.charAt(i)=='1'){
                num+=j;
            }
            j*=2;
        }

        //all power of 5 recursively divide to give 1
        while(num>1){
            if (num%5!=0) return false;
            num/=5;
        }
        return true;
    }
}
