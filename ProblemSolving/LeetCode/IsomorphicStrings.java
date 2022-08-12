package ProblemSolving.LeetCode;

import java.util.HashMap;
import java.util.Scanner;

/*
* two strings are called isomorphic if each character follows sequential one-to-one mapping.
* for eg: s: egg t: add
* explanation: e-> a, g->d true
*
* s: foo t: bar
* f-> b, o-> a, o-> r false
* */

public class IsomorphicStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(isIsomorphic(s, t));
    }

    private static boolean isIsomorphic(String s, String t) {
        int n=s.length();
        HashMap<Character, Character> map = new HashMap<>();
        for (int i=0; i<n; i++){
            char chs = s.charAt(i);
            char cht = t.charAt(i);
            if (map.containsKey(chs)){
                if (map.get(chs)!=cht){
                    return false;
                }
            } else {
                if(map.containsValue(cht)){
                    return false;
                }
                map.put(chs, cht);
            }
        }
        return true;
    }
}
