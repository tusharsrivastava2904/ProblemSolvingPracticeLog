package ProblemSolving;

import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h =10;
        int min = 30;
        int sec = 23;
        System.out.println(con(h, min, sec));
    }

    private static int con(int h, int min, int sec) {
        int res = 0;
        res = (h*3600) + (min*60) + sec;
        return res;
    }
}
