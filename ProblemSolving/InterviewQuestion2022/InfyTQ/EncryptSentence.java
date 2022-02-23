package ProblemSolving.InterviewQuestion2022.InfyTQ;

import java.util.ArrayList;
import java.util.Scanner;

/*
* (Tushar Srivastava, Ashish)
* Problem Stmt: Consider a non-empty string input instr that consists of words and numbers,
*               separated by space. Print int outnum based on the following logic.
*
*   1. identify sum of last digits of all numbers.
*   2. set and print outnum with the:
*       a. identified 'sum' -> if sum is prime
*       b. reverse(sum) -> if reverse of sum is prime
*       c. else, numFactors(reverse(sum))
*   3. set outnum as -1 if there are no numbers in instr.
*
* Test Case:
*  a) There are 36 bulbs in the basket out of which 33 are blue and 3 are green
*   -------------------------------------------------------------------------
*   4
*
*  b) All is well
*   -----------
*   -1
*
* Explanation:
*  a) sum of last digits: 36, 33, 3 -> 6+3+3 = 12
*   12 is not prime, reverse of 12 i.e. 21 is not prime, so factor(21) -> 1, 3, 7, 21
*   therefore outnum = 4.
*
*  b) there are no numbers in the sentence so, outnum = -1
* */
public class EncryptSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String instr = sc.nextLine();
        String[] wordsAndNums = instr.split(" ");
        ArrayList<Integer> nums = new ArrayList<>();
        boolean isPureAlpha = true;
        int sum = 0;
        int outnum = 0;

        for (int i=0; i< wordsAndNums.length; i++){
            if (wordsAndNums[i].chars().allMatch(Character::isDigit)){
                nums.add(Integer.parseInt(wordsAndNums[i]));
                isPureAlpha = false;
            }
        }

        if (isPureAlpha){
            outnum=-1;
        } else {
            for (Integer i: nums){
                int lastDig = i%10;
                sum+=lastDig;
            }

            if (isPrime(sum)){
                outnum=sum;
            } else {
                if (isPrime(reverse(sum))){
                    outnum=reverse(sum);
                } else {
                    outnum=numFactors(reverse(sum));
                }
            }
        }
        System.out.println(outnum);
    }

    private static int numFactors(int reverse) {
        int res =0;
        for (int i=1; i<=reverse; i++){
            if (reverse%i==0){
                res+=1;
            }
        }
        return res;
    }

    private static int reverse(int sum) {
        int reverse = 0;
        while(sum != 0)
        {
            int remainder = sum % 10;
            reverse = reverse * 10 + remainder;
            sum = sum/10;
        }
        return reverse;
    }

    private static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        return true;
    }
}
