package ProblemSolving.InterviewQuestion2022.Nucleus;

import java.util.Arrays;
import java.util.Scanner;

public class DetectSeriesManas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int[] input2 = new int[input1];
        for (int i=0; i<input1; i++){
            input2[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(GetNextSeriesElement(input1, input2));
    }

    private static int GetNextSeriesElement(int input1, int[] input2) {
        if(isAP(input1, input2)) return findNextAPElement(input1, input2);
        if(isGP(input1, input2)) return findNExtGPElement(input1, input2);
        if(isFib(input1, input2)) return findNextFibElement(input1, input2);
        return -999;
    }

    private static int findNextFibElement(int input1, int[] input2) {
        return input2[input1-2] + input2[input1-1];
    }

    private static int findNExtGPElement(int input1, int[] input2) {
        return input2[input1-1] * (input2[1]/input2[0]);
    }

    private static int findNextAPElement(int input1, int[] input2) {
        return input2[input1-1] + (input2[1]-input2[0]);
    }

    private static boolean isFib(int input1, int[] input2) {
        for (int i: input2){
            if(checkPerfectSpuare((5*i*i)+4) || checkPerfectSpuare((5*i*i)-4)){
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    private static boolean checkPerfectSpuare(int i) {
        int s = (int) Math.sqrt(i);
        return (s*s == i);
    }

    private static boolean isGP(int input1, int[] input2) {
        if (input1==1) return true;

        Arrays.sort(input2);
        float r = input2[1]/input2[0];
        for (int i = 2; i < input1; i++) {
            if (input2[i] / input2[i - 1] != r)
                return false;
        }

        return true;
    }

    private static boolean isAP(int input1, int[] input2) {
        if (input1==1){
            return true;
        }
        Arrays.sort(input2);
        int d = input2[1] - input2[0];
        for (int i = 2; i < input1; i++) {
            if (input2[i] - input2[i - 1] != d) {
                return false;
            }
        }
        return true;
    }
}
