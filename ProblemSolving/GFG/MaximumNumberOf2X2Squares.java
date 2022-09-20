package ProblemSolving.GFG;

import java.util.Scanner;

public class MaximumNumberOf2X2Squares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        sc.close();

        System.out.println(findSquares(b));
    }

    private static int findSquares(int b) {
        //at any given level, the number of squares can be counted using formula:
        // (int) (length-2)/2  -> removing 1 square of base 2 units that forms triangle
        // and total number of the triangles thus becomes (SumOfAP(numberOfSqAtTheBase))

        int numberOfSquaresAtTheBase = (b-2)/2;
        return numberOfSquaresAtTheBase * (numberOfSquaresAtTheBase+1)/2; //sum of n natural numbers in AP
    }
}
