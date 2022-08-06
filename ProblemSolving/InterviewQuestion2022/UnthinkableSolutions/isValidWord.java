package ProblemSolving.InterviewQuestion2022.UnthinkableSolutions;

import java.util.Arrays;
import java.util.Scanner;

public class isValidWord {

    public static char[] ch1 = {'a','b','c','d','e','f','g','h','i','j','k','l','m'};
    public static char[] ch2 = {'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i=0; i<tc; i++){
            int n = sc.nextInt();
            String[] words = sc.nextLine().split(" ");
            boolean res = true;
            for (int j=1; j<n; j++){
                if(checkWord(words[j])){
                    continue;
                } else {
                    res = false;
                    break;
                }
            }
            if (res){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static boolean checkWord(String word) {
        char[] chars = word.toCharArray();
        int ascii = (int) chars[0];
        if (ascii>=65 && ascii<=91){
            for (int i=0; i<chars.length; i++){
                if (Arrays.binarySearch(ch1, chars[i])==-1){
                    continue;
                } else {
                    return false;
                }
            }
        }
        if (ascii>=97 && ascii<=123){
            for (int i=0; i<chars.length; i++){
                if (Arrays.binarySearch(ch2, chars[i])==-1){
                    continue;
                } else {
                    return false;
                }
            }
        }
        return true;

    }
}
