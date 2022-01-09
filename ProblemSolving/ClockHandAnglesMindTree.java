package ProblemSolving;

import java.util.Scanner;

import static java.lang.Math.abs;

public class ClockHandAnglesMindTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();
        String hr = time.substring(0,2);
        String min = time.substring(3,5);
        int hrs = Integer.parseInt(hr);
        int mins = Integer.parseInt(min);

        // input validation
        if (hrs<0 || mins<0 || hrs>12 || mins>60)
            System.out.println("Wrong input");

        if (hrs==12)
            hrs=0;

        if (mins == 60) {
            mins = 0;
            hrs += 1;
        }

        if(hrs>12)
            hrs = hrs-12;

        System.out.println(findMinAngle(hrs, mins));
        sc.close();
    }

    private static int findMinAngle(int hrs, int mins) {
        int hrAngle = (int) (0.5*(hrs*60+mins)); //hr hand sweeps an angle of 30 deg in an hour
        int minAngle = mins * 6;             // min hand sweeps 6 deg in a min
        int angle = Math.abs(hrAngle-minAngle);
        angle = Math.min(angle, 360-angle);
        return angle;
    }
}
