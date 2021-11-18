import java.util.Scanner;

public class ArrayReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        int[] brr=reverseArr(arr);
        for(int i=0; i<arr.length; i++){
            System.out.println(brr[i]);
        }
    }

    private static int[] reverseArr(int[] arr) {
        int size= arr.length;
        //two pointer algo
        for(int i=size-1, j=0; j<i; i--, j++){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        return arr;
    }
}
