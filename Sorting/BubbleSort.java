public class BubbleSort{

    public static void BubbleSort(int num[]){
        int swap=0;
        for(int i=0; i<num.length-1; i++){
            for(int j=0; j<num.length-1-i; j++){
                if(num[j]>num[j+1]){
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                    swap++;
                } 
            }
        }
        System.out.println(swap);

        for(int i=0; i<num.length; i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();

    }
    // public static void printArr(int arr[]){
    //     for(int i=0; i<arr.length; i++){
    //         System.out.print(arr[i]+" ");
    //     }
    //     System.out.println();
    // }


    public static void main(String args[]){

        int arr[]= {5,4,1,3,2};
        BubbleSort(arr);
        

    }
}