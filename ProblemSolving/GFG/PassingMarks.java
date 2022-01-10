package ProblemSolving.GFG;

import java.util.Scanner;

//A student has appeared in an exam of 3 sub Bio, Che, Phy
//with a maximum of 80 marks. WAP a fun() that returns the sum
//of marks of the sub in which student has managed to pass the
//exam. The passing percentage is 40.00. (double)
public class PassingMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] mks = new int[3];
        for (int i=0; i<3; i++){
            mks[i] = sc.nextInt();
        }
        System.out.println(SumOfMarks(mks));
    }

    private static int SumOfMarks(int[] mks) {
        int sum=0;
        for(int i=0; i<mks.length; i++){
            double per;
            per = (double) (mks[i] * 100)/80;
            System.out.println(per);
            if(per>40){
                sum+=mks[i];
            }
        }
        return sum;
    }
}
