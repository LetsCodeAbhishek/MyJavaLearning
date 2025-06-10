import java.util.*;
public class Buy_sellStock{

    public static int BuyAndSell(int prices[]){

        int buyP = Integer.MAX_VALUE;
        int MaxProfit = 0;

        for(int i=0; i<prices.length; i++){
            // profit
            if(buyP < prices[i]){

                int profile = prices[i] - buyP; // today Profit
                MaxProfit = Math.max(MaxProfit, profile);

            }else{
                
                buyP = prices[i];
            }
        }
        return MaxProfit;

    }

    public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4};
        System.out.print("Max profit: "+ BuyAndSell(prices));

    }

}