import java.util.*;
public class ArrayLinearSe{

// Linear Search:
    // public static int Linear_Search(int number[], int key ){

    //     for(int i=0; i<number.length; i++){
    //         if(number[i]==key){
    //             System.out.println("the key is "+ key + " the Position of key is "+ i);
    //             return i;
    //         }
    //     }
    //     System.out.println();
    //      return -1;     
    // }
//--------------------------------------------------------------
// Largest Number of Array:
// Smallest Number of Array:
      
      public static int LargestArray(int number[]){
        int lar = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;

        for(int i=0; i<number.length; i++){
            if(lar<number[i]){
                lar = number[i];
            } 
            if(small>number[i]){
                small = number[i];
            }
        }
        System.out.println("Smallest number of Array: "+ small);
        return lar;
        
    
      }

    public static void main(String args[]){

        int number[] = {2,4,56,0,22,34,112};
        // int key = 11;
        // int index = Linear_Search(number,key);
        // System.out.println(key + " , "+ index);

        int re = LargestArray(number);
        System.out.println("Largest number of Array: "+ re);

    }



}