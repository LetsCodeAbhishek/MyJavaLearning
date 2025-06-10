public class QuickSort{

    public static void Qsort(int arr[], int si, int ei){
        // base case 
        if(si>=ei){
            return;
        }
        // recursive formula
        //pivot 
        int pInd = partition(arr, si, ei);
        Qsort(arr, si, pInd-1); //left
        Qsort(arr, pInd+1, ei); //right

    }
    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si -1; // to create space
        for(int j=si; j<ei; j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
         return i; 
         
    }
    public static void printSort(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[] = {8,6,5,7,3,5,-7};
        Qsort(arr, 0, arr.length-1);
        printSort(arr);
        
    }
}