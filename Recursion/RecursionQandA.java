public class RecursionQandA{
    public static void allOccurences(int arr[], int key, int i){
        //base case
        if(i== arr.length){
            return;
        }
        //recursive formula
        if(arr[i]==key){
            System.out.print(i+ " ");
        }
        allOccurences(arr, key, i+1);
    }

    static String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public static void printDigit(int n){
        //base case
        if(n==0){
            return;
        }
        // recursive formula
        int lastDigit = n%10;
        printDigit(n/10);
        System.out.print(digits[lastDigit]+" ");
    }

    public static int printString(String str){
        // base case
        if(str.length() == 0){
            return 0;
        }

        return printString(str.substring(1)) +1;
    }

    public static int countSubstr(String str, int i, int j, int n){
        // base case
        if(n==1){
            return 1;
        }
        if(n<=0){
            return 0;
        }

        int res = countSubstr(str, i+1, j, n-1)
                + countSubstr(str, i, j-1, n-1)
                - countSubstr(str, i+1, j-1, n-2);
        if(str.charAt(i) == str.charAt(j)){
            res++;
        }
        return res;
        
    }
    // tower of hanoi

       public static void towerOfHanoi(int n, String src, String helper, String dest) {
           if(n == 1) {
                    System.out.println("transfer disk " + n + " from " + src + " to " + dest);
                    return;
                      }
              //transfer top n-1 from src to helper using dest as 'helper'
              towerOfHanoi(n-1, src, dest, helper);
               //transfer nth from src to dest
               System.out.println("transfer disk " + n + " from " + src + " to " + dest);
              //transfer n-1 from helper to dest using src as 'helper'
              towerOfHanoi(n-1, helper, src, dest);
              }

    public static void main(String args[]){
        // int arr[] = {3,2,4,5,6,2,7,2,2};
        // int key = 2;
        // // allOccurences(arr, key, 0);
        // // printDigit(1234567890);
        // String str = "abhishek";
        // System.out.println(printString(str));

        // String str = "aba";
        // int n = str.length();
        // System.out.print(countSubstr(str, 0, n-1, n));

        int n=3;
        towerOfHanoi(n,"A", "B","C");

    }
}