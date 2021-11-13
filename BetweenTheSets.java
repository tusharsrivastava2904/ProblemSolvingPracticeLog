import java.util.Scanner;

//find nos. between the arrays that are factors of all elements of second array --and-- all elements of first array are their factors
public class BetweenTheSets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("m: ");
        int m = sc.nextInt();   //size of 1st array
        System.out.println("n: ");
        int n = sc.nextInt();   //size of 2nd array

        int[] a = new int[m];
        int[] b = new int[n];

        //input for first array
        for (int i=0; i<m; i++) {
            System.out.println("enter the element for A: ");
            a[i]=sc.nextInt();
        }

        //input for second array
        for (int i=0; i<n; i++) {
            System.out.println("enter the element for B: ");
            b[i]=sc.nextInt();
        }

        //we find lcm of first arr
        int lcm_a = lcm(a);
        //we find gcd of second arr
        int gcd_b = gcd(b);

        //we count no. of multiples of LCM that evenly divide GCD
        int count = 0;
        //j is used as the multiplicator variable
        for (int i = lcm_a, j=2; i<=gcd_b; i=lcm_a*j ,j++) {
            if (gcd_b%i==0) {
                count++;
            }
        }

        System.out.println(count);

    }

    private static int lcm(int[] a) {
        int result = a[0];
        for (int i=0; i<a.length; i++){
            result = lcm(result, a[i]);
        }
        return result;
    }

    private static int lcm(int a, int b) {
        return a * (b / gcd(a, b));     //important relation: lcm(a, b) * gcd(a, b) = a * b
    }

    private static int gcd(int[] b) {
        int result = b[0];
        for (int i=0; i<b.length; i++){
            result = gcd(result, b[i]);
        }
        return result;
    }

    private static int gcd(int a, int b) {
        while (b>0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}
