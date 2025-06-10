import java.util.*;
public class ArrayPairs{

// Array Pairs..
    // public static void array_pair(int number[]){
    //     for(int i=0; i<number.length; i++){
    //         for(int j=i+1; j<number.length; j++){
    //             System.out.print("( "+number[i]+" , "+number[j]+" )");
    //         }
    //         System.out.println();
    //     }
    // }
//-----------------------------------------------------
// Subarray ...
    //   public static void SubArray(int number[]){
    //     int ts = 0;
    //     int sum =0 ; 
    //     int tsum =0;  
    //     int max = Integer.MIN_VALUE;

    //     for(int i=0; i<number.length; i++){
                 
    //         for(int j=i; j<number.length; j++){
    //             sum=0;

    //             for(int k=i; k<=j; k++){
    //                 System.out.print(number[k]+" ");
    //                 // sum = sum + number[k];
    //                 // tsum = tsum + number[k];
                      
    //             }
    //             ts++;    
    //             System.out.println();
                
    //         }
    //         // if(max<sum){
    //         //     max=sum;
    //         // }
    //         //  System.out.println("Sum of subarrays: "+sum);

    //          System.out.println();
    //     }
    //     System.out.println("Total subarrays: "+ts);
    //     // System.out.println("Sum of subarrays: "+tsum);
    //     // System.out.println("max of subarrays: "+max);
    //   } 
//-----------------------------------------------------------------
// Max subarray Sum (Brute Force)..
      public static void Max_subarray(int num[]){
        int curSum =0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            int start = i;
            for(int j=i; j<num.length; j++){
                int end = j;
                curSum =0;
                for(int k=i; k<=j; k++){
                    System.out.print(num[k]+" ");
                    curSum = curSum + num[k];
                }
                System.out.println();
            }
            System.out.println("Sum of SubArray "+curSum +" ");
            if(maxSum<curSum){
                maxSum = curSum;
            }
            System.out.println();
        }
        
        System.out.println("Max of SubArray "+maxSum +" ");
        
      }
// --------------------------------------------------------
// max Subarray Sum (prefix sum)..
      public static void prefix_sum(int number[]){
        int curSum =0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];
        prefix[0] = number[0];

        for(int i=1; i<prefix.length; i++){
            prefix[i]= prefix[i-1] + number[i];
        }

        for(int i=0; i<number.length; i++){
            int start = i;
            for(int j=i; j<number.length; j++){
                int end = j;
                curSum = (start==0 ? prefix[end] : prefix[end]-prefix[start-1]);
                
            }
            System.out.println("Sum of SubArray "+curSum +" ");
            if(maxSum<curSum){
                maxSum = curSum;
            }
            System.out.println();
        }
        
        System.out.println("Max of SubArray "+maxSum +" ");
      }
//----------------------------------------------------------
// max Subarray sum (Kadane's algo..)
       
       public static void Kadane(int number[]){
        int ms = Integer.MIN_VALUE;
        int cs =0;
        for(int i=0; i<number.length; i++){
            cs = cs + number[i];
            if(cs<0){
                cs = 0;
            }
            ms = Math.max(cs , ms);
            System.out.println("Sum is: "+ cs);
        }
        System.out.println("Max Sum is: "+ ms);

       }

    public static void main( String args[]){
        int number[] = {1,-2,6,-1,3};
        // Max_subarray(number);
        // array_pair(number);
        //prefix_sum(number);
        Kadane(number);
    }
}