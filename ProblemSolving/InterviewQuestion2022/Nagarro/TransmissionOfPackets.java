package ProblemSolving.InterviewQuestion2022.Nagarro;

import java.util.Arrays;
import java.util.Scanner;

/*
* Question: Transfer each packet of data[] after encrypting it in the following way:
*           1. for the typeOfOperation[i] ->
*           2.      choose the number of packets that are to be modified and perform
*           3.      numberOfPackets[i]
*           4.      type 1 encryption -> if typeOfOperation[i] == 1
*                   type 2 encryption -> if typeOfOperation[i] == 2
*           5. return the modified data[]
*
*       Type 1 encryption:
*               1. XOR the first n elements (==numberOfPackets[i]) in the following way:
*                           element xor x[i]    (x-> array of numbers used for xor)
*       Type 2 encryption:
*               1. XOR the last n elements (==numberOfPackets[i]) in the following way:
*                           element xor x[i]    (x-> array of numbers used for xor)
*
* Test Case:
*           4
*           10 9 12 3   //data
*           2
*           1 2         // typeOfOperation
*           2 1         // numberOfPackets
*           5 10        // X[]
*           ---------------
*           15 12 12 9
*
* Explanation:
*           type[0] = 1 -> type1 encryption for first numberOfElements[0]=2 elements of data[]
*               => data[] = 15 12 12 3
*           type[1] = 2 -> type2 encryption for last numberOfElements[1]=1 elements of data[]
*               => data[] = 15 12 12 9
*
* */

public class TransmissionOfPackets {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        //data
        System.out.println("size of data");
        int n = sc.nextInt();
        System.out.println("--------------------------");
        int[] data = new int[n];
        System.out.println("data: ");
        for (int i=0; i<n; i++){
            data[i] = sc.nextInt();
        }
        System.out.println("--------------------------");

        // Q
        System.out.println("q: ");
        int q = sc.nextInt();
        System.out.println("--------------------------");

        // TypeOfOperation
        int[] typeOfOperation = new int[q];
        System.out.println("operation arr");
        for (int i=0; i<q; i++){
            typeOfOperation[i] = sc.nextInt();
        }
        System.out.println("--------------------------");

        // NumberOfPackets
        int[] numberOfPackets = new int[q];
        System.out.println("packet arr");
        for (int i=0; i<q; i++){
            numberOfPackets[i] = sc.nextInt();
        }
        System.out.println("--------------------------");

        // X
        int[] x = new int[q];
        System.out.println("x arr");
        for (int i=0; i<q; i++){
            x[i] = sc.nextInt();
        }
        System.out.println("--------------------------");
        sc.close();

        int[] encryptedData = encryptData(n, data, q, typeOfOperation, numberOfPackets, x);
        System.out.println(Arrays.toString(encryptedData));
    }

    private static int[] encryptData(int n, int[] data, int q, int[] typeOfOperation, int[] numberOfPackets, int[] x) {
        for (int i=0; i<q; i++){
            if (typeOfOperation[i]==1){
                for (int j=0; j<numberOfPackets[i]; j++){
                    int temp = data[j]^x[i];
                    data[j] = temp;
                }
            } else if(typeOfOperation[i]==2) {
                for (int j=n-1; j>=0 && numberOfPackets[i]>0; j++) {
                    int temp = data[j]^x[i];
                    data[j] = temp;
                    numberOfPackets[i]--;
                }
            }
        }
        return data;
    }
}
