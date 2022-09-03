package ClaassicalQuestions.StockBuySell.Greedy;

import java.util.Scanner;

/* Only one transaction allowed to find max profit
*
* 1. Keep looking for global minima
* 2. At each point calculate profit_if_sold_today by subtracting global minima from price[today]
*       a. if profit_if_sold_today > max_profit, update max_profit
* 3. Return max_profit
* */
public class OneTransaction1 {
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
        int min_so_far = Integer.MAX_VALUE;
        int profit = 0;
        int pist = 0; //profit if sold today
        for (int i=0; i<n; i++){

            //new global minima
            if (price[i]<min_so_far){
                min_so_far=price[i];
            }
            //find profit if sold today
            pist = price[i] - min_so_far;

            //new global profit
            if (pist>profit) profit = pist;
        }
        return profit;
    }
}
