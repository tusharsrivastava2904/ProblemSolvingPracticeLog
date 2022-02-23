package ProblemSolving.InterviewQuestion2022.InfyTQ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
* (Adam)
* Problem stmt: Consider a String input instr (only lower-case alphabets),
*               identify nad print string outstr based on the following logic.
*   1. identify all vowels in instr, and add to outstr in lexicographical order.
*   2. Considering the first vowel 'fvowel' in outstr, find its first occurrence index in instr,
*      and append to outstr.
*       (if no vowels in instr add "NA" and append -1 in place of index)
*   3. identify all consonants in instr and append them to outstr in lexicographical order.
*   4. considering the last consonant in outstr, find its index of last occurrence in instr,
*      and append to outstr.
*       (if no consonants in instr add "NA" and append -1 in place of index)
*
* Test Case:
*   temperature
*   -----------
*   aeeeu6mprrtt7
*
*   rhythm
*   ------
*   NA-1hhmrty2
*
* Explanation:
*   -> vowels in temperature : eeaue -> outstr: aeeeu
*   -> fvowel: a -> ind: 6 -> outstr: aeeeu6
*   -> consonants in temperature: tmprtr -> outstr: aeeeu6mprrtt
*   -> lconsonant: t -> ind: 7 -> outstr: aeeeu6mprrtt7
* */

public class VowelsModified {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String instr = sc.nextLine();
        char[] chinstr = instr.toCharArray();
        StringBuilder outstr = new StringBuilder();
        ArrayList<Character> vowels = new ArrayList<>();
        ArrayList<Character> consonants = new ArrayList<>();
        for (char ch: chinstr){
            if (Character.isAlphabetic(ch)){
                if(isVowel(ch)){
                    vowels.add(ch);
                } else {
                    consonants.add(ch);
                }
            }
        }

        if (!vowels.isEmpty()){
            Collections.sort(vowels);
            char firstVowel = vowels.get(0);
            int firstVowInd = findFirstInd(firstVowel, chinstr);
            for (char ch: vowels){
                outstr.append(ch);
            }
            outstr.append(firstVowInd);
        } else {
            outstr.append("NA");
            outstr.append("-1");
        }

        if(!consonants.isEmpty()){
            Collections.sort(consonants);
            char lastConsonant = consonants.get(consonants.size()-1);
            int lastConsInd = findLastInd(lastConsonant, chinstr);
            for (char ch: consonants){
                outstr.append(ch);
            }
            outstr.append(lastConsInd);
        } else {
            outstr.append("NA");
            outstr.append("-1");
        }

        System.out.println(outstr);
    }

    private static int findLastInd(char lastConsonant, char[] chinstr) {
        for (int i=chinstr.length-1; i>=0; i--){
            if (chinstr[i]==lastConsonant){
                return i;
            }
        }
        return -1;
    }

    private static int findFirstInd(char firstCh, char[] chinstr) {
        for (int i=0; i<chinstr.length; i++){
            if (chinstr[i]==firstCh){
                return i;
            }
        }
        return -1;
    }

    private static boolean isVowel(char ch) {
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
        }
        return false;
    }
}
