public class sortedAndRotated{
    public static int sorted(int arr[],int tar, int si, int ei){
        // base case 
        if(si>ei){
            return -1;
        }

        int mid = si + (ei-si)/2;
        //
        if(arr[mid]==tar){
            return mid;
        }

        if(arr[si] <= arr[mid]){
            if(arr[si]<=tar && tar<=arr[mid]){
                return sorted(arr, tar, si, mid-1);
            }else{
                return sorted(arr, tar, mid+1, ei);
            }
        }else{
            if(arr[mid]<= tar && tar <= arr[ei]){
                return sorted(arr, tar, mid+1, ei);
            }else{
                return sorted(arr, tar, si, mid-1);
            }
        }

    }
    public static void search(int arr[], int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                System.out.print( "key is on index " + i +" ");
             }
        }
        
    }
    public static void main(String args[]){
        int arr[] = {4,5,6,7,0,1,2};
        int key = 7;
        search(arr, key);


        // int res = sorted(arr, key, 0, arr.length-1);
        // System.out.print(res + " ");
    }
}