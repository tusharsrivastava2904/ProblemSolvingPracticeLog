package ProblemSolving.GFG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

/*
* Check if the IPv4 address is valid or not.
* Valid IPv4 address is of the form: (0-255).(0-255).(0-255).(0-255)
* Note: leading zeroes in any section are not allowed
* */

public class CheckIPAddress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        System.out.println(isValidIPv4(str));
    }

    private static boolean isValidIPv4(String str) {
        String[] comp = str.split("\\.",-1);
        int del = comp.length-1;
        ArrayList<Integer> arr = new ArrayList<>();
        for (String i: comp){
            //to avoid empty values in comp[] due to repeated delimiters
            if(Objects.equals(i, "")){
                continue;
            } else {
                //check if leading zero is present as first number
                if ( arr.size() !=0 && (isLeadingZeroes(i))){
                    return false;
                } else {
                    int x;
                    //parse to integer if the given string is a number
                    try {
                        x = Integer.parseInt(i);
                    } catch (NumberFormatException e) {
                        return false;
                    }
                    //if the string is a non-zero-leading, 0-255, and non-alphabetic string, we add it to arraylist
                    if (isLeadingZeroes(i)) return false;
                    if (x>=0 && x<=255){
                        arr.add(x);
                    }
                }
            }
        }

        //in an ideal IPv4 address, there should be 3 dots and 4 integer components
        if (arr.size()==4 && del==3) return true;
        return false;
    }

    private static boolean isLeadingZeroes(String i) {
        return i.charAt(0)=='0'&&i.length()!=1;
    }
}
