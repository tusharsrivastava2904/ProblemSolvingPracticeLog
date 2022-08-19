package ProblemSolving.InterviewQuestion2022.TCS;

import java.util.Scanner;

/*Given n number of persons find the people who have a wrong entry i.e. not equivalent to that of the first element*/

public class AliceGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int[] d = new int[n];
        for (int i=0; i<n; i++){
            d[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(findWrong(n, d));
    }

    private static int findWrong(int n, int[] d) {
        int right = d[0];
        int count = 0;
        for (int i=1; i<n; i++){
            if(d[i]!=right) count++;
        }
        return count;
    }
}
