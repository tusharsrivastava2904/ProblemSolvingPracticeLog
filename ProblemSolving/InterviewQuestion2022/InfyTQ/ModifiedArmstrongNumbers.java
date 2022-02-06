package ProblemSolving.InterviewQuestion2022.InfyTQ;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

/*
* Problem Stmt:
*   1. Read csv values
*   2. concat each element with all the next elements one-by-one to form new numbers
*   3. check all these modified nos. and add them to final result array, if they are an Armstrong number
*   4. if the res arr is empty, print -1
*   5. else print the elements as csv
*   6. consider the first occurrence only, if the modified no. is repeated
*
* Test Cases:
*   15,3,1,70,53,71
*   ---------------
*   153,370,371
*
*   9,3,2,11,1
*   -----------
*   -1
*
* Explanation:
*   15,3,1,70,53,71
*   15: 153,151,1570,1553,1571
*   3: 31,370,353,371
*   1: 170,153,171
*   70: 7053, 7071
*   53: 5371
*
*   out of all these elements only 153,370,371 are armstrong nos.
* */

public class ModifiedArmstrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stringInput = sc.nextLine();
        String[] strInput = stringInput.split(",");
        ArrayList<Integer> nums = new ArrayList<>();
        LinkedHashSet<Integer> res = new LinkedHashSet<>();

        for (int i=0; i<strInput.length-1; i++){
            String num1 = strInput[i];
            for(int j=i+1; j<strInput.length; j++){
                String num2 = strInput[j];;
                String resNum = num1.concat(num2);
                nums.add(Integer.parseInt(resNum));
            }
        }

        for (Integer i: nums){
            if(isArmstrong(i)){
                res.add(i);
            }
        }

        Integer[] LHSarr = new Integer[res.size()];
        LHSarr = res.toArray(LHSarr);

        if (res.isEmpty()){
            System.out.println("-1");
        } else {
            for (int i=0; i<res.size(); i++){
                if (i==(res.size()-1)){
                    System.out.print(LHSarr[i]);
                } else {
                    System.out.print(LHSarr[i]+",");
                }
            }
        }

    }

    private static boolean isArmstrong(Integer i) {
        int originalNumber, remainder, result = 0;

        originalNumber = i;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == i)
            return true;
        return false;
    }

}
