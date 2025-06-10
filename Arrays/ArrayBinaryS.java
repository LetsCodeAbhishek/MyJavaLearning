public class ArrayBinaryS{

// Binary Search 
    // public static int BinarySearch(int number[], int key){
    //     int start= 0;
    //     int end = number.length-1;
    //     while(start<=end){
    //         int mid = (start+end )/2;
    //         if(number[mid]==key){
    //             return mid;
    //         }else if(number[mid]<key){
    //             start = mid + 1;
    //         }else{
    //             end = mid - 1;
    //         }
    //     }
    //     return -1;
    // }
//-------------------------------------------------------------
// Reverse an Array.
       
       public static void reverse(int number[]){
              int start = 0 ;
              int last = number.length-1;
              while(start<last){

                int temp = number[last];
                number[last]=number[start];
                number[start] = temp;

                start++;
                last--;
              }
       }
      

    public static void main(String args[]){
        int number[] = {2,4,6,8,10,12,14,16,18,20};
        // int key = 1 ;
        // int res = BinarySearch(number,key);
        // System.out.println("key is: "+ key +" at "+ res + " index ");
        reverse(number);

        for(int i=0; i<number.length; i++){
            System.out.print(number[i]+ " ");
        }
        System.out.println();

    }
}