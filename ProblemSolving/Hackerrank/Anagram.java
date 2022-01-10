package ProblemSolving.Hackerrank;/*
 * Tushar Srivastava
 * #100DaysOfCode
 * tusharsrivastava2904@gmail.com 
*/

//check for anagram Time Complexity: O(n)
import java.util.Scanner;

public class Anagram {

    static boolean isAnagram(String a, String b) {
        boolean res = true;
        int asc[] = new int[256];
        if(a.length()==b.length()){
            for(char c: a.toUpperCase().toCharArray()){
                int ind = (int) c;
                asc[ind]++;
            }
            for(char c: b.toUpperCase().toCharArray()){
                int ind = (int) c;
                asc[ind]--;
            }
            for(int i: asc){
                if(i!=0){
                    return false;
                }
            }
        } else {
            return false;
        }
        return res;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

