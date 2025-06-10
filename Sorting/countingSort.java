import java.util.*;
public class countingSort{

    public static void countingSort(int arr[] ){
        int lar = Integer.MIN_VALUE ;
        for(int i=0; i<arr.length; i++){
            lar = Math.max(lar, arr[i]);
        }
        int count[] = new int[lar+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]-- ;
            }
        }
        
       

        //to print
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        } 
    }

    public static void main(String args[]){
        int arr[] = {1,4,1,3,4,2,4,7};
        countingSort(arr);
        
    }
}











