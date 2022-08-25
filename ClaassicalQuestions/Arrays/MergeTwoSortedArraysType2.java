package ClaassicalQuestions.Arrays;

import static ClaassicalQuestions.Arrays.CommonUtilities.ArrayInput.takeInput;
import static ClaassicalQuestions.Arrays.CommonUtilities.ArrayOutput.printArray;

public class MergeTwoSortedArraysType2 {
    public static void main(String[] args) {
        int[] a1 = takeInput();
        int[] a2 = takeInput();
        int m = a1.length, n = a2.length;

        printArray(mergeSortedArrays(a1,a2));
    }

    // a1=[1, 4, 5]
    // a2=[2, 3, 5, 6, 7]
    // output: a1=[1, 2, 3]
    //         a2=[4, 5, 5, 6, 7]
    private static int[] mergeSortedArrays(int[] a1, int[] a2) {
        int[] res = new int[a1.length+ a2.length];


        return res;
    }
}
