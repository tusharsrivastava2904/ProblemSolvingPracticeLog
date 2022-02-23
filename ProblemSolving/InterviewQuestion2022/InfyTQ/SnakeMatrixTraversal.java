package ProblemSolving.InterviewQuestion2022.InfyTQ;

import java.util.ArrayList;
import java.util.Scanner;

/*
* (Tushar Srivastava)
* Problem stmt: Consider a matrix m X n matrix. where m>1 and n>1. Identify and print
*               outnum based on below logic.
*
*   1. Traverse the elements of matrix in a Snake like motion.
*       ->----->.
*       .<----<-.
*       ->----->.
*       .<----<-.
*   2. Add elements to tempArr in order of their occurrence until one of the following condition is true:
*       (a) the sum of elements in tempArr is a perfect square.
*       (b) all the elements of the original matrix are visited
*   3. Add the perfect square to sqNumArr.
*   4. If there is any element in the matrix, unvisited repeat Step 1 and Step 2 by re-initializing the
*      tempArr with empty array.
*   5. Assign the maximum perfect square to outnum.
*   6. If sqNumArr is empty, print -1, else print outnum.
*
* Test Case:
*   3
*   4,2
*   3,4
*   5,6
*   -------
*   9
*
* Explanation:
*   order of traversal: 4 -> 2 -> 4 -> 3 -> 5 -> 6
*   sqNum: [4, 9]
*   outNum: 9
* */

public class SnakeMatrixTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        sc.nextLine();
        int[][] matrix = new int[m][1000000];
        ArrayList<Integer> sqNums = new ArrayList<>();
        ArrayList<Integer> visited = new ArrayList<>();
        int sum = 0;

        for (int i=0; i<m; i++){
            String in = sc.nextLine();
            String[] str = in.split(",");
            for (int j=0; j<str.length; j++){
                matrix[i][j]=Integer.parseInt(str[j]);
            }
        }

        for (int i = 0; i < matrix.length; i++)
        {
            if (i % 2 == 0)
            {
                for (int j = 0; j < matrix[0].length; j++){
                    if (matrix[i][j]==-1){
                        continue;
                    }
                    if (isPerfectSq(sum)){
                        visited.add(matrix[i][j]);
                        sqNums.add(sum);
                        matrix[i][j]=-1;
                        visited.clear();
                        sum=0;
                        continue;
                    }
                    if (!isPerfectSq(sum)){
                        sum+=matrix[i][j];
                        visited.add(matrix[i][j]);
                        matrix[i][j] = -1;
                    }
                    if (j== matrix[0].length-1){
                        sum+=matrix[i][j];
                        visited.add(matrix[i][j]);
                        matrix[i][j] = -1;
                        break;
                    }
                }
            }
            else
            {
                for (int j = matrix[0].length - 1; j >= 0; j--){
                    if (matrix[i][j]==-1){
                        continue;
                    }
                    if (isPerfectSq(sum)){
                        visited.add(matrix[i][j]);
                        sqNums.add(sum);
                        matrix[i][j]=-1;
                        visited.clear();
                        continue;
                    }
                    if (!isPerfectSq(sum)){
                        sum+=matrix[i][j];
                        visited.add(matrix[i][j]);
                        matrix[i][j] = -1;
                    }
                    if (i==m-1&& j==0){
                        sum+=matrix[i][j];
                        visited.add(matrix[i][j]);
                        matrix[i][j] = -1;
                        break;
                    }
                }
            }
        }
        int outnum;
        if (sqNums.isEmpty()){
            outnum=-1;
        } else {
            int max = Integer.MIN_VALUE;
            for (int i:sqNums){
                if (i>max){
                    max=i;
                }
            }
            outnum = max;
        }
        System.out.println(outnum);
    }

    private static boolean isPerfectSq(int number) {
        for (int i=1; i*i<=number; i++)
        {
            if((number%i==0) && (number/i==i))
            {
                return true;
            }
        }
        return false;
    }
}
