package ProblemSolving.InterviewQuestion2022.InfyTQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
* (Ishan)
* Problem stmt: For a given csv of string inarr, and two int num,
*               identify and print int outnum based on the following logic.
*   1. for each element of inarr, identify the count of max occurring char
*   2. starting from 2nd ele of inarr, for each ele of inarr, identify char
*      that occurs at index = prev ele count % len(current ele)
*   3. generate a tempStr by concatenating all such chars
*   4. identify the number of unique substrings that can be formed from tempStr such that,
*      len subStr is between innum1 and innum2 (both incl) = outnum
*
* Test Cases:
*   trees,of,apple
*   1
*   2
*   --------------
*   3
*
* Explanation:
*   - inarr: trees, of, apple
*   - highest occ char:
*       trees -> e -> count: 2
*       of -> count: 1
*       apple -> p -> count: 2
*   - from 2nd ele of inarr: index = prevEleCount(2) % currentEleLen(2) = 0 -> tempstr: "o"
*   - 3rd ele of inarr: index = prevEleCount(1) % currentEleLen(5) = 1 -> tempstr: "p"
*   - num of uniques subStr from "op" -> "o", "p" and "op" -> outnum: 3
* */

public class DecodeCharacterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String csv = sc.nextLine();
        int innum1 = sc.nextInt();
        int innum2 = sc.nextInt();
        String[] inarr = csv.split(",");
        String tempStr = "";
        ArrayList<String> tempSub = new ArrayList<>();
        int outnum=0;

        for (int i=1; i<inarr.length; i++) {
            int countCurrent = count(inarr[i]);
            int countPrevious = count(inarr[i-1]);

            int y = countPrevious % inarr[i].length();
            char el = inarr[i].charAt(y);
            tempStr+=el;
        }

        for (int i = 0; i <= innum1; i++) {
            for (int j = i+1; j <= innum2; j++) {
                tempSub.add(tempStr.substring(i,j));
                outnum+=1;
            }
        }

        System.out.println(outnum);

    }

    private static int count(String k) {
        char tempArray[] = k.toCharArray();
        Arrays.sort(tempArray);
        String s = new String(tempArray);
        int n = s.length();
        int max_count = 0;
        int count = 1;
        char ans = '-';
        for (int i = 1; i <= n; i++)
        {
            if ((i == n) || (s.charAt(i) != s.charAt(i - 1)))
            {
                if (max_count < count)
                {
                    max_count = count;
                    ans = s.charAt(i-1);
                }
                count = 1;
            }
            else
            {
                count++;
            }
        }
        return count;
    }
}
