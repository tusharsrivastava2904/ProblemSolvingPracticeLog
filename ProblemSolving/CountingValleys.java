//url: https://www.hackerrank.com/challenges/counting-valleys/problem?h_r=profile
package ProblemSolving;

import java.util.Scanner;

public class CountingValleys{
    public static int valley=0;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int steps = sc.nextInt();
        String path = sc.nextLine();

        int h=0;
        for(int i=0; i<path.length(); i++){
            h=findHeight(path.charAt(i), h);
        }
        System.out.println(valley);
    }

    private static int findHeight(char dir, int h) {
        int newHeight=h;
        //increasing the counter whenever height changes from negative to 0
        //logic works in this case because the trek always starts and ends at 0
        if(dir=='U'){
            newHeight++;
        } else if (dir=='D'){
            newHeight--;
        }

        if (h<0 && newHeight==0){
            valley++;
        }

        return  newHeight;
    }
}

