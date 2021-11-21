package ProblemSolving;

import java.util.Scanner;

//WAP a fun() to convert time in sec
public class TimeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h =sc.nextInt();
        int min = sc.nextInt();
        int sec = sc.nextInt();
        System.out.println(con(h, min, sec));
    }

    private static int con(int h, int min, int sec) {
        int res = 0;
        res = (h*3600) + (min*60) + sec;
        return res;
    }
}
