public class PracticeQandA{
    public static String[] stringSort(String [] arr, int si, int ei){
        if(si == ei){
            String[] A = {arr[si]};
            return A;
        }
        int mid = si + (ei-si)/2;
        String [] arr1 = stringSort(arr, si, mid);
        String [] arr2 = stringSort(arr, mid+1, ei);

        String [] arr3 = merge(arr1, arr2);
        return arr3;
    }
    static String[] merge(String[] arr1, String[] arr2){
        int m = arr1.length;
        int n = arr2.length;

        String[] arr3 = new String[m+n];
        int ind = 0;

        int i = 0;
        int j = 0;

        while(i<m && j<n){
            if( isCompare(arr1[i], arr2[j])){
                arr3[ind] = arr1[i];
                i++;
                ind++;
            }
            else{
                arr3[ind] = arr2[j];
                j++;
                ind++; 
            }
        }
        while(i<m){
            arr3[ind] = arr1[i];
            i++;
            ind++;
        }
        while(j<n){
            arr3[ind] = arr2[j];
            j++;
            ind++;
        }
        return arr3;

    }

    public static boolean isCompare(String str1, String str2){
        if(str1.compareTo(str2) < 0){
            return true;
        }
        return false;
    }
    //----------------------------------------------------
// Approach 1
    // public static int countMaxNum(int nums[]){
    //     int mid = nums.length/2;
    //     for(int i=0; i<nums.length; i++){
    //         int count =0;
    //         for(int j=0; j<nums.length; j++){
    //             if(nums[j]== nums[i]){
    //                 count+=1;
    //             }
    //         }
    //         if(count>mid){
    //             return nums[i];
    //         }
    //     }
    //     return -1;
    // }
// Approach 2
public static int majorityElement(int num[],int si, int ei){
    // base  case 

    if(si==ei){
        return num[si];
    }

    int mid = si + (ei-si)/2;
    int left = majorityElement(num, si, mid);
    int right = majorityElement(num, mid+1, ei);

    if(left == right){
        return left;
    }

    int leftCount = countInRange(num, left, si, ei);
    int rightCount = countInRange(num, right, si, ei);
    
    return leftCount > rightCount ? left : right ;

}
    public static int countInRange(int num[], int number, int si, int ei){
        int count = 0;
        for(int i=si; i<=ei; i++){
            if(num[i] == number){
                count++ ;
            }
        }
        return count;
    }
//---------------------------------------------------------------------------------
    // public static int getInvCount(int arr[]){
    //     int n = arr.length;
    //     int count = 0 ;
    //     for(int i=0; i<n-1;i++){
    //         for(int j=i+1; j<n; j++){
    //             if(arr[i]>arr[j]){
    //                 System.out.println(arr[i]+" , "+arr[j]);
    //                 count++;
    //             }
    //         }
    //     }
    //     return count;
    // }

    public static int getCount(int arr[], int left, int right){
        int intvcount = 0;
        if(right > left){
            int mid = (right+left) /2;
            intvcount = getCount(arr, left, mid);
            intvcount += getCount(arr, mid+1, right);
            intvcount += merge2(arr, left, mid+1, right);
    }   
    return intvcount;
    }

    public static int merge2(int arr[], int left, int mid, int right){
          int i = left, j = mid, k = 0;
          int invCount = 0;
          int temp[] = new int[(right - left + 1)];
           while ((i < mid) && (j <= right)) {
            if (arr[i] <= arr[j]) {
           temp[k] = arr[i];
           k++;
           i++;
            }
             else {
           temp[k] = arr[j];
          invCount += (mid - i);
         k++;
           j++;
         }
            } 
           while (i < mid) {
             temp[k] = arr[i];
           k++; 
           i++;
             }
            while (j <= right) {
          temp[k] = arr[j];
             k++;
              j++;
                   }    
          for (i = left, k = 0; i <= right; i++, k++) {
                arr[i] = temp[k];
                  }

    return invCount;
    }

    public static void main(String args[]){

        int arr[] = {1,20,6,4,5};
        int res = getCount(arr, 0, arr.length-1);
        System.out.print(res);


        // String arr[] = {"sun", "earth", "mars", "mercury"};
        // String a[] = stringSort(arr, 0, arr.length-1);

        // for(int i=0; i<a.length; i++){
        //     System.out.print(a[i]+" ");
        // }

        // int nums[] = {2,5,5};
        // System.out.println(countMaxNum(nums));

        //int num[] = {2,3,4,4,4,5,5};
        //int res = majorityElement(num, 0, num.length-1) ;
        //System.out.println(res+" ");
        // int res = getInvCount(arr);
        // System.out.println("inversion count "+res+" ");

    }
}