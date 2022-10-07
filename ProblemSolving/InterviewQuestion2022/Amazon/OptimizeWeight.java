package ProblemSolving.InterviewQuestion2022.Amazon;

import java.util.Arrays;
import java.util.Scanner;


// given 'k' number of packages allowed, there already exists 'n' number of packages with ids from 1 to infinity
// find the min possible sum of ids that can fit in the shipment tank
// eg: k=7 n=5 parcels[] = {6, 5, 4, 1, 3}
// so req = 7-5 = 2
// minimum possible sum of ids can be achieved when we select min natural numbers that are not present in parcels i.e {2, 7}
// therefore minAdditionalSum to be returned = 2+7 = 9

public class OptimizeWeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   //number of element present
        int k = sc.nextInt();   //max element allowed
        int[] pkg = new int[n]; //already present elements
        for (int i=0; i<n; i++){
            pkg[i]=sc.nextInt();
        }

        int req = k-n;
        System.out.println(findMinWeightOfLoad(n,k,pkg,req));
    }

    private static int findMinWeightOfLoad(int n, int k, int[] pkg, int req) {
        int i=1;
        int ans=0;
        Arrays.sort(pkg);
        while(req!=0){
            if (isPresent(pkg, i)){
                i++;
            } else{
                ans+=i;
                req--;
                i++;
            }
        }
        return ans;
    }

    private static boolean isPresent(int[] pkg, int i) {
        for (int a: pkg){
            if(a==i) return true;
        }
        return false;
    }
}
