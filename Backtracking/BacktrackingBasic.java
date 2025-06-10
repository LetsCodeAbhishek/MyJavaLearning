public class BacktrackingBasic{
 // Backtracking on Arrays...
    public static void changeArray(int arr[], int i, int val){
        // base case 
        if(i== arr.length){
            printArr(arr);
            return;
        }

        arr[i] = val;
        changeArray(arr,i+1,val+1);
        arr[i] = arr[i] - 2;

    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

// find subsets;
    public static void findSubset(String str, String ans, int i ){

        // base case 
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            
            return;
        }

        // yes 
        findSubset(str, ans + str.charAt(i), i+1);

        // No
        findSubset(str, ans, i+1);

    } 

    // Find Permutation

    public static void findPermutation(String str, String ans){

        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            String NewStr = str.substring(0,i) + str.substring(i+1);

            findPermutation(NewStr, ans+curr);
        }
    }

    public static void main(String args[]){
        // int arr[] = new int[5];
        // changeArray(arr, 0, 1);
        // printArr(arr);

        // String str = "abc";
        // findSubset(str, "", 0);

        String str ="abc";
        findPermutation(str, "");

    }
}