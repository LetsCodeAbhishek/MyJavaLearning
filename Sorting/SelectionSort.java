public class SelectionSort{

    public static void SelectionSort(int arr[]){
         for(int i=0; i<arr.length-1; i++){
           int minV = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minV] >  arr[j]){
                    minV = j;
                }
            }
            int temp = arr[minV];
            arr[minV] = arr[i];
            arr[i] = temp;
         }
         for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
         }
    }

    public static void main(String args[]){
        int arr[] = {5,4,1,3};
        SelectionSort(arr);

    }
}