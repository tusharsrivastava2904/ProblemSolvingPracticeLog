package ProblemSolving.GFG;

import java.util.LinkedHashSet;
import java.util.Scanner;

// Remove duplicates from a string
// URL: https://practice.geeksforgeeks.org/problems/remove-duplicates3034/1/?category[]=Strings&category[]=Strings&page=1&query=category[]Stringspage1category[]Strings#

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        removeDuplicates(s);
        removeDuplicatesWithoutAuxSpace(s);
    }

    private static void removeDuplicates(String s) {
        LinkedHashSet<Character> hs = new LinkedHashSet<>();
        StringBuilder str= new StringBuilder();
        for (int i=0; i<s.length(); i++){
            hs.add(s.charAt(i));
        }
        for(Character c: hs){
            str.append(c);
        }
        System.out.println("Removed Duplicates with Auxiliary Space");
        System.out.println(str);
    }

    private static void removeDuplicatesWithoutAuxSpace(String s) {
        StringBuilder str= new StringBuilder();
        for (int i=0; i<s.length(); i++){
            if(!str.toString().contains(String.valueOf(s.charAt(i))))
                str.append(s.charAt(i));
        }
        System.out.println("Removed Duplicates without Auxiliary Space O(1)");
        System.out.println(str);
    }
}
