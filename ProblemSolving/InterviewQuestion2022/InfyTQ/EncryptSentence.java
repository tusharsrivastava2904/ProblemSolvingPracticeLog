package ProblemSolving.InterviewQuestion2022.InfyTQ;

import java.util.ArrayList;
import java.util.Scanner;

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
            System.out.println("-1");
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
            System.out.println(outnum);
        }
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
