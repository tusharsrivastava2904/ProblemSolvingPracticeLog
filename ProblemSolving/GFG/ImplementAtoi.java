package ProblemSolving.GFG;

import java.util.Scanner;

/* if string is a number return an integer number, else return -1
* don't use any in-built functions*/
public class ImplementAtoi {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        System.out.println(findAtoi(str));;
    }

    private static int findAtoi(String str) {
        boolean isPure  = true;
        boolean isNeg = false;
        if(str.charAt(0)=='-') isNeg = true;

        int[] res = new int[str.length()];
        if(isNeg==false){
            for(int i = 0; i<str.length(); i++){
                int ascii = (int) str.charAt(i);

                if(ascii>=48 && ascii<=57){
                    res[i] = ascii-48;
                } else return -1;
            }
        } else {
            for(int i = 1; i<str.length(); i++){
                int ascii = (int) str.charAt(i);

                if(ascii>=48 && ascii<=57){
                    res[i] = ascii-48;
                } else return -1;
            }
        }

        int num = 0;
        int pf = 0;
        for(int i=res.length-1; i>=0; i--){
            num+=res[i]*Math.pow(10, pf);
            pf++;
        }
        return (isNeg==true) ? (-1) * num : num;
    }
}
