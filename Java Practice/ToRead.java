import java.util.*;
public class ToRead{

    public static void reverseArray(int arr[]){
        int start = 0;
        int last = arr.length-1;
        while(start < last){
            int temp = arr[last];
            arr[last] = arr[start];
            arr[start] = temp; 

            start++;
            last--;
        }

        

    }
    public static void BinaryS(int arr[], int key, int start, int end){
        int n = arr.length-1;
        int i=0;
        while(i<n){
            int mid = (start+end)/2;

            if(arr[mid]== key){
                System.out.print("element is present "  +mid);
                return;
            }else if(key>arr[mid]){
                start = mid +1;
            }else{
                end = mid -1;
            }
            i++;
        }
        System.out.println("not found ");
    }
    public static void main(String args[]){

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a Number: ");
        // int x= sc.nextInt();
        // System.out.println(x);
 
        int arr[] = {2,4,6,8,10,12,19,20};
        reverseArray(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        // int key = 10;
        // BinaryS(arr,key,0, arr.length-1);
    

    }
}