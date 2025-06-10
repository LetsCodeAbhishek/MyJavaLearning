public class twodPracticeQ{

    public static void Qone(int arr[][]){
        int count =0;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j]==7){
                    count++;
                }
            }
        }
        System.out.print("No. of 7's in Array "+count);
    }
    public static void Qtwo(int num[][]){
        // Approach 1.......

        // int row = 1 ;
        // int sum =0;
        // for(int i=0; i<num.length; i++){
        //     for(int j=0; j<num[0].length; j++){
        //         if(i==row){
        //             sum = sum + num[i][j];
        //         }
        //     }
        // }
        // System.out.println("sum of 2 row is: "+sum);

        // Approach 2..........

        // row =2
        int sum =0;
        for(int j=0; j<num[0].length; j++){
            sum = sum + num[1][j];
        }
        System.out.println("Sum of 2 row : "+ sum);
    }
// Write a program to Find Transpose of a Matrix:

    public static void Qthree(int num[][]){
        for(int j=0; j<=num[0].length; j++){
            for(int i=0; i<=num.length; i++){
                System.out.print(num[j][i]+ " ");
            }
            System.out.println();
        }
    }
    

    public static void main(String args[]){

        int[][] num = { {1,2,3},{4,5,6}};

        // int arr[][] ={{4,7,8,7,3}, {8,8,7,5,7}};
        // Qone(arr);
         
         
        //  for(int i=0; i<num.length; i++){
        //     for(int j=0; j<num[0].length; j++){
        //         System.out.print(num[i][j]+" ");
        //     }
        //     System.out.println();
        //  }

        Qthree(num);

    }
}