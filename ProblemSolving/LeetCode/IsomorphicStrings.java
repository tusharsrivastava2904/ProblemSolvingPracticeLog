package ProblemSolving.LeetCode;

import java.util.HashMap;
import java.util.Scanner;

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
