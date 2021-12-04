package ProblemSolving;

import java.util.Scanner;

//for two given strings return the char of str2 which is present at least index of str1
//and if there is no common char present return -1
//eg: str1: abc     str2: cab       ->      a
public class MinIndexCommonChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        int minIndex = Integer.MAX_VALUE;

        for(int i=0; i<str2.length(); i++){
            for(int j=0; j<str1.length(); j++){
                if(str2.charAt(i)==str1.charAt(j) && j<minIndex){
                    minIndex=j;
                    break;
                }
            }
        }

        if (minIndex==Integer.MAX_VALUE){
            System.out.println("No char found");
        } else {
            System.out.println(str1.charAt(minIndex));
        }

        sc.close();
    }
}
