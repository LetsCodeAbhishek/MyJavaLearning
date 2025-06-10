import java.util.*;
public class inbuiltSort{
    public static void main(String args[]){
        int arr[] = {4,5,3,2,5,7,1};

         Arrays.sort(arr);
        // Arrays.sort(arr,0,3); 3 is not included.
        // Arrays.sort(arr,Collections.reverseOrder());

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}