import java.util.*;
public class GreedyQ{

      public static void main(String args[]){

// Indian Coins 
    Integer coins[] = {1,2,5,10,20,50,100,500,2000};
    Arrays.sort(coins, Comparator.reverseOrder());

    int countOfCoins = 0;
    int amount = 600;

    ArrayList<Integer> ans = new ArrayList<>();

    for(int i=0; i<coins.length; i++){
        if(coins[i] <= amount){
            while(coins[i] <= amount){
                countOfCoins++;
                ans.add(coins[i]);
                amount -= coins[i];
            }
        }
    }
    System.out.println("Total Min coins = "+ countOfCoins);
    for(int i=0; i<ans.size(); i++){
        System.out.print(ans.get(i) + " ");
    }
    System.out.println();
// Max Length Chain of Pairs 
    // int pairs[][] = {{5,24}, {39,60}, {5,28}, {27,40}, {50,90}};

    // Arrays.sort(pairs , Comparator.comparingDouble(o -> o[1]));
    // int chainLean = 1;
    // int chainEnd = pairs[0][1];

    // for(int i=1; i<pairs.length ; i++){
    //     if(pairs[i][0] > chainEnd){
    //         chainLean++;
    //         chainEnd = pairs[i][1];
    //     }
    // }
    // System.out.println("Max Length = "+ chainLean);

 // Min Absolute Diff Pairs 
    // int A[] = {4,1,8,7};
    // int B[] = {2,3,6,5};

    // Arrays.sort(A);
    // Arrays.sort(B);

    // int minDiff = 0;

    // for(int i=0; i<A.length ; i++){
    //     minDiff += Math.abs(A[i] - B[i]);
    // }
    // System.out.println("Min Value : "+ minDiff);


// Fractional Knapsack
    //     int val[] = {60,100,120};
    //     int weight[] = {10,20,30};
    //     int w =50;

    //     double ratio[][] = new double [val.length][2];

    //     // oth col => idx ; 1st col => ratio

    //     for(int i=0; i<val.length; i++){
    //         ratio[i][0] = i;
    //         ratio[i][1] = val[i] / (double) weight[i];
    //     }

    //     // Ascending order
    //     Arrays.sort(ratio , Comparator.comparingDouble( o -> o[1]));
    //     int capacity = w;
    //     int finalVal = 0;

    //     for(int i = ratio.length-1; i>=0; i--){
    //         int idx = (int) ratio[i][0];
    //         if(capacity >= weight[idx]){
    //             finalVal += val[idx];
    //             capacity -= weight[idx];
    //         }else{
    //             // Include Tranctional Item 
    //             finalVal += ((ratio[i][1]) * capacity);
    //             capacity = 0;
    //             break;
    //         }
    //     }
    //      System.out.println("Final Value = " + finalVal ); 
    // }
   

    // public static void main(String args[]){
    //     int start[] = {10, 12, 20};
    //     int end[] = {20, 25, 30};

    //     // End time basics sorted

    //     int maxAct = 0;
    //     ArrayList<Integer> ans = new ArrayList<>();

    //     // 1st activity

    //     maxAct = 1;
    //     ans.add(0);
    //     int lastEnd = end[0];

    //     for(int i=1; i<end.length; i++ ){
    //         if(start[i] >= lastEnd){
    //             // Activity Select 
    //             maxAct++;
    //             ans.add(i);
    //             lastEnd = end[i];
    //         }
    //     } 

    //     System.out.println("Max Actvities = " + maxAct);

    //     for(int i=0; i<ans.size(); i++){
    //         System.out.print("A" + ans.get(i) +" ");
    //     }
    //     System.out.println();

    // }
}
}