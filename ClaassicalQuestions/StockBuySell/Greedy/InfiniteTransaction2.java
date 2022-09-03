package ClaassicalQuestions.StockBuySell.Greedy;

import java.util.Scanner;

/*Infinite transaction allowed (no overlapping transactions allowed)
* 1. consider buying date and selling date
* 2. keep moving the selling date until a dip is going to be encountered
* 3. Just before the dip, calculate profit as: price[sd] - price[bd]
* 4. update profit
* Note: Handle the last spike by an additional profit calculation call profit+=price[sd]-price[bd]
* */
public class InfiniteTransaction2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] price = new int[n];
        for(int i=0; i<n; i++){
            price[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(findMAxProfit(price, n));
    }

    private static int findMAxProfit(int[] price, int n) {
        int profit=0;
        int bd=0; //buying date
        int sd=0; //selling date

        for (int i=1; i<n; i++){
            //searching for new local maxima
            if (price[i]>=price[i-1]) sd++;

            //local maxima found... collecting profit... shifting bd and sd to current date
            else{
                profit+=price[sd]-price[bd];
                bd = sd = i;
            }
        }

        //handling last spike
        profit+=price[sd]-price[bd];

        return profit;
    }
}
