package Striver.Patterns;

import java.util.Scanner;

//*******
// *****
//  ***
//   *
public class DownArrowTraingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){

            // space
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }

            // star
            for(int j=0; j< 2*n-((2*i)+1); j++){
                System.out.print("*");
            }

            // spacce
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }

            System.out.println();

        }

    }
}
